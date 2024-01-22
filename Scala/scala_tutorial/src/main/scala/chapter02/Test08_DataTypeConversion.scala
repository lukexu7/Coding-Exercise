package chapter02

/**
 * ClassName: Test08_DataTypeConversion
 * Package: chapter02
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/22 - 17:39
 * @Version: v1.0
 *
 */


object Test08_DataTypeConversion {

  def main(args: Array[String]): Unit = {


    val a1 = 10;
    val b1 = 2354

    val result1:Long = a1+b1
    val result11:Int = (a1+b1.toInt)

    val a2:Byte = 10
    val b2:Int = a2

    val a3:Byte = 10
    val b3:Char='b'

    val c3:Char=b3
    println(c3)

    val a4:Byte =12
    val b4:Short=25
    val c4:Char = 'c'
    val r4=a4+b4
    val r44=a4+b4+c4
    println(r4)
    println(r44)

    /*
    2.强制类型转换
     */

    val n1: Int = 2.5.toInt

    val n2:Int=(2.6.toInt+3.7.toInt)

    val n3:Int=(2.6+3.7).toInt

    //3.数值和string转换
    val n:Int = 27
    val s:String = n+""
    println(s)

    //string转数值
    val m  ="12".toInt
    val f:Float ="12.3".toFloat
    val f2:Int= "12.3".toFloat.toInt






  }

}
