package chapter05

import scala.collection.mutable.ArrayBuffer

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/20 11:04
 */
object Test06_HighOrderFunction {

  def main(args: Array[String]): Unit = {
//    def map(arr:Array[Int],op:Int=>Int): Unit ={
//      for(elem <- arr) yield op(elem)
//    }
//
//    val arr=map(Array(1,2,3,4),(x:Int)=>{x*x})
//    println(arr.mkString(","))
//
//    def filter(arr:Array[Int],op:Int => Boolean)={
//
//      val arr1:ArrayBuffer[Int] = ArrayBuffer[Int]()
//
//      for(elem <- arr if op(elem)){
//        arr1.append(elem)
//      }
//
//      arr1.toArray
//    }
//    var arr1=filter(Array(1,2,3,4),_%2==1)
//    println(arr1.mkString(","))

 def f5():Int=>Unit= {
   def f6(a: Int): Unit = {
     println("a")
   }
 f6
 }
val f6 = f5()
    println(f6(5))


  }

}
