package com.itheima.springboot_setting;

import com.itheima.springboot_setting.dao.DruidDataSourceTest;
import com.itheima.springboot_setting.pojo.ServerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;

@SpringBootTest
class SpringbootSettingApplicationTests {

    ConfigurableApplicationContext run = SpringApplication.run(SpringbootSettingApplication.class);



    @Test
    public void testDruidDataSource(){

        DruidDataSourceTest bean = run.getBean(DruidDataSourceTest.class);

        DataSource druidDataSource = bean.getDruidDataSource();

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(druidDataSource);

    }

    @Test
    void contextLoads() {


        ServerConfig bean = run.getBean(ServerConfig.class);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(bean);
    }

}
