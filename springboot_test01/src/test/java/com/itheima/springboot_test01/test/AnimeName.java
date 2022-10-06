package com.itheima.springboot_test01.test;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_test01.test
 * Version ==> 1.0
 * CreateTime ==> 2022-10-06 08:14:00
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public class AnimeName {

    @Bean
    public String getAnimeName(){
        return "Lycoris Recoil";
    }

}
