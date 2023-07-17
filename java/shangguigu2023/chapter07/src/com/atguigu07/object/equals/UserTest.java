package com.atguigu07.object.equals;

import com.sun.org.apache.xpath.internal.operations.Equals;

/**
 * ClassName: UserTest
 * Package: com.atguigu07.object.equals
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/17 - 14:45
 * @Version: v1.0
 */


public class UserTest {
 public static void main(String[] args) {

  User u1 = new User("Tom", 12);
  User u2 = new User("Tome",12);

  System.out.println(u1.equals(u2));//false

  String abc = new String("abc");
  String abc2 = new String("abc");

  System.out.println(abc == abc2);
  System.out.println(abc.equals(abc2));


 }
}

class User{
 String name;
 int age;

 public User(String name, int age) {
  this.name = name;
  this.age = age;
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
 public boolean equals(Object obj) {
  if(this == obj){
   return true;
  }

  if(obj instanceof User){

   User user = (User)obj;

   return this.name.equals(user.name) && this.age == user.age;

  }
  return false;
 }
}
