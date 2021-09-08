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
    private int id;//自增id做主键
    private String username;// 用户名
    private String password;// 密码
    private String salt;//为了防止用户密码过于简单增加的一个数字
    private String email;//邮箱
    private int status;// 用户状态，是否激活
    private String activationCode;//激活码
    private Date createTime;//版本控制

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", salt='" + salt + '\'' +
                ", email='" + email + '\'' +
                ", status=" + status +
                ", activationCode='" + activationCode + '\'' +
                ", createTime=" + createTime +
                '}';
    }

}

