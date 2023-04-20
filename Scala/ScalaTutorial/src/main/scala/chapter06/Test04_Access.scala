package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/24 9:15
 */
object Test04_Access {

  def main(args: Array[String]): Unit = {
    val person:Person = new Person()

  }

}

class Worker extends Person {
  override def printInfo(): Unit = {
    println("Worker: ")
    name = "sdfsf"
    age = 34
    sex = "female"
  }
}