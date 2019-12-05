package com.example.springbootdemo.controller;

import com.example.springbootdemo.pojo.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Yu Peng
 * @Date 2019/11/28 15:14
 * @Version 1.0
 */
@RestController
public class RESTFULLController {

    //http://localhost:8080/boot/user/2/sb/333/444/555/666
    @RequestMapping("boot/user/{id}/{name}/{code}/{password}/{sex}/{birthday}")
    public Object user(@PathVariable("id") Integer id ,@PathVariable("name") String name,
                       @PathVariable("password")String password,@PathVariable("code") String code,
                       @PathVariable("sex") String sex,@PathVariable("birthday") String birthday) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setSex(sex);
        user.setPassword(password);
        user.setCode(code);
        user.setBirthday(birthday);
        return user;
    }
}
