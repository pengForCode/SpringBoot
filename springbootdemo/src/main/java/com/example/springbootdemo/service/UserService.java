package com.example.springbootdemo.service;

import com.example.springbootdemo.pojo.User;

import java.util.List;

/**
 * @Author Yu Peng
 * @Date 2019/11/26 16:48
 * @Version 1.0
 */

public interface UserService {
     List<User> getAllUsers();
     int update();
}
