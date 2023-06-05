package com.atguigu3.commonAlg.exer3;

/**
 * ClassName: YangHuiTriangle
 * Package: com.atguigu3.commonAlg.exer3
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/6/5 - 19:31
 * @Version: v1.0
 */


public class YangHuiTriangle {
 public static void main(String[] args) {


  int[][] yh = new int[10][];

  for(int i = 0; i < yh.length; i++){
   yh[i] = new int[i+1];
   yh[i][0] = yh[i][i] = 1;
   for(int j = 1; j < yh[i].length - 1; j++){
    yh[i][j] = yh[i-1][j] + yh[i-1][j-1];
   }
  }


  for(int i = 0; i <yh.length;i++){
   for(int j = 0; j < yh[i].length;j++){
    System.out.print(yh[i][j]+"\t");
   }
   System.out.println();
  }


 }
}
