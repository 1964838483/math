package com.java;

import com.java.mapper.AdminMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootApplicationTests {

    @Autowired
    AdminMapper am;
    @Test
    void contextLoads() {
        System.out.println(am);
    }

}
