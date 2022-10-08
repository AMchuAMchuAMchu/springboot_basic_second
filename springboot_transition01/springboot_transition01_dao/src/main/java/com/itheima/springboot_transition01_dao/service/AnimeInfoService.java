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

    public List<AnimeInfo> getAll(){

        List<AnimeInfo> all = animeInfoMapper.getAll();



        return all;

    }

}
