package com.hobson.coreapi.common;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author yan hongbo
 * @date 2019/11/14 10:01
 * @description
 */
@Setter
@Getter
public class Result<T> implements Serializable {

    private boolean success;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String message;

    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private int code;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private T data;

    public Result(boolean success) {
        this.success = success;
    }

    public boolean isSuccess() {
        return success;
    }


}
