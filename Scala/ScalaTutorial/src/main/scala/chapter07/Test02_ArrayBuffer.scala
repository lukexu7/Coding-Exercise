package chapter07

import scala.collection.mutable.ArrayBuffer

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/2 20:38
 */
object Test02_ArrayBuffer {

  def main(args: Array[String]):Unit={
    val arr:ArrayBuffer[Int] = ArrayBuffer(23,56,89);
    val newArr = arr.toArray
    println(newArr.mkString(", "))
    println(arr)

    var buffer = newArr.toBuffer
    println(buffer)
    println(newArr)

  }



}
