package com.atguigu.springboot.seivce;

import com.atguigu.springboot.bean.User;

import java.util.List;

public interface UserJPAService {
    List<User> findUsers();
    User findUserById(Integer id);
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserById(Integer id);

}
