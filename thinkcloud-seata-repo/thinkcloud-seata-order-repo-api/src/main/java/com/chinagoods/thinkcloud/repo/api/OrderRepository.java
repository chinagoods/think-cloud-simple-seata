package com.chinagoods.thinkcloud.repo.api;

import com.chinagoods.framework.thinkcloud.base.commons.api.Repository;
import com.chinagoods.thinkcloud.domain.Order;
import com.chinagoods.thinkcloud.domain.UmsUser;

/**
 * @author : zhangqian9158@gmail.com
 */
public interface OrderRepository extends Repository<Order> {

    Order saveOrder(Order order);

}
