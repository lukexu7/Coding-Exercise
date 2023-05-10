/**
 * ClassName:LogicTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/10 - 11:46
 * @Version: v1.0
 */


public class LogicTest {
 public static void main(String[] args) {


  int num2 = 10;

  boolean b2 = true;
  b2 = false;

  if (b2 && (num2++)>0){
   System.out.println("哈哈哈");
  } else{
   System.out.println("fffff");
  }

  System.out.println("num2="+num2);



 }
}
