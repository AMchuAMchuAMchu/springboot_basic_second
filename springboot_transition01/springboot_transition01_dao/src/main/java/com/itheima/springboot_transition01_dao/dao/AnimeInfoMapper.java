package com.itheima.springboot_transition01_dao.dao;

import com.itheima.springboot_transition01_dao.pojo.AnimeInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_transition01_dao.dao
 * Version ==> 1.0
 * CreateTime ==> 2022-10-09 07:03:11
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Mapper
public interface AnimeInfoMapper {

    @Select("select * from anime_info")
    List<AnimeInfo> getAll();
}
