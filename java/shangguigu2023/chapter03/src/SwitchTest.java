import java.util.Scanner;

/**
 * ClassName:SwitchTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/16 - 11:04
 * @Version: v1.0
 */


public class SwitchTest {
 public static void main(String[] args) {

  int num = 1;

  switch(num){

   case 0:
    System.out.println("zero");
   case 1:
    System.out.println("one");

   case 2:
    System.out.println("two");

  }

  Scanner input = new Scanner(System.in);

  System.out.println("请输入月份");
  int month = input.nextInt();

  System.out.println("请输入天");
  int day = input.nextInt();

  int sumDays =  0;

  switch(month){

   case 12:
    sumDays += 30;
   case 11:
    sumDays += 31;
   case 10:
    sumDays += 30;
   case 9:
    sumDays += 31;
   case 8:
    sumDays += 31;
   case 7:
    sumDays += 30;
   case 6:
    sumDays += 31;
   case 5:
    sumDays += 30;
   case 4:
    sumDays += 31;
   case 3:
    sumDays += 28;
   case 2:
    sumDays += 31;
   case 1:
    sumDays += day;
   default:
    System.out.println("是2023年第" + sumDays + "天");

  }

  input.close();


 }



}
