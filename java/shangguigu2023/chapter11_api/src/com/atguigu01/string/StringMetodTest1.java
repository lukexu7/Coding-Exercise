package com.atguigu01.string;

import org.junit.Test;

/**
 * ClassName: StringMetodTest1
 * Package: com.atguigu01.string
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/11/22 - 15:47
 * @Version: v1.0
 */


public class StringMetodTest1 {

    @Test
    public void test1(){

        String s1= "";
        String s2 = new String();

        String s3 = new String("");

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());


    }

    @Test
    public void test2(){
        String s1 = "hello";
        String s2 = "hello";

        String s3 = "abcd";
        String s4 = "adef";

        System.out.println(s3.compareTo(s4));

        String s9 = " he llo ";
        System.out.println("***" + s9.trim() + "***");
    }
}
