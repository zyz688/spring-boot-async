package com.ze;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@EnableAsync//用注解的方式开启异步功能
@SpringBootApplication
public class SpringBootAsyncApplication {

    public static void main(String[] args) {

            SpringApplication.run(SpringBootAsyncApplication.class, args);
    }

}
