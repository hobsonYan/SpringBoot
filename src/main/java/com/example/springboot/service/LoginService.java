package com.example.springboot.service;

import com.example.springboot.common.Result;

/**
 * @author yan hongbo
 * @date 2019/11/12 16:15
 * @description
 */
public interface LoginService {

    Result userLogin(String username, String password);

    Result updatePassword(String prePassword, String newPassword);
}
