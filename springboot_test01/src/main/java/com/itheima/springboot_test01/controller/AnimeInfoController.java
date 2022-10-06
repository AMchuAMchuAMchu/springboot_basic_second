package com.itheima.springboot_test01.controller;

import com.itheima.springboot_test01.pojo.AnimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.RequestWrapper;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_test01.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-06 08:40:53
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/animeInfo")
@RestController
public class AnimeInfoController {

    @Autowired
    private AnimeInfo animeInfo;


    @GetMapping("/text")
    public String getAnimeInfoText() {
        return "Lycoris Recoil";
    }

    @GetMapping("/json")
    public Object getAnimeInfoJson(){
        animeInfo.setName("Lycoris Recoil");
        animeInfo.setCharacter01("锦木千束/安济知佳");
        animeInfo.setCharacter02("井之上泷奈/若山诗音");
        animeInfo.setReleaseTime(2022);
        animeInfo.setId(5201314);
        return animeInfo;
    }



}
