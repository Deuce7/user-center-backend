package com.rzg.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求体
 *
 * @author Deuce7
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 9093327964270748911L;

    /**
     * 用户账号
     */
    private String userAccount;

    /**
     * 用户密码
     */
    private String userPassword;
}
