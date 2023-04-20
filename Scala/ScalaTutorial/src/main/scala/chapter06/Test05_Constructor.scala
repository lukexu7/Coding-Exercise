package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/24 9:30
 */
object Test05_Constructor {
  def main(args: Array[String]): Unit = {
    val s1 = new Student1
    s1.Student1()
    val s2 = new Student1("shabi");
    val s3 = new Student1("xx",34)

  }

}


class Student1() {
  var name: String = _
  var age: Int = _
  println("1.主构造方法")

  def this(name: String) {
    this()
    println("2.辅助构造方法")
  }

  def this(name: String, age: Int) {
    this(name)
    println("3.辅助构造方法")
  }

  def Student1():Unit={
    println("3.")
  }
}

