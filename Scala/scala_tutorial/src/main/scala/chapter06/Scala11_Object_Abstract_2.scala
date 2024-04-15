package chapter06
import chapter06.Scala11_Object_Abstract_2.User


object Scala11_Object_Abstract_2 {

  def main(args: Array[String]): Unit = {


  }

  abstract class User{
    var name: String
  }

}

class Child extends User{
  var name:String = "haha"
}

