package com.itheima.springboot_setting;

import com.alibaba.druid.pool.DruidDataSource;
import com.itheima.springboot_setting.pojo.ServerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class SpringbootSettingApplicationTests {

    ConfigurableApplicationContext run = SpringApplication.run(SpringbootSettingApplication.class);



    @Test
    public void testDruidDataSource(){

        DruidDataSource bean = run.getBean(DruidDataSource.class);

        String driverClassName = bean.getDriverClassName();
        String username = bean.getUsername();
        String password = bean.getPassword();


        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(driverClassName);
        System.out.println(username);
        System.out.println(password);

    }


    @Autowired
    private ServerConfig serverConfig;

    @Test
    void contextLoads() {


        ServerConfig bean = run.getBean(ServerConfig.class);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(bean);
    }

}
