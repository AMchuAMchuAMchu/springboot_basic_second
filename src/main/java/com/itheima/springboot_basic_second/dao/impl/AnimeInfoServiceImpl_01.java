//package com.itheima.springboot_basic_second.dao.impl;//package com.itheima.springboot_integrate_mybatisplus02.dao.impl;
//
//import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
//import com.baomidou.mybatisplus.core.metadata.IPage;
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeInfoService;
//import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeService;
//import com.itheima.springboot_integrate_mybatisplus02.pojo.AnimeInfo;
//import org.apache.ibatis.annotations.Mapper;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * Description==>TODO
// * BelongsProject==>springboot_pom
// * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus02.dao.impl
// * CreateTime==>2022-09-27 18:10:43
// * Version==>1.0
// * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
// */
//@Service
//public class AnimeInfoServiceImpl implements AnimeInfoService {
//
//
//    @Autowired
//    private AnimeService animeService;
//
//    @Override
//    public boolean saveAnimeInfo(AnimeInfo animeInfo) {
//        return animeService.insert(animeInfo)>0;
//    }
//
//    @Override
//    public boolean deleteById(Integer id) {
//        return animeService.deleteById(id)>0;
//    }
//
//    @Override
//    public boolean updateByAnimeInfo(AnimeInfo animeInfo) {
//        return animeService.update(animeInfo,null)>0;
//    }
//
//    @Override
//    public AnimeInfo getAnimeInfoById(Integer id) {
//        return animeService.selectById(id);
//    }
//
//    @Override
//    public List<AnimeInfo> getAllAnimeInfo() {
//        return animeService.selectList(null);
//    }
//
//    @Override
//    public IPage<AnimeInfo> getAnimeInfoByPage(Integer currentPage, Integer pageSize) {
//        Page<AnimeInfo> aif = new Page<>(currentPage,pageSize);
//        Page<AnimeInfo> animeInfoPage = animeService.selectPage(aif, null);
//        return animeInfoPage;
//    }
//
//
//}
