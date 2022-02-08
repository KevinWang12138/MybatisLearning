package com.hello.dao;

import com.hello.pojo.User;

import java.util.List;

public interface UserDao {
    User getUserById(int id);//根据id查询用户
}
