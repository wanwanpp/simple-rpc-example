package com.wp;

import com.wp.client.RpcProxy;
import com.wp.service.HelloService;


public class Client {

    public static void main(String[] args) {
        RpcProxy rpcProxy = ServiceConsumer.getConsumeProxy();
        HelloService helloService = rpcProxy.create(HelloService.class);
        String result = helloService.hello("World");
        System.out.println(result);
    }
}