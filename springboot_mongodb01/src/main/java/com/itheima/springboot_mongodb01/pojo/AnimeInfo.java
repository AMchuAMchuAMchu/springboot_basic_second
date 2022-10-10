package com.itheima.springboot_mongodb01.pojo;

import lombok.Data;
import org.junit.Test;
import org.springframework.data.mongodb.core.mapping.TextScore;

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
public class AnimeInfo {


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

    @Test
    public void test() throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

        Date parse = sdf.parse("1665366523597");

        String format = sdf.format(parse);

        System.out.println(format);


    }





}
