package com.itheima.springboot_setting;

import com.itheima.springboot_setting.pojo.ServerConfig;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootTest
class SpringbootSettingApplicationTests {

    @Test
    void contextLoads() {

        ConfigurableApplicationContext run = SpringApplication.run(SpringbootSettingApplication.class);

        ServerConfig bean = run.getBean(ServerConfig.class);
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println(bean);
    }

}
