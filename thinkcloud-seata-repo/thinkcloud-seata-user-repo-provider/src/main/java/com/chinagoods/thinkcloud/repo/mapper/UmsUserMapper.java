package com.chinagoods.thinkcloud.repo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chinagoods.thinkcloud.domain.UmsUser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author : zhangqian9158@gmail.com
 */
public interface UmsUserMapper extends BaseMapper<UmsUser> {

    @Update("update ums_user set balance=balance-#{amount} where id=#{userId}")
    void updateBalance(@Param("userId") Long userId, @Param("amount") Long amount);

}
