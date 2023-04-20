package com.atguigu.mybatisplus.entity;

import lombok.Data;

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/17 17:27
 */
    @Data
    public class User {
        private Long id;
        private String name;
        private Integer age;
        private String email;
    }

