package com.hobson.api.config.context;

/**
 * @author yan hongbo
 * @date 2019/11/14 11:13
 * @description
 */
public class UserContext {

    private static final ThreadLocal<UserInfo> userInfo = new ThreadLocal<>();

    private UserContext() {
    }

    public static ThreadLocal<UserInfo> getUserInfo() {
        return userInfo;
    }

}
