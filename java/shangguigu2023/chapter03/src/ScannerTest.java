import java.lang.reflect.Type;
import java.util.Scanner;

/**
 * ClassName:ScannerTest
 * Package: PACKAGE_NAME
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/5/15 - 11:31
 * @Version: v1.0
 */


public class ScannerTest {
 public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);

  System.out.println("输入网名:");

  String name = scanner.next();
  System.out.println("name="+name);

  System.out.println("年龄:");
  int age = scanner.nextInt();
  System.out.println(("age:" + age));

  System.out.println("体重:");
  double weight = scanner.nextDouble();
  System.out.println(("weight:" + weight));


  System.out.println("单身:");
  boolean isSingle = scanner.nextBoolean();

  System.out.println("isSingle="+isSingle);

  System.out.println("性别:");
  char sex = scanner.next().charAt(0);
  System.out.println(("sex:" + sex));


  System.out.println("完成");
  scanner.close();
 }
}
