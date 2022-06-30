package com.chinagoods.thinkcloud.ctl.controller;

import com.chinagoods.framework.thinkcloud.base.commons.domain.Domain;
import com.chinagoods.framework.thinkcloud.commons.controller.BaseController;
import com.chinagoods.thinkcloud.biz.api.UmsUserService;
import com.chinagoods.thinkcloud.domain.UmsUser;
import io.swagger.annotations.Api;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ZHANG.Q
 * @since 2021-10-28
 */
@Api(tags = "框架示例")
@RestController
@RequestMapping("/v1/ums/user")
public class UmsUserController extends BaseController<UmsUser, UmsUserService> {

    @DubboReference(version = "1.0.0")
    private UmsUserService umsUserService;

    @Override
    protected Domain getUser() {
        return new Domain(1000L);
    }
}
