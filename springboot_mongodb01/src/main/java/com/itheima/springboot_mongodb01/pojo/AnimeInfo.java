package com.itheima.springboot_mongodb01.pojo;

import lombok.Data;
import org.junit.Test;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.core.mapping.TextScore;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_mongodb01.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-10-10 09:20:33
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
@Component
public class AnimeInfo {

    private AnimeInfo() {
        System.out.println("private AnimeInfo constructor init ...");
    }

    private String name;

    private String releaseTime;

    private String character01;

    private String character02;

    private String id;

    public AnimeInfo(String name, String releaseTime, String character01, String character02, String id) {
        this.name = name;
        this.releaseTime = releaseTime;
        this.character01 = character01;
        this.character02 = character02;
        this.id = id;
    }






}
