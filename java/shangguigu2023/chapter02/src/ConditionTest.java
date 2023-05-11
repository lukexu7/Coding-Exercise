/**
 * ClassName:ConditionTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/11 - 14:38
 * @Version: v1.0
 */


public class ConditionTest {

 public static void main(String[] args) {

  String info = (5 > 3) ? "5" : "3";
  System.out.println(info);

  float result = (2>1) ? 1:2.0f;
  System.out.println(result);

  System.out.println(compare(5, 4));

  int i = 0;
  i = ++i;
  System.out.println(i);

  double x = 0.1+0.2;
  System.out.println(x);
 }

 //获取较大值

 static int compare(int m, int n){
  return (m>n)? m:n;
 }
}
