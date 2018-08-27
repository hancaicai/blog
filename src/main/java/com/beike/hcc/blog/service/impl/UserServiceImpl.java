package com.beike.hcc.blog.service.impl;

import com.beike.hcc.blog.mapper.UserMapper;
import com.beike.hcc.blog.model.User;
import com.beike.hcc.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private  UserMapper userMapper;
    @Override
    //根据用户ID查询用户信息
    public User selectUserById(Integer userId){
        User user=userMapper.seleteUserById(userId);

    }
    //修改用户信息
    @Override
    public void updateUser(User user){
        userMapper.updateById(user);

    }
    //删除用户信息
    @Override
    public void deleteUserById(Integer userId){
        userMapper.deleteUserById(userId);
    }
    //添加用户信息
    public void inserUser(User user){
        user.setregisterTime(new Date());
        userMapper.inserUser(user);
    }

}
