import java.util.Random;
import java.util.Scanner;

/**
 * ClassName:WhileTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/19 - 11:33
 * @Version: v1.0
 */


public class WhileTest {
 public static void main(String[] args) {

  int i = 1;
  while (i <= 10) {
   System.out.println("fuck");
   i++;
  }

  System.out.println(i);

  zmlm(8848,0.1);


 }

 public static void guessNumber() {

  int count = 1;


  int correct = (int) (Math.random() * 100) + 1;

  Scanner scanner = new Scanner(System.in);

  System.out.println("请输入你猜的1-100数字");

  int guess = scanner.nextInt();

  while (guess != correct) {
   if (guess > correct) {
    System.out.println("猜大了");


   } else {
    System.out.println("猜小了");

   }

   count++;

   guess = scanner.nextInt();
  }

  System.out.println("猜对了" + ",你猜了" + count + "次");

  scanner.close();


 }


 public static void zmlm(double height, double houdu) {

  int count = 0;
  while (houdu <= height) {
   houdu *= 2;
   count++;
  }

  System.out.println("你折了"+count+"次"+",超过了"+height);


 }
}