package com.itheima.springboot_log01.log;

import com.itheima.springboot_log01.controller.AnimeController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_log01.log
 * Version ==> 1.0
 * CreateTime ==> 2022-10-03 08:03:56
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
public class LoggerPackage {

    public static Logger log;

    public LoggerPackage() {

        log = LoggerFactory.getLogger(this.getClass());

    }

}
