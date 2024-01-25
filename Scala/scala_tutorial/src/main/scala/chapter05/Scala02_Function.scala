package chapter05

/**
 * ClassName: Scala02_Function
 * Package: chapter05
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/25 - 16:18
 * @Version: v1.0
 *
 */


object Scala02_Function {

  def main(args: Array[String]): Unit = {

    def test():Unit={
      println("test function")
    }

    test()
    
  }

  def test(): Unit = {
    println("test method")
  }




}
