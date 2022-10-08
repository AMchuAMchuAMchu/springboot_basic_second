package com.itheima.springboot_transition01_dao.service;

import com.itheima.springboot_transition01_dao.dao.AnimeInfoMapper;
import com.itheima.springboot_transition01_dao.pojo.AnimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_transition01_dao.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-09 07:08:37
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class AnimeInfoService {


    @Autowired
    private AnimeInfoMapper animeInfoMapper;

    @Autowired
    private AnimeInfo animeInfo;


    public void insertOne() {

        animeInfo.setName("刀剑神域Alicization");

        animeInfo.setReleaseTime(2018);

        animeInfo.setCharacter01("尤吉欧");

        animeInfo.setCharacter02("Alici");

        animeInfo.setId(22);

        System.out.println("service execute....");

        System.out.println("尤吉欧...正在挥动着蓝蔷薇之剑...");

        animeInfoMapper.insertOne(animeInfo);

    }

    public List<AnimeInfo> getAll() {

        List<AnimeInfo> all = animeInfoMapper.getAll();

        System.out.println("service execute....");

        System.out.println("我是尤吉欧...我正在挥动着蓝蔷薇之剑...");

        return all;

    }

}
