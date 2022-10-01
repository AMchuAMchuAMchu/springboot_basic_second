//package com.itheima.springboot_basic_second.dao.impl;//package com.itheima.springboot_integrate_mybatisplus02.dao.impl;
//
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeService;
//import com.itheima.springboot_integrate_mybatisplus02.dao.AnimeService02;
//import com.itheima.springboot_integrate_mybatisplus02.pojo.AnimeInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * Description==>TODO
// * BelongsProject==>springboot_pom
// * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus02.dao.impl
// * CreateTime==>2022-09-28 07:17:53
// * Version==>1.0
// * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
// */
//@Service
//public class AnimeService02Impl extends ServiceImpl<AnimeService,AnimeInfo> implements AnimeService02 {
//
//    @Autowired
//    private AnimeService animeService;
//
//    @Override
//    public boolean insert(AnimeInfo animeInfo) {
//        return animeService.insert(animeInfo)>0;
//    }
//
//    @Override
//    public boolean delete(Integer id) {
//        return animeService.deleteById(id)>0;
//    }
//
//    @Override
//    public boolean modify(AnimeInfo animeInfo) {
//        return animeService.updateById(anim

//        eInfo)>0;
//    }
//
//    @Override
//    public AnimeInfo get(Integer id) {
//        return animeService.selectById(id);
//    }
//}
