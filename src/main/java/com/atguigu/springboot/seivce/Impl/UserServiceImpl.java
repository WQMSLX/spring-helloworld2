package com.atguigu.springboot.seivce.Impl;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.dao.UserDao;
import com.atguigu.springboot.seivce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Transactional(readOnly = true,propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }
}
