package chapter08

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 11:32
 */
object TEST04_MatchObject {

  def main(args: Array[String]) :Unit={

    val student = new Student(name="bob",age=18)

    val result = student match {
      case Student("bob",18) => "bob 18"
      case _ => "esle"
    }

    println(result)
  }

  }

  class Student(val name:String, val age:Int)

  object Student{
    def apply(name:String, age:Int): Student=new Student(name,age)
    def unapply(student:Student):Option[(String,Int)]={
      if (student==null){
        None
      } else {
        Some(student.name,student.age)
    }

  }

}
