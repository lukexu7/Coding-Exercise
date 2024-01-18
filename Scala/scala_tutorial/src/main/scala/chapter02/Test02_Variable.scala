package chapter02

import chapter01.Student

/**
 * ClassName: Test02_Variable
 * Package: chapter02
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/18 - 16:27
 * @Version: v1.0
 *
 */


object Test02_Variable {

  def main(args: Array[String]): Unit = {


    var a = 10

    var a1:Int = 10

    val b1 = 23


    var a2 = 15

    var haha = new Student("haah", 20)

    val bob = new Student("bob",23)
    bob.age = 24;
    bob.printInfo()






  }

}
