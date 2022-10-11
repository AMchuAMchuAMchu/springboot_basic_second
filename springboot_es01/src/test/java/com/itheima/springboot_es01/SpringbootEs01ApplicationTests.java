package com.itheima.springboot_es01;

import org.elasticsearch.client.RestHighLevelClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootEs01ApplicationTests {


    @Autowired
    private RestHighLevelClient rhlc;

    @Test
    void contextLoads() {




    }

}
