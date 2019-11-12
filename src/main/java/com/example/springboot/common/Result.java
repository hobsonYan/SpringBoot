package com.example.springboot.common;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

/**
 * @author yan hongbo
 * @date 2019/11/12 11:32
 * @description
 */
public class Result<T> implements Serializable {

    private boolean success;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T Data;

    public Result(boolean success) {
        this.success = success;
    }

    public boolean getSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return Data;
    }

    public void setData(T Data) {
        this.Data = Data;
    }
}
