package chapter09

import scala.language.postfixOps

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 13:35
 */
object Test02_Implicit {

  def main(args: Array[String]) :Unit={

//    implicit def convert(num:Int) :MyRichInt = new MyRichInt(num)
//    println(12.myMax(15))
  implicit class MyRichInt(val self:Int) {

  def myMax(n:Int):Int = if (n < self) self else n
  def myMin(n:Int):Int = if (n<self) n else self
}
implicit val x:Int = 343;
    println(12.myMin(34))
implicit  val str = "bob"
    def sayHello(name:String):Unit={
      println("hello,"+name)
    }
    def sayHi(implicit name:String):Unit={
      println("hi,"+name)
    }
    sayHello("alice")
    sayHi

    def hiAge():Unit={
      println("hi"+implicitly[Int])
    }
    hiAge()

  }

}

class MyRichInt(val self:Int) {

def myMax(n:Int):Int = if (n < self) self else n
def myMin(n:Int):Int = if (n<self) n else self
  }
