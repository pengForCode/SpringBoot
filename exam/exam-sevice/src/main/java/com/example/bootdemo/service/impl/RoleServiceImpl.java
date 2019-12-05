package com.example.bootdemo.service.impl;

import com.example.bootdemo.dao.RoleMapper;
import com.example.bootdemo.entity.Role;
import com.example.bootdemo.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author Yu Peng
 * @Date 2019/11/27 18:18
 * @Version 1.0
 */
@Service
public class RoleServiceImpl extends BaseServiceImpl<Role> implements IRoleService {
    @Autowired
    private RoleMapper roleMapper;
}
