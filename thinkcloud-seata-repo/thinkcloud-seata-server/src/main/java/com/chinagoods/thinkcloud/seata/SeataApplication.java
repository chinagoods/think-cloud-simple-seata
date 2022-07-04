package com.chinagoods.thinkcloud.seata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : ZHANGQIAN
 * @email : zhangqian9158@gmail.com
 * @date : 2022/7/4 9:58
 */
@SpringBootApplication(scanBasePackages = { "io.seata" })
public class SeataApplication {

    public static void main(String[] args) {
        SpringApplication.run(io.seata.server.ServerApplication.class, args);
    }

}
