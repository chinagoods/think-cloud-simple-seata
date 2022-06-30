package com.chinagoods.thinkcloud.repo.api.impl;


import com.chinagoods.framework.thinkcloud.repo.base.service.api.impl.BaseRepositoryImpl;
import com.chinagoods.thinkcloud.domain.Order;
import com.chinagoods.thinkcloud.repo.api.OrderRepository;
import com.chinagoods.thinkcloud.repo.mapper.OrderMapper;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class OrderRepositoryImpl extends BaseRepositoryImpl<OrderMapper, Order> implements OrderRepository {

    @Override
    @Transactional
    public Order saveOrder(Order order) {
        return saveDomain(order);
    }
}
