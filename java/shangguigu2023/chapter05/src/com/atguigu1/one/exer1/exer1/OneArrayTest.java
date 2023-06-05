package com.atguigu1.one.exer1.exer1;

/**
 * ClassName: OneArrayTest
 * Package: com.atguigu1.one.exer1.exer1
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/25 - 16:55
 * @Version: v1.0
 */


public class OneArrayTest {
 public static void main(String[] args) {

  int num1 =10;

  double[] prices;
  prices = new double[]{20.23,32.21};

  String[] foods =new String[4];

  int[] arr = {2,3,5,2,3};

  int arlr[] = new int[4];

//  数组元素的调用
  //通过角标方式，获取数组元素



  //遍历数组
  for(double a:arr){
   System.out.println(a);
  }

  for (int i = 0; i < arr.length; i++) {
   System.out.println(i);

  }


  int[] arr3 = new int[5];
  System.out.println(arr3[2]);

  short[]  arr2 = new short[3];




 }
}
