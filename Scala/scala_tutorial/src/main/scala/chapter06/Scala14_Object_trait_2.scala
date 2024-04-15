package chapter06

object Scala14_Object_trait_2 {

  def main(args: Array[String]): Unit = {


    val user = new User()



  }

  trait MyTrait{
    println("trait")
  }

  trait MyTrait1{
    println("trait1")
  }



  class Parent extends MyTrait1 {

    println("parent")
  } //初始化只执行一次

  class User extends Parent with MyTrait with MyTrait1 {
    println("class user")
  }


}