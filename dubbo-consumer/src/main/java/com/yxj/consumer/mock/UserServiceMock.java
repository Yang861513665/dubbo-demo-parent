package com.yxj.consumer.mock;

import com.yxj.dubbo.entity.User;
import com.yxj.dubbo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangxj
 * @date 2019/7/7-0:08
 */
@Slf4j
@Component
public class UserServiceMock implements UserService {
    @Override
    public List<User> getUsers() {
        log.info("UserServiceMock  getUses() invoke..... =====return default []=====");
        return new ArrayList<>();
    }
}
