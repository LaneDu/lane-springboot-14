package com.lagou.controller;

import com.lagou.pojo.User;
import com.lagou.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author lane
 * @date 2021年10月21日 下午3:52
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/user/findAll")
    public String findAll(){

        List<User> users = userService.findAll();
        users.forEach(user -> System.out.println(user));

       return "success";
    }
}
