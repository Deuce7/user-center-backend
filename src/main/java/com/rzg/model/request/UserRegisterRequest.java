package com.rzg.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author Deuce7
 */
@Data
public class UserRegisterRequest implements Serializable {
    private static final long serialVersionUID = -2252722469696647380L;

    /**
     * 用户账号
     */
    private String username;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 验证密码
     */
    private String checkPassword;
}
