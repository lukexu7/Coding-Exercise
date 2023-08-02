package com.atguigu01._static.exer2;

/**
 * ClassName: MyArrays
 * Package: com.atguigu01._static.exer2
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/7/18 - 18:19
 * @Version: v1.0
 */


public class MyArrays {

 public static int getMax(int[] arr){

  int max = arr[0];

  for(int i = 0; i < arr.length; i++){

   if(max < arr[i]){
    max = arr[i];
   }

  }
  return max;
 }

 public static int getMin(int[] arr){

  int min= arr[0];

  for(int i = 0; i < arr.length; i++){

   if(min > arr[i]){
    min = arr[i];
   }

  }
  return min;
 }

 public static int getSum(int[] arr){
  int sum =0;
  for(int i = 0;i<arr.length;i++){
   sum += arr[i];
  }
  return sum;
 }

 public static int getAvg(int[] arr){
  return getSum(arr)/arr.length;
 }

 public static void print(int[] arr){
  System.out.println("[");

  for(int i= 0;i<arr.length;i++){
   if(i==0){
    System.out.println(arr[i]);
   } else{
    System.out.println(","+arr[i]);
   }
  }
  System.out.println("]");
 }

 public static int[] copy(int[] arr){
  int[] newArr = new int[arr.length];
  for(int i = 0;i<arr.length;i++){
   newArr[i] = arr[i];
  }
  return newArr;
 }

 public void reverse(int[] arr){
  for(int i= 0, j=arr.length-1;i<j;i++,j--){
   int temp=arr[i];
   arr[i] = arr[j];
   arr[j] = temp;
  }
 }
 public static void sort(int[] arr){

  for(int j = 0; j< arr.length-1;j++){
   for(int i = 0; i<arr.length-1-j;i++){
    if(arr[i] > arr[i+1]){
     int temp = arr[i];
     arr[i] = arr[i+1];
     arr[i+1] = temp;
    }
   }
  }
 }

 public static int binearSearch(int[] arr, int target){

  for(int i = 0; i < arr.length; i++){
   if(target ==arr[i]){
    return i;
   }
  }

  return -1;
 }

}
