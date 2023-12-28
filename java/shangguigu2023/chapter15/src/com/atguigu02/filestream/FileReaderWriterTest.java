package com.atguigu02.filestream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: FileReaderWriterTest
 * Package: com.atguigu02.filestream
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/27 - 14:51
 * @Version: v1.0
 */


public class FileReaderWriterTest {


    @Test
    public void test1() throws IOException {


        File file = new File("hello.txt");

        FileReader fr = new FileReader(file);


//        System.out.println((char)fr.read());
//        System.out.println((char)fr.read());
//        System.out.println((char)fr.read());
//        System.out.println((char)fr.read());
//        System.out.println((char)fr.read());
//        System.out.println((char)fr.read());

        while (fr.read() != -1) {
            System.out.println((char) (fr.read()));
        }


        fr.close();


    }

    @Test
    public void test3() {


        FileReader fr = null;


        File file = new File("hello.txt");

        try {
            fr = new FileReader(file);

            char[] cbuffer = new char[5];
            int len;
            while ((len = fr.read(cbuffer)) != -1) {
                for (int i = 0; i < len; i++) {
                    System.out.println(cbuffer[i]);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    @Test
    public void test4() {

        FileWriter fw = null;
        try {
            File file = new File("info.txt");

            fw = new FileWriter(file, true);

            fw.write("fw");
            fw.write("fu");
            fw.write("gunan");

            System.out.println("输出成功");


        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }


    @Test
    public void test5() {

        File scrFile = new File("hello.txt");

        File destFile = new File("hello_copy.txt");

        FileReader fr = null;
        FileWriter fw = null;

        try {

             fr = new FileReader(scrFile);

             fw = new FileWriter(destFile);



            char[] cbuffer = new char[5];

            int len;

            while ((len = fr.read(cbuffer)) != -1) {
                fw.write(cbuffer, 0, len);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();

            }

            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }

}
