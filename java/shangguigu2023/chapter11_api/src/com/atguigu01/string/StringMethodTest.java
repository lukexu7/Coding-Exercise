package com.atguigu01.string;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Package: com.atguigu01.string
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/11/22 - 15:26
 * @Version: v1.0
 */


public class StringMethodTest {
    @Test
    public void test2(){
        int num =10;
        String s1 = num + "";

        String s2 = String.valueOf(num);
    }


    @Test
    public void test3(){
        String str = "hello";

        char[] arr = str.toCharArray();


        //char[] ---> String

        String s = new String(arr);
    }

    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("hello中国");

        byte[] arr = str.getBytes();

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        byte[] arr1 = str.getBytes("gbk");
        for (byte b : arr1) {
            System.out.println(b);
        }

        String gbk1 = new String(arr1, "gbk");
        System.out.println(gbk1);

    }
}
