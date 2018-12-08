package com.cm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.cm.pojo.Student;
import com.cm.pojo.StudentExample;

public interface StudentMapper {
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer sId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer sId);
    
    List<Student> selectByExampleWithClass(StudentExample example);

    Student selectByPrimaryKeyWithClass(Integer sId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}