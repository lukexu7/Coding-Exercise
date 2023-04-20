package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/1 20:20
 */
object Test01_ImmutableArray {

  def main(args: Array[String]): Unit={


    val arr:Array[Int] = Array[Int](5)
    val arr2 = Array(12,34,31,54,12)
    println(arr2(4))



    arr2.:+(73)

    arr2.+:(30)

    val arr3 = arr2 :+ 15
    val a4 = 19 +: arr2
  }
}
