package com.yxj.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.dubbo.rpc.RpcContext;
import com.yxj.dubbo.entity.User;
import com.yxj.dubbo.service.UserService;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author yangxj
 * @date 2019/7/6-22:17
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public List<User> getUsers(){
        // 获取调用方IP地址
        String requestClientIp = RpcContext.getContext().getRemoteHost();
        log.info("=======UserServiceImpl: getUsers（）is  invoked , invoker ip: {}======",requestClientIp);
//        try {
//            TimeUnit.SECONDS.sleep(3);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        // 获取当前服务配置信息，所有配置信息都将转换为URL的参数
        String application = RpcContext.getContext().getUrl().getParameter("application");
        log.info("UserServiceImpl infos：{}",application);
        ArrayList<User> users = new ArrayList<>();
        users.add(User.builder().name("yangxj01").age(22).build());
        users.add(User.builder().name("yangxj02").age(23).build());
        return users;
    }
}
