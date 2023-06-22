package com.sunday.usercenter.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User extends BaseDO{
    private Long id;
    private String name;
    private Long age;
    private Long phoneNum;
    private String password;
}
