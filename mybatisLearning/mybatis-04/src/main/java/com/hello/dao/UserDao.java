package com.hello.dao;

import com.hello.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    User getUserById(int id);//根据id查询用户

    List<User> getUserByLimit(Map<String,Integer> map);
}
