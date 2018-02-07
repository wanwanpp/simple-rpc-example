package com.wp.service;

import com.wp.annotation.RpcService;

@RpcService(HelloService.class)
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello(String name) {
        return "Hello! "+name;
    }
}
