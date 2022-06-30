package com.chinagoods.thinkcloud.repo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinagoods.thinkcloud.domain.Product;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author : zhangqian9158@gmail.com
 */
public interface ProductMapper extends BaseMapper<Product> {

    @Update("update tb_product set stock_num=stock_num-#{num} where id=#{productId}")
    void updateStock(@Param("productId") Long productId, @Param("num") Integer num);
}
