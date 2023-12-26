package com.atguigu01.file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName: Exer2
 * Package: com.atguigu01.file.exer2
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/26 - 16:51
 * @Version: v1.0
 */


public class Exer2 {

    @Test
    public void test1(){

        File dir = new File(".//");

        String[] list = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.endsWith(".txt")) {
                    return true;
                }
                return false;
            }
        });

        for(String file:list){
            System.out.println(file);
        }

    }
}
