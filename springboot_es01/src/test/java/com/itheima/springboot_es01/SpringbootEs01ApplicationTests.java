package com.itheima.springboot_es01;

import com.google.gson.Gson;
import com.itheima.springboot_es01.dao.AnimeInfoMapper;
import com.itheima.springboot_es01.pojo.AnimeInfo;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.util.List;

@SpringBootTest
class SpringbootEs01ApplicationTests {


    @Autowired
    private RestHighLevelClient rhlc;


    @Autowired
    private AnimeInfoMapper animeInfoMapper;

    @Test
    void testMp(){


        List<AnimeInfo> animeInfos = animeInfoMapper.selectList(null);
        animeInfos.forEach(System.out::println);

    }

    @Test
    void testAll() throws IOException {

        AnimeInfo animeInfo = animeInfoMapper.selectById(1);


        Gson gson = new Gson();
        String s = gson.toJson(animeInfo);
        IndexRequest request = new IndexRequest().index("animes").id(animeInfo.getId().toString());
        request.source(s, XContentType.JSON);
        rhlc.index(request,RequestOptions.DEFAULT);






    }

    @Test
    void contextLoads() throws IOException {

        CreateIndexRequest request = new CreateIndexRequest("animes");
        rhlc.indices().create(request, RequestOptions.DEFAULT);

    }

    @AfterEach
    void testDown() throws IOException {
        rhlc.close();
    }

}
