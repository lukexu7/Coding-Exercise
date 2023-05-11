/**
 * ClassName:BitTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/11 - 11:38
 * @Version: v1.0
 */


public class BitTest {

 public static void main(String[] args) {

  int num1 = 7;

  System.out.println("num1<<28"+(num1<<28));
  System.out.println("num1<<29"+(num1<<29));

  swap(10,5);
 }

 static void swap(int m, int n){

  m ^= n ;
  n = m ^ n;
  m ^= n;

  System.out.println("m="+m+",n=" + n);
 }

 static void swap2(int m, int n){

  m = m + n;
  n = m - n;
  m = m - n;

  System.out.println("m="+m+",n=" + n);
 }
}
