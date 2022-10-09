package com.itheima.springboot_transition01_dao.service;

import com.itheima.springboot_transition01_dao.pojo.AnimeInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_transition01_dao.service
 * Version ==> 1.0
 * CreateTime ==> 2022-10-09 08:22:59
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Service
public class JdbcTemplateTest01 {


    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Autowired
    private AnimeInfo animeInfo;

    public void testJdbc(){

        String sql = "select * from anime_info";

        List<AnimeInfo> animeInfos = jdbcTemplate.query(sql, new RowMapper<AnimeInfo>() {
            @Override
            public AnimeInfo mapRow(ResultSet rs, int rowNum) throws SQLException {

                animeInfo.setName(rs.getString("name"));
                animeInfo.setReleaseTime(rs.getInt("release_time"));
                animeInfo.setCharacter01(rs.getString("character01"));
                animeInfo.setCharacter01(rs.getString("character02"));
                animeInfo.setId(rs.getInt("id"));

                return animeInfo;
            }
        });

        animeInfos.forEach(System.out::println);

    }


}
