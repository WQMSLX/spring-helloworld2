package com.atguigu.springboot.bean;

import javax.persistence.*;
import java.io.Serializable;

//@Component
//@ConfigurationProperties(prefix = "user")
@Entity//声明实体类

public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//对应数据库IDENTITY
    @Column(name="id")
    private Integer id;
    //用户名
    @Column(name="username",length=64,nullable = false,unique =true)//unique外键约束
    private String username;
    private String password;
    private  String name;

    public User() {
    }

    public User(Integer id, String username, String password, String name) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
