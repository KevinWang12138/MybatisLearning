package com.hello.dao;

import com.hello.pojo.User;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.*;

public class UserDaoTest {
    @Test
    public void test() {
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserDao mapper=sqlSession.getMapper(UserDao.class);
//        List<User> userList=mapper.getUserList();
//        for(User user:userList){
//            System.out.println(user.getId()+user.getName()+user.getPwd());
//        }

//        User u=mapper.getUserById(1);
//        System.out.println(u.getName());

//        //增删改需要提交事务
//        mapper.addUser(new User(3,"王谦铭","20010821"));
//        //提交事务
//        sqlSession.commit();

//        mapper.update(new User(3,"哈哈","123456"));
//        sqlSession.commit();

//        mapper.deleteUser(3);
//        sqlSession.commit();

//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("userid",3);
//        map.put("username","lalalala");
//        map.put("userpassword","20010821");
//        mapper.addUser2(map);
//        sqlSession.commit();


//        Map<String,Object> map=new HashMap<String,Object>();
//        map.put("userid",1);
//        User user=mapper.getUserById2(map);
//        System.out.println(user.getName());

        List<User> l=mapper.getUserLike("%wa%");//模糊查询必须传递通配符
        //或者在sql中实现通配符
        for(User u:l){
            System.out.println(u.getName());
        }

    }
}
