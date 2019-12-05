package com.example.bootdemo.service.impl;

import com.example.bootdemo.entity.User;
import com.example.bootdemo.dao.UserMapper;
import com.example.bootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author Yu Peng
 * @Date 2019/11/26 23:15
 * @Version 1.0
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

}
