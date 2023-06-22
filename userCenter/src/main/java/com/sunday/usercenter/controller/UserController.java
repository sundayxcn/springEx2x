package com.sunday.usercenter.controller;



import com.sunday.usercenter.vo.UserVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/all")
    public List<UserVO> findAllUsers() {
        String sql = "SELECT * FROM user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(UserVO.class));
    }

    @GetMapping("/log")
    public UserVO log(){
        log.info("findAllUsers");
        return null;
    }



}
