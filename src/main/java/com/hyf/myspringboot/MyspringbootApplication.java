package com.hyf.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EnableSwagger2Doc  // swagger在线文档
//@EnableAsync
//@EnableScheduling
@SpringBootApplication
public class MyspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyspringbootApplication.class, args);
    }
}
