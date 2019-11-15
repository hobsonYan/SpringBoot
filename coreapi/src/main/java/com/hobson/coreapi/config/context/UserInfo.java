package com.hobson.api.config.context;

/**
 * @author yan hongbo
 * @date 2019/11/14 11:13
 * @description 访问用户信息
 */
public class UserInfo {
    private String userId;

    private String username;

    private String region;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

}
