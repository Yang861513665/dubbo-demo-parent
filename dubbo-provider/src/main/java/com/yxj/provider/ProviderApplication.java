package com.yxj.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yangxj
 * @date 2019/7/6-22:21
 */
@SpringBootApplication
@EnableDubbo(scanBasePackages = "com.yxj.provider.service")
public class ProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class,args);
    }
}
