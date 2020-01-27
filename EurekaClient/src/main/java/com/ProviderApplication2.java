package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : 赵静超
 * @date Date : 2019/9/28 0:40
 * @description : 1.服务提供者配置类
 *                2.将该服务提供者配置到注册中心
 */
@SpringBootApplication
public class ProviderApplication2 {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication2.class,args);
    }
}
