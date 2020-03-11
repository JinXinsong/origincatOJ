package com.origincat.oj.dao;

import com.origincat.oj.pojo.StudentClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface StudentClassDao {

    @Select("Select * from StudentClass")
    public List<StudentClass> selectAllStudentClass();
}