package com.chinagoods.thinkcloud.repo.api;

import com.chinagoods.framework.thinkcloud.base.commons.api.Repository;
import com.chinagoods.thinkcloud.domain.Product;
import com.chinagoods.thinkcloud.domain.UmsUser;

/**
 * @author : zhangqian9158@gmail.com
 */
public interface ProductRepository extends Repository<Product> {

    void updateProductStock(Long productId,Integer num);

}
