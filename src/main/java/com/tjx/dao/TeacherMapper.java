package com.tjx.dao;

import com.tjx.entity.Student;
import com.tjx.entity.Teacher;

import java.io.Serializable;

public interface TeacherMapper {
    /**
     *根据学生编号查询 所有老师信息
     */
    Student selectTeachersBySid(Serializable id);
    /**
     *根据老师编号 查询所有学生
     */
    Teacher selectStudentsByTid(Serializable id);
}
