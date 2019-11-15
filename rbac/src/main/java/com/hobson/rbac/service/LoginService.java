package com.hobson.rbac.service;


import com.hobson.coreapi.common.Result;

/**
 * @author yan hongbo
 * @date 2019/11/12 16:15
 * @description
 */
public interface LoginService {

    Result userLogin(String username, String password);

    Result updatePassword(String prePassword, String newPassword);

    Result forgetPasswordByPhone(String username, String phone);

    Result forgetPasswordByEmail(String username, String email);
}
