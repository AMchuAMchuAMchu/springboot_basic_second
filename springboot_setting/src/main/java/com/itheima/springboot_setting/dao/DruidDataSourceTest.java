package com.itheima.springboot_setting.dao;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.itheima.springboot_setting.pojo.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_setting.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-05 08:15:42
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public class DruidDataSourceTest {




    @Bean
    @ConfigurationProperties(prefix = "druiddatasource")
    public DataSource getDruidDataSource(){
        DruidDataSource druidDataSource = new DruidDataSource();
        return druidDataSource;
    }

}
