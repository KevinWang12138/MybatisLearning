package com.hello.dao;

import com.hello.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

public interface UserDao {
    @Select("select * from user")
    List<User> getUsers();
    @Select("select * from user where id = #{id}")
    User getUserById(@Param("id") int id,@Param("name")String name);
    @Select("insert into user(id,name,pwd) values (#{id},#{name},#{pwd})")
    void addUser(User user);
}
