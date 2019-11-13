package com.example.springboot.service;

import com.example.springboot.common.Result;
import com.example.springboot.dto.UserDto;

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
