package com.itheima.springboot_basic_second.dao;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.itheima.springboot_basic_second.pojo.AnimeInfo;

import java.util.List;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus02.dao
 * CreateTime==>2022-09-27 18:06:10
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
public interface AnimeInfoService {

    boolean saveAnimeInfo(AnimeInfo animeInfo);

    boolean deleteById(Integer id);

    boolean updateByAnimeInfo(AnimeInfo animeInfo);

    AnimeInfo getAnimeInfoById(Integer id);

    List<AnimeInfo> getAllAnimeInfo();

    IPage<AnimeInfo> getAnimeInfoByPage(Integer currentPage,Integer pageSize);

}
