package com.sunday.usercenter;

import com.sunday.usercenter.entity.User;
import com.sunday.usercenter.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class UserCenterApplicationTests {

    @Autowired
    UserMapper userMapper;

    @Test
    void contextLoads() {
        //userMapper
        User user = new User();
        user.setName("sunday");
        BCryptPasswordEncoder bCryptPasswordEncoder =new BCryptPasswordEncoder();
        user.setPassword(bCryptPasswordEncoder.encode("sunday1234"));
        user.setAge(18L);
        user.setPhoneNum(18018001800L);
        user.putCreateInfo(110L);
        userMapper.insertSelective(user);

    }

}
