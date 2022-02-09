package dao;

import com.hello.dao.UserDao;
import com.hello.pojo.User;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class UserDaoTest {
    static Logger logger=Logger.getLogger(UserDaoTest.class);
    @Test
    public void test() {
        logger.info("info:进入了test");
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserDao mapper=sqlSession.getMapper(UserDao.class);
//        List<User> users=mapper.getUsers();
//        for(User u:users){
//            System.out.println(u);
//        }

//        System.out.println(mapper.getUserById(1,"123"));

        mapper.addUser(new User(6,"wangqianming","123"));

    }
    @Test
    public void testlog4j(){
        logger.info("info:进入了testlog4j");
        logger.debug("debug:进入了testlog4j");
        logger.error("error:进入了testlog4j");
    }
}
