package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author : 赵静超
 * @date Date : 2019/9/28 0:20
 * @description : EurekaServer注册中心启动类
 */
@SpringBootApplication  //声明该类是springBoot的入口
@EnableEurekaServer     //声明该类是EurekaServer微服务，提供服务注册和服务发现功能，即注册中心
public class EurekaServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class,args);
    }
}
