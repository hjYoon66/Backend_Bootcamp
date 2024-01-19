package com.yoon.settingweb_boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@MapperScan("com.yoon.settingweb.dao")
public class SettingwebApplication {

    public static void main(String[] args) {
        SpringApplication.run(SettingwebApplication.class, args);
    }

}
