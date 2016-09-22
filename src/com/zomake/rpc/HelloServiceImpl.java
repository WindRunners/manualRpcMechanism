package com.zomake.rpc;

/**
 * Created by RZ-CD on 2016/9/22.
 * 实现服务
 */
public class HelloServiceImpl implements HelloService{
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
