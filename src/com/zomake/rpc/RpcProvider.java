package com.zomake.rpc;

/**
 * Created by RZ-CD on 2016/9/22.
 * 暴露服务
 */
public class RpcProvider {
    public static void main(String[] args) throws Exception {
        HelloService service = new HelloServiceImpl();
        RpcFramework.export(service, 1234);
    }
}
