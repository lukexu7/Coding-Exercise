import java.util.Scanner;

/**
 * ClassName:ForWhileTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/22 - 14:16
 * @Version: v1.0
 */


public class ForWhileTest {

    public static void main(String[] args) {

        forWhileTest1();

    }


    static void forWhileTest1(){


        Scanner scanner = new Scanner(System.in);




        int positive = 0;

        int negative = 0;

        while(true){

            System.out.println("输入整数，0结束程序");
            int num = scanner.nextInt();




            if(num>0){
                positive++;
            } else if (num < 0){
                negative++;
            } else{
                System.out.println("结束");
                break;
            }
        }

        System.out.println("正数个数为:"+positive+",负数个数为:"+negative);

        scanner.close();



    }


}
