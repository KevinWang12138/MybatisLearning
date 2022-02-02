package com.hello.dao;

import com.hello.pojo.User;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserDao mapper=sqlSession.getMapper(UserDao.class);
        List<User> userList=mapper.getUserList();
        for(User user:userList){
            System.out.println(user.getId()+user.getName()+user.getPwd());
        }
    }
}