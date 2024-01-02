package com.atguigu05.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ObjectInputOutputStreamTest
 * Package: com.atguigu05.objectstream
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/2 - 15:52
 * @Version: v1.0
 */


public class ObjectInputOutputStreamTest {

    @Test
    public void test1() throws IOException {


        File file = new File("object.txt");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));

        oos.writeUTF("谱尼阿姆");
        oos.flush();

        oos.writeObject("发卡有");
        oos.flush();

        oos.close();

    }

    @Test
    public void test2() throws IOException, ClassNotFoundException {

        File file = new File("object.txt");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        String str1 = ois.readUTF();
        System.out.println(str1);

        Object obj1 = ois.readObject();
        System.out.println(obj1);


        ois.close();


    }

    @Test
    public void test3() throws IOException {

        File file = new File("object1.dat");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file));


        Person p1 = new Person("tom", 12);

        Person p2 = new Person("hah", 12, 0, new Account(2000));

        oos.writeObject(p2);
        oos.flush();

        oos.close();
    }


    @Test
    public void test4() throws IOException, ClassNotFoundException {

        File file = new File("object1.dat");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));


        Object person = (Person) ois.readObject();

        System.out.println(person);

        ois.close();
    }
}
