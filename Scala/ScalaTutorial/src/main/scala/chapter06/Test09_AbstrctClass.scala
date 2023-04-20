package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/24 21:06
 */
object Test09_AbstrctClass {

  def main(args: Array[String]): Unit ={

  }

}

abstract class Person9{
  val name:String="person"
  var age:Int

  def eat():Unit={
    println("")
  }

  def sleep():Unit
}

class Student9 extends Person9{
  var age = 18;
  def sleep():Unit={
    println("student sleep")
  }
}
