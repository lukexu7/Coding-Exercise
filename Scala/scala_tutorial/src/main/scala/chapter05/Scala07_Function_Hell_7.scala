package chapter05

/**
 * ClassName: Scala03_Function
 * Package: chapter05
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/25 - 16:58
 * @Version: v1.0
 *
 */


object Scala07_Function_Hell_6 {

  def main(args: Array[String]): Unit = {


    // TODO

    def outer()={
      def inner():Unit={

        println("inner")

      }
      inner _
    }

    val f= outer()
    f()
    println(f())


  }


}


  



