package com.atguigu3.commonAlg.exer5;

/**
 * ClassName: ArrayExer01
 * Package: com.atguigu3.commonAlg.exer5
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/6/6 - 14:35
 * @Version: v1.0
 */


public class ArrayExer01 {
 public static void main(String[] args) {

  int[] arr1 = new int[]{1,2,3,4,5,6,7};

  for(int i = 0; i<arr1.length/2;i++){
   int temp = arr1[i];
   arr1[i] = arr1[arr1.length-1-i];
   arr1[arr1.length-1-i] = temp;
  }
  for(int n:arr1){

   System.out.print(n+"\t");
  }


  for(int i =0, j = arr1.length-1;i<j;i++,j--){
   int temp = arr1[i];

  }




 }
}
