package com.example.login.mapper;


import com.example.login.dao.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * UserInfoMapper
 * 继承baseMapper，可调用里面基本常用的数据库增删改查方法
 * 不需要自己写SQL语句
 * @author hxf
 * @create 2021-09-07 11:00
 */
@Mapper
public interface UserMapper{
    User selectById(int id);
    User selectByName(String username);
    User selectByEmail(String email);
    int insertUser(User user);
    int updateStatus(int id, int status);
    int updatePassword(int id, String password);
}
