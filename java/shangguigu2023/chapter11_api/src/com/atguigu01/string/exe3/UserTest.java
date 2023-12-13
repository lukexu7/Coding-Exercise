package com.atguigu01.string.exe3;

import java.util.Scanner;

/**
 * ClassName: UserTest
 * Package: com.atguigu01.string.exe3
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/11/22 - 18:53
 * @Version: v1.0
 */


public class UserTest {
    public static void main(String[] args) {



        User[] arr = new User[3];
        arr[0] =new User("tom","999");
        arr[1] = new User("songhk","134");
        arr[2] = new User("jsdf", "3434");
        System.out.println("库中用户有:");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }

        Scanner scan = new Scanner(System.in);




        scan.close();





    }
}
