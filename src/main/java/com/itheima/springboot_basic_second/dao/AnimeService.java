package com.itheima.springboot_basic_second.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.springboot_basic_second.pojo.AnimeInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus02.dao
 * CreateTime==>2022-09-27 16:08:18
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Mapper
public interface AnimeService extends BaseMapper<AnimeInfo> {
}
