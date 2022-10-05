package com.itheima.springboot_setting.pojo;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

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
public class ServerConfig {

    private String ipaddr;

    private String port;

    private Integer timeout;





}
