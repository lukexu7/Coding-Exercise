package chapter01

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/12 21:08
 */
class Student (name:String, age:Int){

  def printInfo():Unit = {
    println(name+" "+age+" "+ Student.school)
  }

}

object Student{
  val school = "atguigu"

  def main(args: Array[String]): Unit ={
    val alice = new Student(name = "alice", age = 20)
    val bobl = new Student(name = "bobl", age = 23)

    alice.printInfo()
    bobl.printInfo()
  }
}