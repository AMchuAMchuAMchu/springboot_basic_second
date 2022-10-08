package com.itheima.springboot_transition01_dao.random;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_transition01_dao.random
 * Version ==> 1.0
 * CreateTime ==> 2022-10-09 07:32:21
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
@ConfigurationProperties(prefix = "animetest")
public class RandomTest {

    private int num01;
    private int num02;
    private String num03;
    private String num04;
    private long num05;

    public void printRandom(){

        System.out.println("num01"+num01);
        System.out.println("num02"+num02);
        System.out.println("num03K"+num03);
        System.out.println("num04"+num04);
        System.out.println("num05"+num05);

    }

}
