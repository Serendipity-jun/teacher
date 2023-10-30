package com.zueb.service;

import com.zueb.mapper.TeacherMapper;
import com.zueb.pojo.Teacher;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Resource
    private TeacherMapper teacherMapper;
    public int update(Teacher teacher) {
        return teacherMapper.update(teacher);
    }
}
