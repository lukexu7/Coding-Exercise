package chapter06

object Scala09_Object_Instance_Method_2 {

  def main(args: Array[String]): Unit = {


    val user = new User()
    val user1 = new User("hahaha")
    val user2 = new User(12)







  }

  class User(){

    println("111")
    def this(name:String)= {
      this()
      println("2222")
    }
    println("33333")

    def this(age:Int) = {
      this()
      println("44444")
    }





  }

//  class Us



}
