package com.example.springboot.service.impl;

import com.example.springboot.common.Result;
import com.example.springboot.dto.UserDto;
import com.example.springboot.service.UserService;
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
