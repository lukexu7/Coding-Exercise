package com.atguigu.spring5.test;

import com.atguigu.spring5.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName: Test
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/23 15:37
 */
public class Test {
    public static void main(String[] args) {

        Test test1 = new Test();
        test1.testAdd();


    }
    @org.junit.Test
    public void testAdd(){


        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user =  context.getBean("user",User.class);

        System.out.println(user);
        user.add();
    }
}
