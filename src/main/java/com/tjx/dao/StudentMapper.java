package com.tjx.dao;

import com.tjx.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface StudentMapper {

    Student selectStudentById(Serializable id);

    Student selectStudentById2(Serializable id);

    void addStudent(Student student);
}
