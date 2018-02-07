package com.wp;

import com.wp.server.RpcServer;

public class Server {
    public static void main(String[] args) {
        new RpcServer().start();
    }
}
