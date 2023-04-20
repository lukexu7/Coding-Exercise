package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/1 9:05
 */
object Test13_trait {
  def main(args: Array[String]): Unit = {
    val student13 = new Student13
    student13.sayHello();
  }

}

class Perosn13{
  val name:String="perosn"
  var age:Int= 19
  def sayHello():Unit={
    println("hello" + name);
  }
}

trait Young{
  var age:Int
  val name:String="young"
  def play():Unit={
    println("play")
  }

  def xxoo():Unit
}
class Student13 extends  Perosn13 with Young{

  override val name:String ="CR7"
  override def xxoo(): Unit = println(s"studnet $name")

  def study():Unit={
    println(s"$name is studyting")
  }

  override def sayHello():Unit={


    super.sayHello()
    println(s"hell from stuent $name")
  }
}
