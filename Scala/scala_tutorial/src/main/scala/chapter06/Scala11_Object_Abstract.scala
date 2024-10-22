

object Scala11_Object_Abstract {

  def main(args: Array[String]): Unit = {

    println("hello world")

  }

  abstract class User{

    def test():Unit

  }

  class ChildUser extends User{

    def test():Unit={

    }


  }









}
