package com.atguigu07.object.equals.apply;

/**
 * ClassName: CustomerTest
 * Package: com.atguigu07.object.equals.apply
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/17 - 15:32
 * @Version: v1.0
 */


public class CustomerTest {

 public static void main(String[] args) {

  Customer c1 = new Customer("tom", 12, new Account(2000));
  Customer c2 = new Customer("tom", 12, new Account(2000));

  System.out.println(c1 == c2);
  System.out.println(c1.equals(c2));


 }
}
