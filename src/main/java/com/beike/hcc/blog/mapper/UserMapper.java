package com.beike.hcc.blog.mapper;

import com.beike.hcc.blog.model.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper  {
    User selectUserById(Integer userId);
    User selectUserByName(String name);
    void deleteUserById(Integer userId);
    void updateById(User user);
    void insertUser(User user);




}
