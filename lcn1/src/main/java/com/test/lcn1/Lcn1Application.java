package com.test.lcn1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@MapperScan("com.test.lcn1.mapper")
public class Lcn1Application {

    public static void main(String[] args) {
        SpringApplication.run(Lcn1Application.class, args);
    }

}
