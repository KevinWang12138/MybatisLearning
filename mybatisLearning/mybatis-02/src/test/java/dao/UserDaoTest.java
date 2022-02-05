package dao;

import com.hello.dao.UserDao;
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



    }
}
