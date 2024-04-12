package chapter06

object Scala09_Object_Instance_Method {

  def main(args: Array[String]): Unit = {


    val user = new User()


    val user1 = new User
    user1.User()



  }

  class User(){

    println("user instance...")
    def User() = {}

    println("user instance")


  }

//  class User(name:String){
//    println("user with name instance")
//  }




}
