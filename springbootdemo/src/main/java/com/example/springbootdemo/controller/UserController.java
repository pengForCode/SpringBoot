package com.example.springbootdemo.controller;

import com.example.springbootdemo.service.UserService;
import org.apache.ibatis.executor.Executor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.concurrent.ThreadPoolExecutorFactoryBean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.*;

/**
 * @Author Yu Peng
 * @Date 2019/11/26 16:47
 * @Version 1.0
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    //http://localhost:8080/boot/userAll
    @RequestMapping ("/boot/userAll")
    public Object users(){
        //
        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                userService.getAllUsers();
            }
        };
        //多线程测试缓存穿透问题
        ThreadFactory threadFactory = new ThreadPoolTaskExecutor();
        ExecutorService fixedThreadPool =
                new ThreadPoolExecutor(40,50,200L, TimeUnit.MILLISECONDS,new LinkedBlockingQueue<Runnable>(),threadFactory);
        for (int i=0;i<10000;i++){
            fixedThreadPool.submit(runnable);
        }
        return userService.getAllUsers();
    }
    //http://localhost:8080/boot/update
    @RequestMapping ("/boot/update")
    public Object update(){
        return userService.update();
    }
}
