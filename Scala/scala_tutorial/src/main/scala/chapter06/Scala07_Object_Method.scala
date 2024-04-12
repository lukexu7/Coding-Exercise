package chapter06

object Scala07_Object_Method {

  def main(args: Array[String]): Unit = {

    val user = new User()

    println(user.isInstanceOf[User])
//    user.asInstanceOf

  }

  class User{

    def test(): Unit = {

    }


  }


  object User{

    def test():Unit={
      println("object user test")
    }

  }

}
