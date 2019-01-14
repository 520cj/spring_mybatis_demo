package com.qf.controller;

import com.qf.entity.User;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private IUserService userService;
    @RequestMapping("/queryAll")
    public List<User> queryAll(){
        return  userService.queryAll();
    }
    @RequestMapping("/add")
    public String addUser(){
        User user = new User();
        user.setName("xh");
        user.setAge(30);
        userService.addUser(user);
        return "success";
    }

}
