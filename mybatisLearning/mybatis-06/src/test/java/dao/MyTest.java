package dao;

import com.hello.dao.StudentMapper;
import com.hello.dao.TeacherMapper;
import com.hello.pojo.Student;
import com.hello.pojo.Teacher;
import com.hello.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        SqlSession sqlSession= MybatisUtils.getSqlSession();
        StudentMapper mapper=sqlSession.getMapper(StudentMapper.class);
        List<Student> l=mapper.getStudent2();
        for(Student s:l){
            System.out.println(s);
        }
    }
}
