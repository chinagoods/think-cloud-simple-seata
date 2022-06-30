package com.chinagoods.thinkcloud.biz.api;

import com.chinagoods.thinkcloud.domain.Order;

/**
 * @author : ZHANGQIAN
 * @email : zhangqian1999@gmail.com
 * @date : 2022/5/3 20:21
 */
public interface OrderService {

    Order createOrder(Long userId,Long productId,Integer num);
}
