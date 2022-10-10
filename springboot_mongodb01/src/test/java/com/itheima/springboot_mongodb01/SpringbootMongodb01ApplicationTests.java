package com.itheima.springboot_mongodb01;

import com.itheima.springboot_mongodb01.pojo.AnimeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;

import java.util.List;

@SpringBootTest
class SpringbootMongodb01ApplicationTests {


    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    void testFind(){

        List<AnimeInfo> all = mongoTemplate.findAll(AnimeInfo.class);

        all.forEach(System.out::println);


    }

    @Test
    void contextLoads() {
    }

}
