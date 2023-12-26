package com.atguigu01.file.exer1;

import java.io.File;

/**
 * ClassName: Exer01
 * Package: com.atguigu01.file.exer1
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/26 - 16:48
 * @Version: v1.0
 */


public class Exer01 {

    public static void main(String[] args) {

        File file = new File("hello.txt");

        System.out.println(file.getAbsolutePath());


        File file1 = new File(file.getAbsoluteFile().getParent(), "abc.txt");

        System.out.println(file1.getAbsolutePath());


    }
}
