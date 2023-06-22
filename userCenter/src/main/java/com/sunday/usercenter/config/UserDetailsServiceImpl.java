package com.sunday.usercenter.config;

import com.sunday.usercenter.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.weekend.Weekend;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        //查询数据库判断用户名是否操作，如果不存在就会抛出UsernameNotFoundException异常
        Weekend<com.sunday.usercenter.entity.User> userWeekend = new Weekend<>(com.sunday.usercenter.entity.User.class);
        userWeekend.weekendCriteria().andEqualTo(com.sunday.usercenter.entity.User::getName,name);
        com.sunday.usercenter.entity.User user = userMapper.selectOneByExample(userWeekend);
        if(user == null){
            throw new UsernameNotFoundException("用户名或者密码错误");
        }
        return new User(user.getName(), user.getPassword(), AuthorityUtils.commaSeparatedStringToAuthorityList("admin,normal"));
    }
}