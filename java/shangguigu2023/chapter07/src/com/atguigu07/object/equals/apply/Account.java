package com.atguigu07.object.equals.apply;

import java.util.Objects;

/**
 * ClassName: Account
 * Package: com.atguigu07.object.equals.apply
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/17 - 15:30
 * @Version: v1.0
 */


public class Account {

 private double balance;

 public Account() {
 }

 public Account(double balance) {
  this.balance = balance;
 }

 public double getBalance() {
  return balance;
 }

 public void setBalance(double balance) {
  this.balance = balance;
 }

 @Override
 public boolean equals(Object o) {
  if (this == o) return true;
  if (o == null || getClass() != o.getClass()) return false;
  Account account = (Account) o;
  return Double.compare(account.balance, balance) == 0;
 }

 @Override
 public int hashCode() {
  return Objects.hash(balance);
 }
}
