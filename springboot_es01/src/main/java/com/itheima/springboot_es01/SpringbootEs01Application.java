package com.itheima.springboot_es01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootEs01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootEs01Application.class, args);
    }

}
