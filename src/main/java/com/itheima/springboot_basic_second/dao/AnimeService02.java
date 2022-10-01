package com.itheima.springboot_basic_second.dao;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.springboot_basic_second.pojo.AnimeInfo;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus02.dao.impl
 * CreateTime==>2022-09-28 07:15:04
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public interface AnimeService02 extends IService<AnimeInfo> {

    boolean insert(AnimeInfo animeInfo);

    boolean delete(Integer id);

    boolean modify(AnimeInfo animeInfo);

    AnimeInfo get(Integer id);


}
