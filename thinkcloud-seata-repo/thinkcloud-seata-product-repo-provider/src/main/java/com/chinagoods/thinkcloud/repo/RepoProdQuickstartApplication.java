package com.chinagoods.thinkcloud.repo;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhangqian9158@gmail.com
 */
@EnableDubbo
@SpringBootApplication
@MapperScan(basePackages = {"com.chinagoods.thinkcloud.repo.mapper"})
public class RepoProdQuickstartApplication {
    public static void main(String[] args) {
        SpringApplication.run(RepoProdQuickstartApplication.class,args);
    }
}
