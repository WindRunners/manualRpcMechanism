package com.zomake.rpc;

/**
 * Created by RZ-CD on 2016/9/22.
 * 引用服务
 */
public class RpcConsumer {

    public static void main(String[] args) throws Exception {
        HelloService service = RpcFramework.refer(HelloService.class, "127.0.0.1", 1234);

        for (int i = 0; i < 1000000; i++) {
            String hello = service.hello("World " + i);
            System.out.println(hello);
            Thread.sleep(10);
        }

    }

}
