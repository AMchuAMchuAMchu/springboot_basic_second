package com.itheima.springboot_testmp;

import com.itheima.springboot_testmp.dao.AnimeInfoMapper;
import com.itheima.springboot_testmp.pojo.AnimeInfo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootTestmpApplicationTests {

    @Autowired
    private AnimeInfoMapper animeInfoMapper;

    @Test
    void testAnime(){
        List<AnimeInfo> animeInfos = animeInfoMapper.selectList(null);
        animeInfos.forEach(System.out::println);
    }

    @Test
    void contextLoads() {
    }

}
