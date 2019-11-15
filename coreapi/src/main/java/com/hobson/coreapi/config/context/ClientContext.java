package com.hobson.coreapi.config.context;

/**
 * @author yan hongbo
 * @date 2019/11/14 11:08
 * @description 用户信息
 */
public class ClientContext {

    private static final ThreadLocal<com.hobson.api.config.context.ClientInfo> clientInfo = new ThreadLocal<>();

    private ClientContext() {
    }

    public static ThreadLocal<com.hobson.api.config.context.ClientInfo> getClientInfo() {
        return clientInfo;
    }

}
