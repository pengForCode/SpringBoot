package com.example.bootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author Yu Peng
 * @Date 2019/11/26 22:27
 * @Version 1.0
 */
@SpringBootApplication
@MapperScan("com.example.bootdemo.dao")
public class ExamApp {
    public static void main(String[] args) {
        SpringApplication.run(ExamApp.class,args);
    }
}
