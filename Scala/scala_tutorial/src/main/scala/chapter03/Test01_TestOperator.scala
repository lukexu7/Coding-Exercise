package chapter03

/**
 * ClassName: Test01_TestOperator
 * Package: chapter03
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/23 - 14:58
 * @Version: v1.0
 *
 */


object Test01_TestOperator {

  def main(args: Array[String]): Unit = {

    val result1 = 10/3

    println(result1)

    val result2= 10/3

    println(result2)

    val result3 = 10.0/3

    println(result3)
    println(result3.formatted("%.2f"))


    //2.比较运算符
    val s1 = "hello"
    val s2 = new String("hello")

    println(s1 == s2)
    println(s1.equals(s2))
    println(s1.eq(s2))

    //3.逻辑运算符

    val n = 1
    println((4>5) && m(6)<0)

    def m(n:Int):Int= {
      println("m被调用")
      return n
    }

    def isNotEmpty(str:String):Boolean={
      return !(str=="")
    }
  }

  //4.赋值运算
  var b: Int = 10
  b += 1
  println(b)

  val r = 1.+(1)
  println(r)

  val s1 = new String("123")
  val s2 = new String("123")

  println(s1 equals s2)

}
