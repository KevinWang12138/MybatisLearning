package dao;

import com.hello.dao.UserDao;
import com.hello.pojo.User;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;



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
}
