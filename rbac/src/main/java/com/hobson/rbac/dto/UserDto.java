package com.hobson.rbac.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
/**
 * @author yan hongbo
 * @date 2019/11/13 9:37
 * @description
 */
@Getter
@Setter
public class UserDto {

    @ApiModelProperty(value = "用户id")
    private int id;

    @ApiModelProperty(value = "用户名")
    private String username;

    @ApiModelProperty(value = "用户手机号")
    private String phone;

    @ApiModelProperty(value = "用户邮箱")
    private String email;
}
