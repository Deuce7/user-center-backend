package com.rzg.service;

import com.rzg.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.rzg.model.request.UserLoginRequest;
import com.rzg.model.request.UserRegisterRequest;

import javax.servlet.http.HttpServletRequest;

/**
* @author Rzg
* @description 针对表【user(用户表)】的数据库操作Service
* @createDate 2023-08-11 10:44:16
*/
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userRegisterRequest
     * @return
     */
    long userRegister(UserRegisterRequest userRegisterRequest);

    /**
     * 用户登录
     *
     * @param userLoginRequest
     * @param request
     * @return
     */
    User userLogin(UserLoginRequest userLoginRequest, HttpServletRequest request);


    /**
     * 信息脱敏
     *
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
