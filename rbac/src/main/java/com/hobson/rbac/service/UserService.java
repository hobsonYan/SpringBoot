package com.hobson.rbac.service;

import com.hobson.coreapi.common.Result;
import com.hobson.rbac.dto.UserDto;

/**
 * @author yan hongbo
 * @date 2019/11/13 9:36
 * @description
 */
public interface UserService {

    Result<UserDto> getUserInfo(Integer userId);

    Result deleteUser(Integer userId);

    Result updateUserPhone(Integer userId, String phone);

    Result updateUserEmail(Integer userId, String email);
}
