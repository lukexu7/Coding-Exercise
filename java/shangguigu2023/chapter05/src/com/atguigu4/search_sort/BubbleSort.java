package com.atguigu4.search_sort;

/**
 * ClassName: BubbleSort
 * Package: com.atguigu4.search_sort
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/6/7 - 16:08
 * @Version: v1.0
 */


public class BubbleSort {

 public static void main(String[] args) {

  int[] arr = {2,6,1,4,7,9,6};

  int[] res = bubbleSort(arr);

  for(int i : res){
   System.out.print(i+"\t");
  }
 }

 static int[] bubbleSort(int[] arr){
  for(int i = 0; i <= arr.length-2; i++){
   for(int j = 0; j <= arr.length - 2 - i; j++){
    int temp = arr[j+1];
    if(arr[j] > arr[j+1]){
     arr[j+1]= arr[j];
     arr[j]= temp;
    } else continue;


   }
  }
  return arr;
 }
}
