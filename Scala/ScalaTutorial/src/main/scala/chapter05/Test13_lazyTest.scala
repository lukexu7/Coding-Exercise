package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/23 11:45
 */
object Test13_lazyTest {
  def main(args: Array[String]): Unit ={
    lazy val result:Int = sum(3,5)
    println("1. 函数调用")
    println("2.result="+result)

    println(result)
  }

  def sum1(a:Int,b:Int):Int={
    a + b
  }

  def sum2(a:Int,b:Int):Int = a + b;

  def sum3(a:Int,b:Int) = a + b;



  val sum: (Int,Int) =>Int = _+_


}
