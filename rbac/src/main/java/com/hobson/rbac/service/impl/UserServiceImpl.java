package com.hobson.rbac.service.impl;

import com.hobson.coreapi.common.Result;
import com.hobson.rbac.dto.UserDto;
import com.hobson.rbac.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author yan hongbo
 * @date 2019/11/13 9:45
 * @description
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Override
    public Result<UserDto> getUserInfo(Integer userId) {
        return null;
    }

    @Override
    public Result deleteUser(Integer userId) {
        return null;
    }

    @Override
    public Result updateUserPhone(Integer userId, String phone) {
        return null;
    }

    @Override
    public Result updateUserEmail(Integer userId, String email) {
        return null;
    }
}
