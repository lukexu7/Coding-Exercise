package com.atguigu07.object.equals.exer1;

/**
 * ClassName: Order
 * Package: com.atguigu07.object.equals.exer1
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/17 - 15:38
 * @Version: v1.0
 */


public class Order {

 public Order(int id, String orderName) {
  Id = id;
  OrderName = orderName;
 }

 public Order() {
 }

 public int getId() {
  return Id;
 }

 public void setId(int id) {
  Id = id;
 }

 public String getOrderName() {
  return OrderName;
 }

 public void setOrderName(String orderName) {
  OrderName = orderName;
 }

 private int Id;
 private String OrderName;

 public static void main(String[] args) {

 }


 @Override
 public boolean equals(Object obj) {
  if(this == obj){
   return true;
  }

  if(obj instanceof Order){
   Order order = (Order)obj;
   return this.Id == order.Id && this.OrderName.equals(order.OrderName);
  }

  return false;
 }
}
