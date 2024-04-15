package chapter06

object Scala14_Object_trait {

  def main(args: Array[String]): Unit = {

    val user = new User()

  }

  trait Run extends Exception{
    println("trait")
  }

  class User extends Exception with Run{
    println("user")
  }

  class Person{

  }
}