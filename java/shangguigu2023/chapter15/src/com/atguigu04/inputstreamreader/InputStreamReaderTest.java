package com.atguigu04.inputstreamreader;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: InputStreamReaderTest
 * Package: com.atguigu04.inputstreamreader
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/2 - 11:47
 * @Version: v1.0
 */


public class InputStreamReaderTest {

    @Test
    public void test1(){

        File file = new File("");

    }


    /*

    需求：gbk->utf-8
     */


    @Test
    public void test4() throws IOException {

        File file1 = new File("dbcp_gbk.txt");
        File file2 = new File("");


        FileInputStream fis = new FileInputStream(file1);

        InputStreamReader isr = new InputStreamReader(fis, "GBK");

        FileOutputStream fos = new FileOutputStream(file2);

        OutputStreamWriter oswew  = new OutputStreamWriter(fos, "utf8");


        char[] cBuffer = new char[1024];

        int len;




    }
}
