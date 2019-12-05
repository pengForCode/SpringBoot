package com.example.bootdemo.dao;

import com.example.bootdemo.entity.User;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;


/**
 * @Author Yu Peng
 * @Date 2019/11/26 22:52
 * @Version 1.0
 */

public interface UserMapper extends Mapper<User> {
    List<User> getAll();
}
