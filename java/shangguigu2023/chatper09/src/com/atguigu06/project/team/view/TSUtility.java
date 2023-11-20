package com.atguigu06.project.team.view;

import java.util.Scanner;

/**
 * ClassName: TSUtility
 * Package: com.atguigu06.project.team.view
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/9/19 - 11:40
 * @Version: v1.0
 */


public class TSUtility {

    private static Scanner scanner = new Scanner(System.in);

    public static char readMenuSelection(){
        char c;

        for(;;){

            readKeyBoard(1,false);

            c = str.charAt(0);

            if(c != '1' && c !='2' && c!='3' && c!='4'){
                System.out.println(("选择错误，请重新输入"));
            } else break;

        }

        return c;
    }
}

public static void readReturn(){
    System.out.println(("按回车键继续"));

}

public static int readInt(){
    int n;
    for(;;){

    }
}

public static String readKeyBoard(int limit,boolean blankReturn){

    String line = " ";
    while(scanner.hasNextLine()){
        line = scanner.nextLine();
        if(line.length()==0){
            if(blankReturn) return line;
            else continue;
        }
        if(line.length() < 1 || line.length() > limit){
            System.out.println("输入长度不大于" + limit + "错误，请重新输入:");
            continue;

}
break;
    }
    return line;
}


}