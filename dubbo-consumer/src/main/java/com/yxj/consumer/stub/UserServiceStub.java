package com.yxj.consumer.stub;

import com.yxj.dubbo.entity.User;
import com.yxj.dubbo.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author yangxj
 * @date 2019/7/7-0:10
 */
@Slf4j
public class UserServiceStub implements UserService {
    private final UserService userService;
    public UserServiceStub(UserService userService){
        this.userService = userService;
    }
    public List<User> getUsers(){
        log.info("UserServiceStub getUsers stub invoke.....======do check=====");
        return userService.getUsers();
    }
}
