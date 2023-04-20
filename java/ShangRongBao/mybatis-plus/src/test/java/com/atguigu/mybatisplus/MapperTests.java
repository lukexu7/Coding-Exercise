package com.atguigu.mybatisplus;

import com.atguigu.mybatisplus.entity.User;
import com.atguigu.mybatisplus.mapper.UserMapper;

import org.junit.jupiter.api.Test;

import java.util.List;


/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/17 19:34
 */
public class MapperTests {
    public UserMapper userMapper;
    @Test
    public void testSelectAllByName(){
        List<User> users= userMapper.selectAllByName("Jack");
        users.forEach(System.out::println);
    }
}
