/**
 * ClassName:ForForTest
 * Package: PACKAGE_NAME
 * Description:嵌套循环
 *
 * @Author: XZY
 * @Create: 2023/5/22 - 14:31
 * @Version: v1.0
 */


public class ForForTest {

 public static void main(String[] args) {


//  for(int i = 1 ; i <= 6; i++){
//
//   System.out.print('*');
//  }
//
//  System.out.println("\n");
//
//  for(int i = 0; i<=4;i++){
//   for (int j = 0; j <=5;j++){
//    System.out.print("*");
//   }
//  System.out.println();
//  }
//
//  for(int i = 1;i<=5;i++){
//   for(int j = 1;j<=i;j++){
//    System.out.print("*");
//   }
//   System.out.println();
//  }
//
//  for(int i = 1;i<=5;i++){
//   for(int j = 1;j<=5-i+1;j++){
//    System.out.print("*");
//   }
//   System.out.println();
//  }
//
//  /*
//  *
//  * ***
//  * *****
//  * *******
//  *
//   */
//
//  for(int i = 1; i <= 5; i++){
//   for(int j = 1; j <= 10 - 2*i;j++){
//    System.out.print(" ");
//   }
//
//   for(int k = 1;k<=2*i-1;k++){
//    System.out.print("* ");
//   }
//
//   System.out.println(" ");
//
//
//  }
//
//  for(int i = 1;i<=4;i++){
//
//   for(int j = 1; j<= 2*i;j++){
//
//    System.out.print(" ");
//
//   }
//
//   for(int k = 1;k<=10-2*i-1;k++){
//    System.out.print("* ");
//
//
//   }
//   System.out.print("\n");
//  }

  //99
  nNTable(10);


 }


 static void nNTable(int num){

  for(int i =1 ; i<=num; i++){
   for(int j =1; j<=i;j++){
    System.out.print(i+"*"+j+"="+(i*j)+"\t");
   }
   System.out.println(" ");
  }

 }
}
