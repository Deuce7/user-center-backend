package com.rzg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.rzg.mapper")
public class UsercenterApplication {


    public static void main(String[] args) {
        SpringApplication.run(UsercenterApplication.class, args);
    }

}
