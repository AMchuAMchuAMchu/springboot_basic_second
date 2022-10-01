package com.itheima.springboot_basic_second.pojo;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus02.pojo
 * CreateTime==>2022-09-27 16:04:17
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Component
@Data
public class AnimeInfo {

    private String name;

    private Integer releaseTime;

    private String character01;

    private String character02;

    private Integer id;


    public AnimeInfo() {
    }

    public AnimeInfo(String name, Integer releaseTime, String character01, String character02, Integer id) {
        this.name = name;
        this.releaseTime = releaseTime;
        this.character01 = character01;
        this.character02 = character02;
        this.id = id;
    }


}
