package provider;

import netty.NettyServer;

//ServerBootstrap 会启动一个服务启动者,就是NettyServer
public class ServerBootstrap {
    public static void main(String[] args) {

        //代码代填
        NettyServer.startServer("127.0.0.1",7000);
    }
}
