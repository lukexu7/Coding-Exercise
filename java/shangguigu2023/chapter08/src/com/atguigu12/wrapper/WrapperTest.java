package com.atguigu12.wrapper;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Package: com.atguigu12.wrapper
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/8/31 - 11:28
 * @Version: v1.0
 */


public class WrapperTest {

    public static void main(String[] args) {



    }


    @Test
    public void test1(){

        int i1=10;

        Integer i11 = new Integer(i1);

        System.out.println(i11.toString());


        String s2 = "false";

        s2 = "False123";

        String s3 = "trUE";

        System.out.println(new Boolean(s3));






    }
}
