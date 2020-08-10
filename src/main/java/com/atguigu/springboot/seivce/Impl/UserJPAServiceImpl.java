package com.atguigu.springboot.seivce.Impl;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.dao.UserJPADao;
import com.atguigu.springboot.seivce.UserJPAService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserJPAServiceImpl implements UserJPAService {
    @Autowired
    UserJPADao userDao;

    @Override
    public List<User> findUsers() {
        return userDao.findAll();
    }

    @Override
    public User findUserById(Integer id) {
        return (User) userDao.findById(id).get();
    }

    @Override
    public void saveUser(User user) {
        userDao.save(user);
    }

    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    @Override
    public void deleteUserById(Integer id) {
        userDao.deleteById(id);
    }
}
