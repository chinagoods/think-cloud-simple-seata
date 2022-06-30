package com.chinagoods.thinkcloud.repo.api.impl;


import com.chinagoods.thinkcloud.domain.UmsUser;
import com.chinagoods.thinkcloud.repo.api.UmsUserRepository;
import com.chinagoods.thinkcloud.repo.mapper.UmsUserMapper;
import com.chinagoods.framework.thinkcloud.repo.base.service.api.impl.BaseRepositoryImpl;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : zhangqian9158@gmail.com
 */
@DubboService(version = "1.0.0")
public class UmsUserRepositoryImpl extends BaseRepositoryImpl<UmsUserMapper, UmsUser> implements UmsUserRepository {


    @Override
    @Transactional
    public void pay(Long userId, Long amount) {

         log.debug("repo pay ...");
         baseMapper.updateBalance(userId,amount);
    }
}
