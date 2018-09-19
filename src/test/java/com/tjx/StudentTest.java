package com.tjx;

import static org.junit.Assert.assertTrue;

import com.tjx.dao.StudentMapper;
import com.tjx.entity.Student;
import com.tjx.utils.SqlSessionFactoryUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Unit test for simple App.
 */
public class StudentTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    SqlSession sqlSession = null;
    StudentMapper mapper = null;
    @Before
    public void before(){
        sqlSession = SqlSessionFactoryUtil.getSession();
        mapper = sqlSession.getMapper(StudentMapper.class);
    }

    @After
    public void after(){
        sqlSession.commit();
    }

    @Test
    public void selectStudentById(){
        Student stu = mapper.selectStudentById(1);
        System.out.println("First--------->>>>"+stu);
        stu = mapper.selectStudentById(1);
        System.out.println("Second--------->>>>"+stu);
    }

    @Test
    public void selectStudentById2(){
        Student stu = mapper.selectStudentById(1);
        System.out.println("First--------->>>>"+stu);
        stu = mapper.selectStudentById2(1);
        System.out.println("Second--------->>>>"+stu);
    }

    @Test
    public void addStudent(){
        Student stu = mapper.selectStudentById(1);
        System.out.println("First--------->>>>"+stu);
        mapper.addStudent(new Student(10,"aaaa"));
        stu = mapper.selectStudentById(1);
        System.out.println("Second--------->>>>"+stu);
    }
}
