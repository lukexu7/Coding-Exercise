package chapter06

object Scala14_Object_trait_1 {

  def main(args: Array[String]): Unit = {

    val user = new User() with update

    user.insertUser()
    user.updateUser();




  }

  trait update{
    def updateUser():Unit={
      println("update user")
    }
  }

  class User{
    def insertUser():Unit={
      println("insert user...")
    }
  }

}