/**
 * ClassName:ForTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/18 - 11:30
 * @Version: v1.0
 */


public class ForTest {

 public static void main(String[] args) {

//  for  (int i = 1; i<=9; i++){
//   for (int j = 0; j<= 9; j++){
//    for (int k = 0; k<=9; k++){
//     if (i*i*i + j*j*j +  k*k*k ==  i*100+j*10+k){
//
//      System.out.println((i * 100 + j * 10 + k) + "=" + i + "^3+" +j + "^3+"+k + "^3" );
//
//     }
//    }
//   }
//  }
////水仙花数
//  for (int i = 100; i<=999;i++){
//   int g = i % 10;
//   int s = i %100 /10;
//   int b = i /100;
//
//   if  (g*g*g + s*s*s+b*b*b == i){
//    System.out.println(i+ "=" + g + "^3+" +s + "^3+"+b+ "^3" );
//   }
//  }

gcdlcm(12,20);


 }

 //求最大公约数 最小公倍数
 static void gcdlcm(int m,int n){

  int min = (m>n)?n:m;
  int max = (m>n)?m:n;

  int gcd = 0;

  int lcm = m * n;

  for (int i = min; i>=1; i--){

   if (m %i ==0  && n % i ==0){

    gcd = i;

    System.out.println("gcd=" + i);
    break;

   }}

   for (int j = max; j <= m*n; j++ ){
    if (j % m == 0 && j % n ==0){
     lcm = j;
     System.out.println("lcm=" + j);
     break;
    }
    }
   }



  }




