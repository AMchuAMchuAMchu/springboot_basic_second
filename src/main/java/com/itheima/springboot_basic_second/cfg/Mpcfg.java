package com.itheima.springboot_basic_second.cfg;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus02.cfg
 * CreateTime==>2022-09-27 16:22:03
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Configuration
public class Mpcfg {

    @Bean
    public MybatisPlusInterceptor getMpInterceptor(){
        MybatisPlusInterceptor mpi = new MybatisPlusInterceptor();
        mpi.addInnerInterceptor(new PaginationInnerInterceptor());
        return mpi;
    }

}
