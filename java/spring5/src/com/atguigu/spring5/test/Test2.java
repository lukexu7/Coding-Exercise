package com.atguigu.spring5.test;

import com.atguigu.spring5.User;
import com.atguigu.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Test2
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/23 15:59
 */
public class Test2 {
    @Test
    public void testUserService(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        UserService user = context.getBean("userService", UserService.class);

        user.add();

    }
}
