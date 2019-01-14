package com.qf.service.impl;

import com.qf.dao.IUserDao;
import com.qf.entity.User;
import com.qf.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService{
   @Autowired
    private IUserDao userDao;
    @Override
    public List<User> queryAll() {
        return userDao.queryAll();
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
        System.out.println(1/0);
    }
}
