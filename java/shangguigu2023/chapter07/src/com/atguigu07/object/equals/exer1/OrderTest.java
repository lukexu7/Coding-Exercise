package com.atguigu07.object.equals.exer1;

import javax.lang.model.element.VariableElement;

/**
 * ClassName: OrderTest
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/17 - 20:45
 * @Version: v1.0
 */


public class OrderTest {
 public static void main(String[] args) {


  Order order1 = new Order(1001, "orderAA");
  Order order2 = new Order(1001, "orderAA");
  System.out.println(order1.equals(order2));

  Order order3 = new Order(1001, new String("orderAA"));
  Order order4 = new Order(1001, new String("orderAA"));
  System.out.println(order3.equals(order4));


 }
}
