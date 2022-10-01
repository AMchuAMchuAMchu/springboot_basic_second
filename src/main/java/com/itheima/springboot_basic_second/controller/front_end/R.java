package com.itheima.springboot_basic_second.controller.front_end;

import com.itheima.springboot_basic_second.pojo.AnimeInfo;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Description==>TODO
 * BelongsProject==>springboot_pom
 * BelongsPackage==>com.itheima.springboot_integrate_mybatisplus02.controller.front_end
 * CreateTime==>2022-09-28 08:45:08
 * Version==>1.0
 * Author==>02雪乃赤瞳楪祈校条祭制作委员会 wyq_start
 */
@Component
@Data
public class R {

    private boolean flag;

    private List<AnimeInfo> animeInfoList;

    public R(boolean flag, List<AnimeInfo> animeInfoList) {
        this.flag = flag;
        this.animeInfoList = animeInfoList;
    }

    public R(boolean flag) {
        this.flag = flag;
    }

    public R() {
    }
}
