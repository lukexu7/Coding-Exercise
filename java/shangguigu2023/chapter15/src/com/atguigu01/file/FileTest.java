package com.atguigu01.file;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: FileTest
 * Package: com.atguigu01.file
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/26 - 15:38
 * @Version: v1.0
 */


public class FileTest {


    @Test
    public void test1(){

        File file1 = new File("d:/io\\hello.txt");
        File file2 = new File("abc");

        System.out.println(file2.getAbsolutePath());


    }

    @Test
    public void test2(){

        File file1 = new File("d:\\io", "abc.txt");
        File file2 = new File("abc", "test");

        File file3 = new File(file2, "haha.txt");


    }
}
