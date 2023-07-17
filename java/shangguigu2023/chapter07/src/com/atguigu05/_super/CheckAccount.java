package com.atguigu05._super;

/**
 * ClassName: CheckAccount
 * Package: com.atguigu05._super
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/7 - 10:52
 * @Version: v1.0
 */


public class CheckAccount extends Account {

 private double overdraft;
 public CheckAccount(int id,double balance,double annualInterestRate){
  super(id,balance,annualInterestRate);
 }

 public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
  super(id, balance, annualInterestRate);
  this.overdraft = overdraft;
 }

 public double getOverdraft() {
  return overdraft;
 }

 public void setOverdraft(double overdraft) {
  this.overdraft = overdraft;
 }

@Override
 public void withdraw(double amount){

  if(getBalance() >= amount){
   super.withdraw(amount);
  }else if(getBalance()+overdraft>=amount){
   overdraft -= amount - getBalance();
   super.withdraw(getBalance());

 }else {
   System.out.println("超过可透支限额");
  }



 }
}
