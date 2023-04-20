package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/24 20:56
 */
object Test08_Dynamic {

  def main(args: Array[String]): Unit={
    val p1 = new Person8;
    println(p1.name);
    p1.hello()

    val p2:Person8 = new Student8;
    println(p2.name);
    p2.hello();
  }

}

class Person8{
  val name:String="person"
  def hello():Unit={
    println("hello person")
  }
}

class Student8 extends Person8{
  override val name:String="studnet"
  override def hello(): Unit ={
    println("hello student")
  }
}
