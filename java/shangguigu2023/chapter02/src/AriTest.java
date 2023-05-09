import org.junit.Test;

/**
 * ClassName:AriTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/9 - 15:30
 * @Version: v1.0
 */


public class AriTest {

 public static void main(String[] args) {

  int m1 =12;
  int n1 = 5;
  System.out.println(m1/n1);

  System.out.println(m1/n1*n1);

  //取模

  int i1 = 2;
  int j1 = 5;
  System.out.println(i1 % j1);


  //附属

  exe1(153);

  exe2(89);

 }


 public static void exe1(int num){
  int ge = num % 10;
  int shi = num % 100 / 10;
  int bai = num / 100;

  System.out.println("ge="+ge+",shi="+shi+",bai="+bai);
 }

 public static void exe2(int hr){

  int day = hr / 24;
  int hour = hr % 24;

  System.out.println("day:"+day+"hr"+hour);


 }

 @Test
 public void srTest(){
  System.out.println("5+5="+5+5);
 }

 @Test
 public void exe4(){

  int i = 1;
  int j = i ++ + ++i * i++;

  System.out.println("j="+j); // j = 10;
 }


 @Test
 public void exe5(){

  int i = 2;
  int j = i++;

  System.out.println("j="+j);

  int m = 2;
  m = m++;
  System.out.println("m="+m);


 }


}
