package com.atguigu.spring5.service;

import com.atguigu.spring5.dao.UserDao;
import com.atguigu.spring5.dao.UserDaoImple;

/**
 * @ClassName: UserService
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/23 15:48
 */
public class UserService {


    private UserDao userDao;
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }


    public void add(){
        System.out.println("service add....");
        userDao.update();

    }
}
