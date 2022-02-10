import com.hello.dao.TeacherMapper;
import com.hello.pojo.Teacher;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class test {
    @Test
    public void teachertest(){
        SqlSession sqlSession=MybatisUtils.getSqlSession();
        TeacherMapper teacherMapper=sqlSession.getMapper(TeacherMapper.class);
        List<Teacher> l=teacherMapper.getTeacher(1);
        for(Teacher t:l){
            System.out.println(t);
        }
    }
}
