package com.atguigu05.objectstream;

import java.io.Serializable;

/**
 * ClassName: Person
 * Package: com.atguigu05.objectstream
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/2 - 16:15
 * @Version: v1.0
 */


public class Person implements Serializable {

    String name;
    int age;

    int id;

    static final long serialVersionUID = 42234234L;
    Account acct;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public Person(String name, int age, int id, Account acct) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.acct = acct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                ", acct=" + acct +
                '}';
    }
}

class Account implements Serializable{

    double balance;

    static final long serialVersionUID = 3423423L;

    public Account(double balance) {
        this.balance = balance;
    }
}
