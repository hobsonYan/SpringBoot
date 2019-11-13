package com.example.springboot.controller;

import com.example.springboot.common.Result;
import com.example.springboot.service.LoginService;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yan hongbo
 * @date 2019/11/12 16:09
 * @description
 */
@Api(tags = "登入接口")
@RequestMapping("/login")
@RestController
public class LoginController {

    @Resource
    private LoginService loginService;

    @ApiOperation(value = "用户登录", notes = "用户登录")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true),
            @ApiImplicitParam(name = "password", value = "密码", required = true)
    })
    @PostMapping("/userlogin")
    public Result userLogin(String username, String password) {
        return loginService.userLogin(username, password);
    }

    @ApiOperation(value = "修改密码", notes = "修改密码")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "prePassword", value = "旧密码", required = true),
            @ApiImplicitParam(name = "newPassword", value = "新密码", required = true)
    })
    @PostMapping("/updatePassword")
    public Result updatePassword(String prePassword, String newPassword) {
        return loginService.updatePassword(prePassword, newPassword);
    }

    @ApiOperation(value = "忘记密码，通过手机号进行修改", notes = "忘记密码，通过手机号进行修改")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true),
            @ApiImplicitParam(name = "phone", value = "手机号", required = true)
    })
    @PostMapping("/phone/forgetPassword")
    public Result forgetPasswordByPhone(String username, String phone) {
        return loginService.forgetPasswordByPhone(username, phone);
    }

    @ApiOperation(value = "忘记密码，通过邮箱进行修改", notes = "忘记密码，通过邮箱进行修改")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "username", value = "用户名", required = true),
            @ApiImplicitParam(name = "email", value = "邮箱", required = true)
    })
    @PostMapping("/email/forgetPassword")
    public Result forgetPasswordByEmail(String username, String email) {
        return loginService.forgetPasswordByEmail(username, email);
    }
}
