package com.test.lcn2;

import com.codingapi.txlcn.tc.config.EnableDistributedTransaction;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan(value = "com.test.lcn2.mapper")
@EnableFeignClients
@EnableDistributedTransaction
public class Lcn2Application {

    public static void main(String[] args) {
        SpringApplication.run(Lcn2Application.class, args);
    }

}
