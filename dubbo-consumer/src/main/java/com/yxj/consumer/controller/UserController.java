package com.yxj.consumer.controller;

import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.annotation.Reference;
import com.yxj.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yangxj
 * @date 2019/7/6-22:27
 */
@RestController
public class UserController {
    /**
     * 默认不缓存，默认超时时间为1s,默认失败重试次数2次（不包括第一次）
     * 下面使用api方式 替代注解方式
     * */
//    @Reference(cache = "lru",timeout = 5000,mock = "com.yxj.consumer.mock.UserServiceMock",stub = "com.yxj.consumer.stub.UserServiceStub")
    UserService userService;
    public  UserController(ReferenceConfig<UserService> userServiceReferenceConfig) {
        this.userService = userServiceReferenceConfig.get();
    }
    @RequestMapping("getUses")
    public Object getUsers(){
        return userService.getUsers();
    }
}
