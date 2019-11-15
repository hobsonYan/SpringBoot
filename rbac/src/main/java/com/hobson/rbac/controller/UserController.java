package com.hobson.rbac.controller;

import com.hobson.coreapi.common.Result;
import com.hobson.rbac.dto.UserDto;
import com.hobson.rbac.service.UserService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yan hongbo
 * @date 2019/11/13 9:32
 * @description
 */
@Api(tags = "用户接口")
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @ApiOperation(value = "用户信息展示，通过用户id获得用户信息", notes = "用户信息展示，通过用户id获得用户信息")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", required = true)
    })
    @GetMapping("/userInfo")
    public Result<UserDto> getUserInfo(Integer userId) {
        return userService.getUserInfo(userId);
    }

    @ApiOperation(value = "删除用户", notes = "删除用户")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户id", required = true)
    })
    @PostMapping("/deleteUser")
    public Result deleteUser(Integer userId) {
        return userService.deleteUser(userId);
    }

    @ApiOperation(value = "修改用户手机号")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户Id", required = true),
            @ApiImplicitParam(name = "phone", value = "用户手机号", required = true)
    })
    @PostMapping("/updatePhone")
    public Result updatePhone(Integer userId, String phone) {
        return userService.updateUserPhone(userId, phone);
    }

    @ApiOperation(value = "修改用户邮箱")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userId", value = "用户Id", required = true),
            @ApiImplicitParam(name = "email", value = "用户邮箱", required = true)
    })
    @PostMapping("/updateEmail")
    public Result updateEmail(Integer userId, String email) {
        return userService.updateUserEmail(userId, email);
    }
}
