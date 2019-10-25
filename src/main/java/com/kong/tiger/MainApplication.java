package com.kong.tiger;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 系统主程序入口
 * @Author: Lianglei
 * @Date: Created on 2018/5/7
 * @Version V1.0
 */
@SpringBootApplication
@MapperScan("com.kong.tiger.dao")
public class MainApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
