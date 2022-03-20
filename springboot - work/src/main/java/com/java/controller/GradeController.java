package com.java.controller;


import com.java.entity.Math;
import com.java.service.MathService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class GradeController {
    @Autowired
    MathService mathService;


    @RequestMapping("/add")
    public String add(int grade,String adminName){
        int i = mathService.add(grade, adminName);
        if (i==1){
            System.out.println("增加成功");
            return "ok";
        }else {
            return "no";
        }
    }

    @RequestMapping("/find")
    public List<Math> find(String adminName){
        List<Math> list = mathService.selectAllById(adminName);
        return list;
    }
}
