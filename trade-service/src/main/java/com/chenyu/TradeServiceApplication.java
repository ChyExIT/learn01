package com.chenyu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Classname ${NAME}
 * @Description TODO
 * @Date 2024/7/6 23:39
 * @Created by chenyu
 */
@SpringBootApplication
@MapperScan("com.chenyu.mapper")
public class TradeServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(TradeServiceApplication.class, args);
    }
}