package com.eaoa.jim;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.baomidou.mybatisplus.")
public class JimApplication {

    public static void main(String[] args) {
        //System.setProperty("server.port", "8081");
        SpringApplication.run(JimApplication.class);
    }

}
