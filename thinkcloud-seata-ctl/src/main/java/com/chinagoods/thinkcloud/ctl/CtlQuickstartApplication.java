package com.chinagoods.thinkcloud.ctl;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : zhangqian9158@gmail.com
 */
@SpringBootApplication
@EnableDubbo
public class CtlQuickstartApplication {
    public static void main(String[] args) {
        SpringApplication.run(CtlQuickstartApplication.class,args);
    }
}
