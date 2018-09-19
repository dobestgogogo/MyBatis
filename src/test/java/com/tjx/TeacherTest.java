package com.tjx;

import com.tjx.dao.TeacherMapper;
import com.tjx.entity.Student;
import com.tjx.entity.Teacher;
import com.tjx.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class TeacherTest {
    SqlSession sqlSession = null;
    TeacherMapper mapper = null;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.getSession();
        mapper = sqlSession.getMapper(TeacherMapper.class);
    }

    @Test
    public void selectTeachersBySid(){
        Student stu = mapper.selectTeachersBySid(3);
        System.out.println(stu);
    }

    @Test
    public void selectStudentsByTid(){
        Teacher teacher = mapper.selectStudentsByTid(1);
        System.out.println(teacher);
    }
}
