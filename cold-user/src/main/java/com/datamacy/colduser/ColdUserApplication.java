package com.datamacy.colduser;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.datamacy.colduser.**")
@MapperScan(basePackages = "com.datamacy.colduser.dao")
@SpringBootApplication
@ServletComponentScan
//开启服务发现
@EnableDiscoveryClient
public class ColdUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColdUserApplication.class, args);
    }

}
