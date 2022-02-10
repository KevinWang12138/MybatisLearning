package com.hello.dao;

import com.hello.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {
    //获取指定id的老师，及其学生
    List<Teacher> getTeacher(@Param("tid") int id);
}
