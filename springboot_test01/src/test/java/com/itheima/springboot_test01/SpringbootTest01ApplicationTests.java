package com.itheima.springboot_test01;

import com.itheima.springboot_test01.test.AnimeName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@SpringBootTest
class SpringbootTest01ApplicationTests {




    @Autowired
    private String animeName;

    @Test
    void contextLoads() {


        System.out.println(this.animeName);

    }

}
