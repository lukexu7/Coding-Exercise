package chapter06

import chapter06.Scala07_Object_Method.User

object Scala08_Object_Instance {

  def main(args: Array[String]): Unit = {

    val user = new User();

    val user1 = User();
    println(user1)
    //scala采用方法构建对象



  }


  class User(){

  }


  object User{
    //def apply():User = new User()

    def apply():Int = 3+5
  }
}