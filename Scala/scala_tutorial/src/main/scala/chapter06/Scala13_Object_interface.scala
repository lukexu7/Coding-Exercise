package chapter06

object Scala13_Object_interface {

  def main(args: Array[String]): Unit = {

    val cat = new Cat()
    cat.run()



  }

  trait Run{

    def run():Unit

  }

  class Cat extends Run {


    override def run(): Unit = {

      println("cat run")
    }
  }

  class Person{

  }


  class User extends Person with Run{

    override def run(): Unit = {

      println("man run")
    }
  }

}
