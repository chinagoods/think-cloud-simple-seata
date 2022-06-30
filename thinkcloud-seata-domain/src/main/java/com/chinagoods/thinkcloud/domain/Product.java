package com.chinagoods.thinkcloud.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.chinagoods.framework.thinkcloud.base.commons.domain.Domain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author : ZHANGQIAN
 * @email : zhangqian1999@gmail.com
 * @date : 2022/4/29 9:08
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_product")
public class Product  extends Domain {

    private String title;
    private String productCode;
    private Integer stockNum;
}
