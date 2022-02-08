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
        User u=mapper.getUserById(1);
        System.out.println(u);
    }
    @Test
    public void testlog4j(){
        logger.info("info:进入了testlog4j");
        logger.debug("debug:进入了testlog4j");
        logger.error("error:进入了testlog4j");
    }
    @Test
    public void getUserByLimit(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        UserDao mapper=sqlSession.getMapper(UserDao.class);
        Map<String,Integer> map=new HashMap<>();
        map.put("startIndex",0);
        map.put("pageSize",2);
        List<User> list=mapper.getUserByLimit(map);
        for(User u:list){
            System.out.println(u);
        }
    }
}
