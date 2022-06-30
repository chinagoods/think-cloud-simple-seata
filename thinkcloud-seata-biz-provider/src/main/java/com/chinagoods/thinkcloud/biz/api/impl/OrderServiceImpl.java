package com.chinagoods.thinkcloud.biz.api.impl;

import com.chinagoods.thinkcloud.biz.api.OrderService;
import com.chinagoods.thinkcloud.domain.Order;
import com.chinagoods.thinkcloud.repo.api.OrderRepository;
import com.chinagoods.thinkcloud.repo.api.ProductRepository;
import com.chinagoods.thinkcloud.repo.api.UmsUserRepository;
import io.seata.spring.annotation.GlobalTransactional;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author : ZHANGQIAN
 * @email : zhangqian1999@gmail.com
 * @date : 2022/5/3 20:22
 */
@DubboService(version = "1.0.0")
public class OrderServiceImpl implements OrderService {

    @DubboReference(version = "1.0.0")
    private OrderRepository orderRepository;

    @DubboReference(version = "1.0.0")
    private ProductRepository productRepository;

    @DubboReference(version = "1.0.0")
    private UmsUserRepository umsUserRepository;


    @Override
    @GlobalTransactional
    public Order createOrder(Long userId, Long productId, Integer num) {
        Order order=new Order();
        order.setNum(num).setOrderNo("T"+System.currentTimeMillis()).setProductId(productId).setSubject("订单商品标题"+num);
        order = orderRepository.saveDomain(order);
        umsUserRepository.pay(userId,1L);
        productRepository.updateProductStock(productId,num);
        return order;
    }
}
