package com.example.bootdemo.controller;
import com.example.bootdemo.entity.Role;
import com.example.bootdemo.entity.User;
import com.example.bootdemo.service.IRoleService;
import com.example.bootdemo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @Author Yu Peng
 * @Date 2019/11/26 22:28
 * @Version 1.0
 */

@RestController
public class TestController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IRoleService roleService;
    //http://localhost:8080/user/insertUser
    @RequestMapping("/user/insertUser")
    public int inertUser() {
        User user = new User();
        user.setId(555);
        user.setCode("333");
        user.setPassword("777");
        user.setName("woaini");
        user.setBirthday("1015");
        String dateString = "2018-02-23";
        try {
            Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString);
            user.setUpdated_time(date);
            user.setCreated_time(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        user.setOther("1546");
        user.setTel("1555");
        user.setProfile_picture("111");
        user.setEmail("22sa2");
        user.setRemark("3sadsa33");
        user.setCreated_by("33sadsa33");
        user.setUpdated_by("22sada2");
        user.setSex("男");
        user.setStatus("22");
        user.setVersion("22");
        Role role=new Role();
        role.setR_id(5);
        role.setR_code("666");
        role.setR_name("nihao");
        role.setR_status("666");
        role.setR_updated_by("wo");
        role.setR_version("6");
        role.setR_remark("777");
        role.setR_created_by("333");
        List<Role> roles=roleService.select(role);
        user.setRoles(roles);
        return userService.insertSelective(user);
    }

    //http://localhost:8080/user/userAll
    @RequestMapping("/user/userAll")
    public List<User> getAllUser(){
        List<User> userList=userService.getAll();
        return userList;
    }
}
