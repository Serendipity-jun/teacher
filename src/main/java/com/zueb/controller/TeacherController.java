package com.zueb.controller;


import com.zueb.pojo.Teacher;
import com.zueb.service.TeacherService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Resource
    private TeacherService teacherService;
    @PutMapping
    public String update(@RequestBody Teacher teacher){
        int c = teacherService.update(teacher);
        return "更新的"+c+"条数据";
    }

}
