package com.atguigu2.two.exer1;

/**
 * ClassName: ArrayExec01
 * Package: com.atguigu2.two.exer1
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/6/5 - 17:22
 * @Version: v1.0
 */


public class ArrayExec01 {

 public static void main(String[] args) {


int[][] arr = new int[][]{{2,5,5},{2,2,1},{23,2,1}};
int result = 0;
  for(int i = 0; i < arr[0].length;i++){
   for(int j = 0; j<arr[i].length;j++){
    result += arr[i][j];
   }
  }

  System.out.println(result);

 }
}
