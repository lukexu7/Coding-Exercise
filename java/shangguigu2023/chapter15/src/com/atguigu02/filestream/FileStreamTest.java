package com.atguigu02.filestream;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileStreamTest
 * Package: com.atguigu02.filestream
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/28 - 16:54
 * @Version: v1.0
 */


public class FileStreamTest {

    @Test
    public void test1(){


        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
//            File scrFile = new File("123.png");
//            File destFile = new File("123copy.png");

            File scrFile = new File("hello.txt");
            File destFile = new File("hellocopy1.txt");


            fis = new FileInputStream(scrFile);
            fos = new FileOutputStream(destFile);


            byte[] buffer = new byte[1024];

            int len;

            while((len=fis.read(buffer))!=-1){
                fos.write(buffer,0,len);
            }
            System.out.println("复制成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }




    }


    /*
    读取文件 显示到控制台上
     */
}
