package com.example.login.dao;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;
/**
 * 用户信息的实体类
 * @author hxf
 * @create 2021-09-07 10:56
 */

@Getter
@Setter
public class User {
    private int id;
    private String username;
    private String password;
    private String salt;//为了防止用户密码过于简单增加的一个数字
    private String email;
    private int type;//用户类型0普通用户 1 超级管理员 2版主
    private int status;// 用户状态，是否激活
    private String activationCode;
    private String headerUrl;//头像路径
    private Date createTime;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", email='" + email + '\'' +
                ", type=" + type +
                ", status=" + status +
                ", activationCode='" + activationCode + '\'' +
                ", headerUrl='" + headerUrl + '\'' +
                ", createTime=" + createTime +
                '}';
    }

}

