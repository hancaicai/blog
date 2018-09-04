package com.beike.hcc.blog.service;

import com.beike.hcc.blog.model.User;

public interface UserService {

    //根据名字获取用户
    User selectUserByName(String name);
    //根据用户ID查询用户信息
     User selectUserById(Integer id);
    //修改用户信息
     void updateUser(User user);
    //删除用户信息
     void deleteUserById(Integer User);
    //添加用户信息
     void insertUser(User user);

}
