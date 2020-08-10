package com.atguigu.springboot.dao;

import com.atguigu.springboot.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
//@Mapper
public interface UserDao {
    List<User> findAll();
}
