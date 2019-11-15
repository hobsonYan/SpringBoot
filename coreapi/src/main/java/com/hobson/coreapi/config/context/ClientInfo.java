package com.hobson.api.config.context;

/**
 * @author yan hongbo
 * @date 2019/11/14 11:09
 * @description 访问客户端信息
 */
public class ClientInfo {

    private String systemInfo;

    private String detailInfo;

    public String getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

}
