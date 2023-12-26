package com.atguigu01.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * ClassName: FileTest1
 * Package: com.atguigu01.file
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/26 - 15:49
 * @Version: v1.0
 */


public class FileTest1 {

    @Test
    public void test1(){
        File file = new File("hello.txt");


        System.out.println(file.getName());

        System.out.println(file.getPath());

        System.out.println(file.getAbsolutePath());

        System.out.println(file.getAbsoluteFile());

        System.out.println(file.length());
        System.out.println(file.lastModified());
    }


    @Test
    public void test4(){

        File file = new File("hello.txt");
        File file1  = new File("d:\\io\\abc.txt");

        boolean b = file.renameTo(file1);

        System.out.println(b);

    }

    @Test
    public void test5(){

        File file1 = new File("d:\\io\\abc.txt");

        System.out.println(file1.exists());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());


    }

    @Test
    public void test6() throws IOException {

        File file1 = new File("d:\\io\\hello.txt");

        if (!file1.exists()) {

            boolean isSucceed = file1.createNewFile();
            System.out.println("已创建");

        }else{

            System.out.println("此文件已存在");
            System.out.println(file1.delete()?"删除成功":"删除失败");
        }


    }

    @Test
    public void test7(){

        File file1 = new File("d:\\io\\io2");

        System.out.println(file1.mkdir());

        File file2 = new File("d:\\io\\io3\\io4");

        System.out.println(file2.mkdirs());

    }

    @Test
    public void test9(){


        File file1 = new File("d:\\io3");

        System.out.println(file1.delete());
    }
}
