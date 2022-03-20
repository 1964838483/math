package com.java.controller;

import com.java.entity.Admin;
import com.java.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class AdminController {
    @Autowired
    AdminService as;

    @RequestMapping("/login")
    public String login(Admin admin){
        int i = as.login(admin);
        if (i==1){
            System.out.println("登录成功");
            return "ok";
        }else {
            return "no";
        }
    }
}
