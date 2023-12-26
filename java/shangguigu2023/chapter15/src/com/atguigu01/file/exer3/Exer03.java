package com.atguigu01.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer03
 * Package: com.atguigu01.file.exer3
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/26 - 16:56
 * @Version: v1.0
 */


public class Exer03 {

    @Test
    public void test1(){

    }



    public void printFileName(File file){
        if(file.isFile()){
            System.out.println(file.getName());
        }else if(file.isDirectory()){
            File[] files = file.listFiles();
            for(File f:files){
                printFileName(f);
            }

        }
    }
}
