package com.chinagoods.thinkcloud.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import com.chinagoods.framework.thinkcloud.base.commons.domain.Domain;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * @author : ZHANGQIAN
 * @email : zhangqian1999@gmail.com
 * @date : 2022/4/29 9:09
 */

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("tb_order")
public class Order extends Domain {

    private String orderNo;
    private String subject;
    private Long productId;
    private int num;
    private Long userId;
}
