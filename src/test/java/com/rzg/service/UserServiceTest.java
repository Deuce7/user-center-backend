package com.rzg.service;

import com.rzg.mapper.UserMapper;
import com.rzg.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void testAdd(){
        User user = new User();
        user.setUsername("Rzg");
        user.setUserAccount("Deuce7");
        user.setUserAvatar("dadafa");
        user.setGender(0);
        user.setUserPassword("1234");
        user.setPhone("110189645646");
        user.setEmail("24654a6d5");

        userMapper.insert(user);
    }
}
