package com.ssm.annotation;

import org.springframework.stereotype.Controller;

@Controller("UserController")
public class UserController {
    @Resource(name="userService");
    private UserService suerService;
    public void save(){
        this.suerService.save();
        System.out.println("运行userconroller.save()");
    }
}
