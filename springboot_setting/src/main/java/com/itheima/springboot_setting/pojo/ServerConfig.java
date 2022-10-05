package com.itheima.springboot_setting.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DataSizeUnit;
import org.springframework.boot.convert.DurationFormat;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.util.unit.DataSize;
import org.springframework.util.unit.DataUnit;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Max;
import java.time.Duration;
import java.time.temporal.ChronoUnit;

/**
 * Description ==> TODO
 * BelongsProject ==> springboot_basic_second
 * BelongsPackage ==> com.itheima.springboot_setting.pojo
 * Version ==> 1.0
 * CreateTime ==> 2022-10-05 08:04:12
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Data
@Component
@ConfigurationProperties(prefix = "servers")
@Validated
public class ServerConfig {

    private String ipaddr;



    @Max(value = 9000,message = "死了ma吗???😂😂😂")
    private Integer port;


    @DurationUnit(ChronoUnit.DAYS)
    private Duration timeout;

    @DataSizeUnit(DataUnit.MEGABYTES)
    private DataSize size;




}
