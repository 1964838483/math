package com.java.service;

import com.java.entity.Admin;
import com.java.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdminServiceImp implements com.java.service.AdminService {

    @Autowired(required = false)
    AdminMapper adminMapper;

    @Override
    public int login(Admin admin) {
        System.out.println(admin);
        Admin admin1 = adminMapper.selectOne(admin);
        if (admin1!=null){
            return 1;
        }else {
            return 0;
        }

    }

}
