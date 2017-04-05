package com.wuye.controller;

import com.wuye.bean.User;
import com.wuye.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/3/13.
 */
@RestController
public class LoginController {
    @Autowired
    private UserRepository repository;

    /**
     * 用户登录
     * @param name 用户名
     * @param password 密码
     * @return
     */
    @RequestMapping(value = "/loginBg", method = RequestMethod.GET)
    public User index(@RequestParam("name") String name, @RequestParam("password") String password) {

        User userInfo = null;
        if (userInfo != null) {
            return userInfo;
        }
        return null;
    }
}
