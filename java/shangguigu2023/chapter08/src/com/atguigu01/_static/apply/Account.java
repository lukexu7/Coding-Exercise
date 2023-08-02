package com.atguigu01._static.apply;

/**
 * ClassName: Account
 * Package: com.atguigu01._static.apply
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/18 - 18:09
 * @Version: v1.0
 */


public class Account {
 private int id;
 private String password;

 private double balance;

 private static double interestRate;

 private static double minBalance = 1;

 private static int init = 1001;


 public Account() {
  this.id = init;
  init++;
  password = "000000";
 }

 public Account(String password, double balance) {
  this.password = password;
  this.balance = balance;
  this.id = init;
  init++;
 }


 public String getPassword() {
  return password;
 }

 public void setPassword(String password) {
  this.password = password;
 }

 public double getBalance() {
  return balance;
 }

 public void setBalance(double balance) {
  this.balance = balance;
 }

 public static double getInterestRate() {
  return interestRate;
 }

 public static void setInterestRate(double interestRate) {
  Account.interestRate = interestRate;
 }

 public static double getMinBalance() {
  return minBalance;
 }

 public static void setMinBalance(double minBalance) {
  Account.minBalance = minBalance;
 }

 @Override
 public String toString() {
  return "Account{" +
          "id=" + id +
          ", password='" + password + '\'' +
          ", balance=" + balance +
          '}';
 }
}
