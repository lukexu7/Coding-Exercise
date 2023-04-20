package com.atguigu.mybatisplus.mapper;

import com.atguigu.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/17 17:36
 */
@Mapper
public interface UserMapper extends BaseMapper <User>{

    List<User> selectAllByName(String name);
}
