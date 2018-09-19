package com.tjx.dao;

import com.tjx.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    //if判断 根据用户传递对象中的属性值
    List<Student> selectInfoByIf(Student student);
    //where判断
    List<Student> selectInfoByWhere(Student student);
    //choose
    List<Student> selectInfoByChoose(Student student);
    //array
    List<Student> selectInfoByArray(int [] nums);
    //list
    List<Student> selectInfoByList(List<Integer> list);
    //list <对象>
    List<Student> selectInfoByListStu(List<Student> list);
    //Map
    List<Student> selectInfoByMap(@Param("map") Map<String,Object> map);
}
