package com.chinagoods.thinkcloud.ctl.controller;

import com.chinagoods.framework.thinkcloud.commons.response.ResponseResult;
import com.chinagoods.thinkcloud.biz.api.OrderService;
import com.chinagoods.thinkcloud.domain.Order;
import io.swagger.annotations.Api;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : ZHANGQIAN
 * @email : zhangqian1999@gmail.com
 * @date : 2022/5/3 21:15
 */
@Api(tags = "Order")
@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @DubboReference(version = "1.0.0")
    private OrderService orderService;

    @PostMapping("/add")
    public ResponseResult add(Long pid,int num){
        Order order = orderService.createOrder(1000L, pid, num);
        return  ResponseResult.success(order);
    }
}
