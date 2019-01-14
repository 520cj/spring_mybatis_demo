package com.qf.dao;

import com.qf.entity.User;

import java.util.List;

public interface IUserDao {
    List<User> queryAll();

    void addUser(User user);
}
