package com.wuye.controller;

import com.wuye.bean.User;
import com.wuye.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/4/1.
 */
@RestController
public class UserController {
    @Autowired
    private UserRepository repository;
    @RequestMapping(value = "/userList", method = RequestMethod.GET)
    public List<User> getAllUser() {

        List<User> userInfos = repository.findAll();
        if (userInfos.size() != 0) {
            return userInfos;
        }
        return null;
    }
}
