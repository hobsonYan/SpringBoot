package com.hobson.api.constant.meta;

/**
 * @author yan hongbo
 * @date 2019/11/14 10:54
 * @description
 */

public enum ResponseEnum implements ResponseTemplateEnum {

    GET_INFO_SUCCESS(200, "获取成功"),
    OPERATION_SUCCESS(200, "操作成功"),
    GET_INFO_FAIL(400, "获取失败"),
    OPERATION_FAIL(400, "操作失败");


    private int code;

    private String message;

    ResponseEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
