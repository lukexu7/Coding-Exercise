package com.atguigu07.object.equals.apply;

import java.util.Objects;

/**
 * ClassName: Customer
 * Package: com.atguigu07.object.equals.apply
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/17 - 15:31
 * @Version: v1.0
 */


public class Customer {

 private String name;
 private int age;
 private Account acct;

 public Customer() {
 }

 public Customer(String name, int age, Account acct) {
  this.name = name;
  this.age = age;
  this.acct = acct;
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

 public Account getAcct() {
  return acct;
 }

 public void setAcct(Account acct) {
  this.acct = acct;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Customer customer = (Customer) o;
  return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(acct, customer.acct);
 }

 @Override
 public int hashCode() {
  return Objects.hash(name, age, acct);
 }
}
