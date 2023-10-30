package com.zueb.mapper;

import com.zueb.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {
    int update(Teacher teacher);
}
