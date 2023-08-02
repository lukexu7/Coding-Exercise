package com.atguigu01._static.apply;

/**
 * ClassName: AccountTest
 * Package: com.atguigu01._static.apply
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/18 - 18:13
 * @Version: v1.0
 */


public class AccountTest {
 public static void main(String[] args) {

  Account acc1 = new Account();

  System.out.println(acc1);


  Account acc2 = new Account("123456", 2000);
  System.out.println(acc2);

  System.out.println(Account.getMinBalance());
  System.out.println(Account.getInterestRate());


 }
}
