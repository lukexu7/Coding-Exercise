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


object Scala07_Function_Hell_5_Test {

  def main(args: Array[String]): Unit = {


    //注释

    def calc(x:Int, f:(Int,Int)=>Int, y:Int):Int={

      f(x,y)
    }

    def multiply(x:Int,y:Int):Int={
      x*y
    }


    println(calc(5, multiply, 5))

    println(println(calc(5, _ / _, 2)))



    }



  }





  



