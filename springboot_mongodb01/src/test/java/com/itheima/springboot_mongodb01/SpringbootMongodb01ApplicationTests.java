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
    void testInsert() {

        AnimeInfo animeInfo01 = new AnimeInfo(
                "刀剑神域SAO&ALO","2012","kirito","asuna","1"
        );
        AnimeInfo animeInfo02 = new AnimeInfo(
                "shadow house","2020","凯特","艾米丽可","2"
        );
        AnimeInfo animeInfo03 = new AnimeInfo(
                "Lycoris Recoil","2022","锦木千束","井之上泷奈","3"
        );
        AnimeInfo animeInfo04 = new AnimeInfo(
                "engage kiss","2022","修齐藤壮马","木更会泽纱弥","4"
        );
        AnimeInfo animeInfo05 = new AnimeInfo(
                "Alicization刀剑神域","2022","kirito","Alicization","5"
        );

        mongoTemplate.save(animeInfo01);
        mongoTemplate.save(animeInfo02);
        mongoTemplate.save(animeInfo03);
        mongoTemplate.save(animeInfo04);
        mongoTemplate.insert(animeInfo05);


    }

}
