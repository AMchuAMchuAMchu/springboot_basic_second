package com.itheima.springboot_log01.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_log01.controller
 * Version ==> 1.0
 * CreateTime ==> 2022-10-03 07:42:38
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@RequestMapping("/animeInfo")
@RestController
public class AnimeController {

    public static final Logger log = LoggerFactory.getLogger(AnimeController.class);

    @GetMapping
    public String getAnimeInfo(){
        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");
        return "<h1>Lycoris Recoil</h1>";
    }


}
