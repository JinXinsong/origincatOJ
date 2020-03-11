package com.origincat.oj.controller;

import com.origincat.oj.pojo.StudentClass;
import com.origincat.oj.servlet.StudentClassServlet;
import com.origincat.oj.servlet.impl.StudentClassServletImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class SignUpController {

    StudentClassServlet studentClassServlet;

    @Autowired
    public SignUpController(StudentClassServlet studentClassServlet){
        this.studentClassServlet = studentClassServlet;
    }


    @RequestMapping(value = "/signUp")
    public String signUp(Model model){
        List<StudentClass> studentClassList = studentClassServlet.selectAllStudentClass();
        model.addAttribute("studentClassList", studentClassList);
        return "SignUp";
    }
}
