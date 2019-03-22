package com.tian.controller;

import com.tian.model.Student;
import com.tian.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

import java.util.ArrayList;
import java.util.List;

@Controller
public class StudentController {

    private  static final Logger log = LoggerFactory.getLogger(StudentController.class);
    @Resource
    private StudentService studentService;

    @RequestMapping(value = "/stu",
    method = RequestMethod.GET)
    public ModelAndView selectStudent(){

        //查全表根据工资降序排列
        List<Student> studentList = studentService.select();

        //取全部结果的工资前4位放置新list中
        List<Student> students = new ArrayList<>();
        for(int i =0;i <4; i++){
            students.add(studentList.get(i));
        }
        log.info("列表长度为 "+ students.size() +" 工资排名前4的是 "+students);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("students",students);
        modelAndView.setViewName("studentBody");
        return modelAndView;
    }
}
