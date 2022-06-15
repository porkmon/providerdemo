package com.provider.example.providerdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@Configuration
@SpringBootApplication
@MapperScan("com.provider.example.providerdemo.mysql.mapper")
public class ProviderdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderdemoApplication.class, args);
        //ProviderdemoApplication ProviderdemoApplication=new ProviderdemoApplication();

    }

}
