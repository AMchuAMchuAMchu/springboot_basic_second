package com.itheima.springboot_transition01_dao;

import com.itheima.springboot_transition01_dao.pojo.AnimeInfo;
import com.itheima.springboot_transition01_dao.random.RandomTest;
import com.itheima.springboot_transition01_dao.service.AnimeInfoService;
import com.itheima.springboot_transition01_dao.service.JdbcTemplateTest01;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
//@Transactional
class SpringbootTransition01DaoApplicationTests {

    @Autowired
    private AnimeInfoService animeInfoService;


    @Autowired
    private RandomTest randomTest;


    @Autowired
    private JdbcTemplateTest01 jdbcTemplateTest01;

    @Test
    void testJdbcTemplate01(){

        jdbcTemplateTest01.testJdbc();

    }

    @Test
    void testRandomTest(){

        randomTest.printRandom();


    }

    @Test
    void testInsertOne(){

        animeInfoService.insertOne();

    }

    @Test
    void contextLoads() {

        List<AnimeInfo> all = animeInfoService.getAll();

        all.forEach(System.out::println);

    }

}
