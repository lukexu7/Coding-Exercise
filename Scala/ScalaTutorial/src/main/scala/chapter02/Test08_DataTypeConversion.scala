package chapter02

import scala.language.postfixOps

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/13 20:59
 */
object Test08_DataTypeConversion {

  def main(args: Array[String]) {
    val a1 = 10;
    val b1 = 2453L;


    val a2: Byte = 10;
    val a4 = 1234.434f;
    val a3: Byte = 10;
    val b3: Char = 'b';
    val c3: Byte = b3.toByte


    val n1 = 2.5.toInt;
    println(n1)

    val n2 = 2.6 + 3.7.toInt;
    println(n2)

    val n= 27;
    println(n.toString)
    println(n+"")

    val m = "12".toInt;
    val f2 = "12.3".toDouble.toInt;
    println(f2)
  }
}