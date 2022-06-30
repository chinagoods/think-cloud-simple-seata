package com.chinagoods.thinkcloud.repo.api.impl;


import com.chinagoods.thinkcloud.domain.Product;
import com.chinagoods.thinkcloud.repo.api.ProductRepository;
import com.chinagoods.thinkcloud.repo.mapper.ProductMapper;
import com.chinagoods.framework.thinkcloud.repo.base.service.api.impl.BaseRepositoryImpl;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class ProductRepositoryImpl extends BaseRepositoryImpl<ProductMapper, Product> implements ProductRepository {

    @Override
    @Transactional
    public void updateProductStock(Long productId, Integer num) {
        if(num.equals(2)){
            throw new RuntimeException();
        }
        baseMapper.updateStock(productId,num);
    }
}
