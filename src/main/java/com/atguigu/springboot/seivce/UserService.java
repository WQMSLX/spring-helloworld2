package com.atguigu.springboot.seivce;

import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.dao.UserDao;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> findAll();
}
