package com.atguigu11._annotation;

/**
 * ClassName: AnnotationTest
 * Package: com.atguigu11._annotation
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/8/7 - 10:59
 * @Version: v1.0
 */


public class AnnotationTest {
}


class Person{
    String name;
    int age;

    public void eat(){
        System.out.println("人吃饭");
    }
}

class Student extends Person{
    @Override
    public void eat(){
        System.out.println("学生吃饭");
    }
}