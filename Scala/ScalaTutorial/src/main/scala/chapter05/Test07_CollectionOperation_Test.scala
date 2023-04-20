package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/23 9:03
 */
object Test07_CollectionOperation_Test {

  val arr:Array[Int]=Array(12,34,53)
  def main(args: Array[String]): Unit = {
    def arrayOperation(array:Array[Int],op:Int=>Int):Array[Int]={
      for(elem <- array) yield op(elem)
    }
    def addOne(elem:Int)={
      elem+1
    }

    val newArray = arrayOperation(arr,addOne)
    println(newArray.mkString(","))

    val newArray2 = arrayOperation(arr, (x:Int) =>x*2)
    println(newArray2.mkString(","))

  }

}
