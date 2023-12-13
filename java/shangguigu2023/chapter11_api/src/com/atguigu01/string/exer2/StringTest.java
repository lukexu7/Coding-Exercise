package com.atguigu01.string.exer2;

import org.junit.Test;

/**
 * ClassName: StringTest
 * Package: com.atguigu01.string.exer2
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/11/22 - 16:53
 * @Version: v1.0
 */


public class StringTest {

    @Test
    public void test(){
        String s = "abcdefg";
        String s1 = reverse1(s,2,5);
        System.out.println(s1);

    }

    public String reverse(String str, int fromIndex, int toIndex){

        char[] arr = str.toCharArray();

        for(int i= fromIndex, j= toIndex;i<j;i++,j--){
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        return new String(arr);
    }

    public String reverse1(String str, int fromIndex, int toIndex){

        String finalStr = str.substring(0,fromIndex);
        for (int i = toIndex; i >= fromIndex; i--) {

            finalStr += str.charAt(i);

        }

        finalStr += str.substring(toIndex+1,str.length());

        return finalStr;

    }

    public int getSubStringCount(String str,String subStr){

        int count =0;

        int index = str.indexOf(subStr);

        while(index >= 0){
            count ++;

            index = str.indexOf(subStr, index + subStr.length());
        }


        return count;


    }



}
