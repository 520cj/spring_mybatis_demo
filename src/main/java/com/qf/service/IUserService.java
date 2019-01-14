package com.qf.service;

import com.qf.entity.User;

import java.util.List;

public interface IUserService {
    List<User> queryAll();
    void addUser(User user);
}
