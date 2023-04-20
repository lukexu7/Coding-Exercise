package chapter08

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 11:41
 */
object Test05_MatchOject {

  def main(args: Array[String]) :Unit={
    val student1 =  Student1("alice",19)

    val result = student1 match{
      case Student1("Alice",19) => "Alice,19"
      case _ => "else"
    }
    println(result)
  }

}

case class Student1(name:String,age:Int)
