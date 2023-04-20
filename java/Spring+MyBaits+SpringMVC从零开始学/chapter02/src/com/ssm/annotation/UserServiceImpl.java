package com.ssm.annotation;

import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Resource(name="userDao")
    private UserDao userDao;
    public void save() {
        this.userDao.save();
        // TODO Auto-generated method stub
        System.out.println("执行userservice.save()");
    }
    
    
}
