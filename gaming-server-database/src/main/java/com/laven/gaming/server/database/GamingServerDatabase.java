package com.laven.gaming.server.database;

import org.springframework.boot.SpringApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.laven.gaming.server.database.mapper")
public class GamingServerDatabase {
    public static void main(String[] args) {
        SpringApplication.run(SpringApplication.class, args);
    }
}
