package com.example.bootdemo.service;

import com.example.bootdemo.entity.User;

import java.util.List;

/**
 * @Author Yu Peng
 * @Date 2019/11/26 23:15
 * @Version 1.0
 */

public interface IUserService extends IBaseService<User> {
    List<User> getAll();
}
