package com.itheima.springboot_es01;

import com.google.gson.Gson;
import com.itheima.springboot_es01.dao.AnimeInfoMapper;
import com.itheima.springboot_es01.pojo.AnimeInfo;
import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.bulk.BulkRequest;
import org.elasticsearch.action.get.GetRequest;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexRequest;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.common.xcontent.XContentType;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHits;
import org.elasticsearch.search.builder.SearchSourceBuilder;
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
    void testQueryByCondition() throws IOException {

        SearchRequest request = new SearchRequest();

        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();

        searchSourceBuilder.query(QueryBuilders.termQuery("all","锦木千束"));

        request.source(searchSourceBuilder);

        SearchResponse search = rhlc.search(request, RequestOptions.DEFAULT);

        SearchHits hits = search.getHits();

        hits.forEach(System.out::println);


    }

    @Test
    void testGetAnime() throws IOException {

        GetRequest request = new GetRequest("animes","21");

        GetResponse documentFields = rhlc.get(request, RequestOptions.DEFAULT);

        String sourceAsString = documentFields.getSourceAsString();

        System.out.println(" >> "+sourceAsString);


    }



    @Test
    void testBulk() throws IOException {

        List<AnimeInfo> animeInfos = animeInfoMapper.selectList(null);


        BulkRequest bulk = new BulkRequest();

        animeInfos.forEach(item->{
            Gson gson = new Gson();
            String s = gson.toJson(item);
            IndexRequest animes = new IndexRequest().index("animes").id(item.getId().toString());
            animes.source(s,XContentType.JSON);
            bulk.add(animes);
        });

        rhlc.bulk(bulk,RequestOptions.DEFAULT);


    }



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
