package chapter01

/**
 * ClassName: Student
 * Package: chapter01
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/18 - 15:32
 * @Version: v1.0
 *
 */


class Student(name:String,var age:Int) {

  def printInfo():Unit={

    println(name + "" + age + " " + Student.school )

  }





}

object Student{
  val school = "harvard";

  def main(args:Array[String]):Unit={
    val alice = new Student("alice", 20)

    val bob = new Student("bob", 21)

    alice.printInfo();
    bob.printInfo()
  }
}