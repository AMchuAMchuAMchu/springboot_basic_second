package com.itheima.springboot_test01;

import com.itheima.springboot_test01.test.AnimeName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

//@SpringBootTest(properties = {"test.prop=testValue02"},args = {"--test.prop=testValue03"})
@SpringBootTest
@Import(AnimeName.class)
class SpringbootTest01ApplicationTests {



    @Value("${test.prop}")
    private String testValue01;

    @Autowired
    private String animeName;




    @Test
    void testPropValue(){

        System.out.println("testValue::"+testValue01);

    }


    @Test
    void contextLoads() {


        System.out.println(this.animeName);

    }

}
