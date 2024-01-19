package chapter02

import chapter01.Student

/**
 * ClassName: Test07_DataType
 * Package: chapter02
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/19 - 15:49
 * @Version: v1.0
 *
 */


object Test07_DataType {

  def main(args: Array[String]): Unit = {

    val a1:Byte = 127
    val a2:Byte = -128

    val a3 = 12
    val a4 = 23423234234L

    val b1:Byte = 10
    val b2:Byte = (10+20)

    val b3 = (b1+20).toByte
    println(b3)

    //2.浮点类型
    val f1 = 1.2345f
    val d1 = 2.2343

    //3.字符类型

    val c1 = 'a'
    println(c1)

    val c2 = '9'.toInt

    println(c2)

    val c3 = '\t'
    val c4 = '\n'

    println("abc" +c3 + "def")
    println("123"+c4+"abc")

    val i1:Int = c1

    println("i1:"+i1)

    val i2:Int = c2
    println("i2:"+i2)

    val c7:Char = ((i1+1).toChar)

    //4.布尔类型
    val isTrue = true

    //5.空类型
    //5.1 unit
    def m1():Unit={
      println("m1")
    }

    val a = m1()
    println(a)

    var s = new Student("hah", 20)
    s = null
    println(s)

    //5.3 NOTHING
    def m2(n:Int):Nothing={

      throw new NullPointerException()
    }
//
//    val b = m2(0)
//    println(b)

    def m3(n:Int):Int ={
      if(n==0)
        throw new NullPointerException

      else
        return n
    }

    val d=m3(30)

    println(d)


  }

}
