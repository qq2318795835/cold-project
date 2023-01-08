package com.datamacy.coldadmin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.datamacy.coldadmin.dao")
@MapperScan(basePackages = "com.datamacy.coldadmin.dao")
@SpringBootApplication
@ServletComponentScan
//开启服务发现
@EnableDiscoveryClient
public class ColdAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ColdAdminApplication.class, args);
    }

}
