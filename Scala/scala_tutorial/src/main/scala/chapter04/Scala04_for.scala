package chapter04

/**
 * ClassName: Scala04_for
 * Package: chapter04
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/24 - 18:11
 * @Version: v1.0
 *
 */


object Scala04_for {

  def main(args: Array[String]): Unit = {

    //todo 循环控制

    val array = 1 to 5
    val array1 = 1 until 5
    for(i:Int <-array){
      println(i)
    }
    for (i <- array1){
      println(i)
    }

    val array2 = Range(1,5)

    for(i:Int <- array2){
      println(i)
    }
    

  }

}
