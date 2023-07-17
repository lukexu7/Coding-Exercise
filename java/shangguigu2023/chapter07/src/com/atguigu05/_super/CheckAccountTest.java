package com.atguigu05._super;

/**
 * ClassName: CheckAccountTest
 * Package: com.atguigu05._super
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/7 - 11:09
 * @Version: v1.0
 */


public class CheckAccountTest {
 public static void main(String[] args) {

  CheckAccount checkAccount = new CheckAccount(1122, 20000, 0.045, 5000);

  checkAccount.withdraw(5000);

  System.out.println("账户余额" + checkAccount.getBalance());
  System.out.println("可透支额" + checkAccount.getOverdraft());

  checkAccount.withdraw(18000);

  System.out.println("账户余额" + checkAccount.getBalance());
  System.out.println("可透支额" + checkAccount.getOverdraft());

  checkAccount.withdraw(18000);

  System.out.println("账户余额" + checkAccount.getBalance());
  System.out.println("可透支额" + checkAccount.getOverdraft());


 }
}
