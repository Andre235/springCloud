package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author : 赵静超
 * @date Date : 2019/9/28 15:54
 * @description :
 */
@EnableZuulProxy //包含EnableZuulServer,生成网关代理，说明该类是网关启动类
@EnableAutoConfiguration  // 将所有符合条件的@Configuration配置类加载到Spring IOC容器中
public class ZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication.class,args);
    }
}
