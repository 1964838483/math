package com.java.service;


import com.java.entity.Admin;
import com.java.entity.Math;

import java.util.List;

public interface MathService {
    int add(int grade,String adminName);

    List<Math> selectAllById(String adminName);
}
