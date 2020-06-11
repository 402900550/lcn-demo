package com.test.lcn2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan(value = "com.test.lcn2.mapper")
@EnableFeignClients
public class Lcn2Application {

    public static void main(String[] args) {
        SpringApplication.run(Lcn2Application.class, args);
    }



}
