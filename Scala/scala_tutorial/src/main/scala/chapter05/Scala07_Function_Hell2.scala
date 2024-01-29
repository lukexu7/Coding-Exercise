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


object Scala07_Function_Hell2 {

  def main(args: Array[String]): Unit = {


    def test():Unit={
      println("test...")
    }

    val f = test _
    //变量也是函数
    println(f)
    f()

  }





  


}
