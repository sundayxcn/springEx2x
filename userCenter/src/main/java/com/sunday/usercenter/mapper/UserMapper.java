package com.sunday.usercenter.mapper;

import com.sunday.usercenter.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface UserMapper extends BaseTxMapper<User> {
}
