package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/24 21:12
 */
object Test10_AnnoymousClass {

  def main(args: Array[String]): Unit={
    val person = new Person10{
      override var name: String = "sdfsdf"

      override def eat(): Unit = println("perons eat")


    }
    println(person.name)
    person.eat()
  }

}

abstract class Person10{
  var name:String
  def eat():Unit
}
