package com.yxj.consumer.config;

import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.yxj.dubbo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

/**
 * @author yangxj
 * @date 2019/7/7-0:57
 */
@Configuration
public class DubboConfig {
    @Bean
    ReferenceConfig<UserService> userServiceReferenceConfig(){
        ReferenceConfig<UserService> userServiceReferenceConfig = new ReferenceConfig<>();
        userServiceReferenceConfig.setStub("com.yxj.consumer.stub.UserServiceStub");
        userServiceReferenceConfig.setTimeout(5000);
        userServiceReferenceConfig.setCache("lru");
        userServiceReferenceConfig.setInterface(UserService.class);
        // 针对某个方法的配置
        MethodConfig config = new MethodConfig();
        config.setName("getUsers");
        config.setTimeout(2000);
        userServiceReferenceConfig.setMethods(Arrays.asList(config));
        return userServiceReferenceConfig;
    }
}
