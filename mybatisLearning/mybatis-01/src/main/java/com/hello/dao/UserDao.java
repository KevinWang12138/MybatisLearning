package com.hello.dao;

import com.hello.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> getUserList();//查询全部用户
    User getUserById(int id);//根据id查询用户
    void addUser(User user);//插入用户
    void update(User user);//修改用户
    void deleteUser(int id);//删除用户
    void addUser2(Map<String,Object> map);
    User getUserById2(Map<String,Object> map);
    List<User> getUserLike(String str);//模糊查询
}
