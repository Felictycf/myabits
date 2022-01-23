package com.example.ssmpdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.ssmpdemo.mapper")
public class SsmpDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsmpDemoApplication.class, args);
    }

}
