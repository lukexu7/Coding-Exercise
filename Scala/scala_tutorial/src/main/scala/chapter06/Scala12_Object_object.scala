package chapter06

object Scala12_Object_object {

  def main(args: Array[String]): Unit = {

    val user1 = new User()
    val user2 = User
    val user3 = User.apply()
    val user4 = User()

  }

  class User{
    println("user")
  }

  object User{
    def apply():User={
      println("apply")
      new User()
    }
  }

}
