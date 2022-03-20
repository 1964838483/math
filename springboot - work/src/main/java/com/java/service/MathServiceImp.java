package com.java.service;

import com.java.entity.Admin;
import com.java.entity.Math;
import com.java.mapper.AdminMapper;
import com.java.mapper.MathMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MathServiceImp implements MathService {

    @Autowired(required = false)
    MathMapper mathMapper;

    @Autowired(required = false)
    AdminMapper adminMapper;

    @Override
    public int add(int grade,String adminName) {
        Admin admin = new Admin();
        admin.setAdminName(adminName);
        Admin admin1 = adminMapper.selectOne(admin);
        int i = mathMapper.insert(new Math(admin1.getAid(), grade));
        return i;
    }

    @Override
    public List<Math> selectAllById(String adminName) {
        Admin admin = new Admin();
        admin.setAdminName(adminName);
        Admin admin1 = adminMapper.selectOne(admin);
        Math math = new Math();
        math.setAdminId(admin1.getAid());
        List<Math> list = mathMapper.select(math);
        return list;
    }

}
