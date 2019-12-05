package com.example.springbootdemo.service.impl;

import com.example.springbootdemo.mapper.UserMapper;
import com.example.springbootdemo.pojo.User;
import com.example.springbootdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author Yu Peng
 * @Date 2019/11/26 16:50
 * @Version 1.0
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @Override
    public List<User> getAllUsers() {
        //字符串序列化器
        RedisSerializer redisSerializer=new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);
        //高并发，缓存穿透
        //查缓存
        List<User> userList = (List<User>) redisTemplate.opsForValue().get("allUsers");

        //双重检测锁
        if (null == userList) {
            synchronized (this) {
                //从redis获取一下
                userList = (List<User>) redisTemplate.opsForValue().get("allUsers");
                if (null == userList) {
                    System.out.println("查询数据库");
                    //缓存为空，查数据库
                    userList = userMapper.selectAll();
                    //把数据库数据放进缓存
                    redisTemplate.opsForValue().set("allUsers", userList);
                }else {
                    System.out.println("查询缓存");
                }
            }
        }else {
            System.out.println("查询缓存");
        }
        return  userList;
    }

    @Transactional(rollbackFor=Exception.class)
    @Override
    public int update() {
        User user=new User();
        user.setId(12);
        user.setCode("520");
        user.setBirthday("1111");
        user.setName("我爱你");
        int result=userMapper.updateByPrimaryKeySelective(user);
        System.out.println(result);
        //异常回滚
        int a=10/0;
        return result;
    }
}
