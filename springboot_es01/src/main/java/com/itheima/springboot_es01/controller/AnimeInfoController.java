package com.itheima.springboot_es01.controller;

import com.itheima.springboot_es01.dao.AnimeInfoMapper;
import com.itheima.springboot_es01.pojo.AnimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_es01.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-11 11:28:53
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Controller
@RequestMapping("/animeInfo")
public class AnimeInfoController {

    @Autowired
    private AnimeInfoMapper animeInfoMapper;

    @GetMapping("/id")
    public String testCache(String id){

        AnimeInfo animeInfo = animeInfoMapper.selectById(id);

        System.out.println(animeInfo);

        return animeInfo.toString();

    }


}
