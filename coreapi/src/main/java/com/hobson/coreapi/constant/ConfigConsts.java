package com.hobson.api.constant;

/**
 * @author yan hongbo
 * @date 2019/11/14 10:51
 * @description 系统配置常量定义
 */
public class ConfigConsts {

    /**
     * 默认字符分割
     */
    public static final String DEFAULT_SPLIT_SYMBOL = ",";

    /**
     * 行政区域展示分割符
     */
    public static final String REGION_SHOW_SPLIT_SYMBOL = "/";

    public interface Auth {

        String TOKEN_KEY = "token";

        String TOKEN_EXPIRE_KEY = "tokenExpire";

        String TOKEN_ID_KEY = "id";

        String TOKEN_USERNAME_KEY = "username";

        // 行政区域
        String TOKEN_USER_REGION_KEY = "region";

        String TOKEN_EXPIRE_TIME = "time";

    }

    public interface Session {
        String SESSION_ATTR_USER_ID = "userId";

        String SESSION_ATTR_USER_NAME = "username";
    }

    /**
     * 客户端信息
     */
    public interface Client {
        String USER_AGENT = "User-Agent";
    }

}
