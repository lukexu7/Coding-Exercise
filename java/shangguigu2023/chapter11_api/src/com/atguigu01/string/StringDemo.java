package com.atguigu01.string;

import org.junit.Test;

/**
 * ClassName: StringDemo
 * Package: com.atguigu01.string
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/11/20 - 18:18
 * @Version: v1.0
 */


public class StringDemo {

    @Test
    public void test1(){

        String s1 = "hello";//字符串常量池之中
        String s2 = "hello";

        System.out.println(s1 == s2);

    }
/*

 */
    @Test
    public void test2(){

        String s1 = "a";
        String s2 = "a";
        s2 = "b";
        System.out.println(s2);
    }

    @Test
    public void test3(){
        String s1="hello";
        String s2="hello";

        s2 += "world";


    }


    @Test
    public void test4(){
        String s1="hello";
        String s2 = "hello";
        String s3 = s2.replace('l', '2');


    }
}
