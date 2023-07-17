package com.atguigu05._super;

/**
 * ClassName: AccountTest
 * Package: com.atguigu05._super
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/7 - 10:50
 * @Version: v1.0
 */


public class AccountTest {
 public static void main(String[] args) {

  Account acct = new Account(1122, 20000, 0.054);

  acct.withdraw(30000);
  System.out.println(acct.getBalance());

  acct.withdraw(2500);

  acct.deposit(3000);

  System.out.println(acct.getBalance());

  System.out.println(acct.getMonthlyInterest());
 }
}
