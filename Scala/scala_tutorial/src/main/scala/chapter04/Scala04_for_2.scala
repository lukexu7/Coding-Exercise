package chapter04

/**
 * ClassName: Scala04_for_2
 * Package: chapter04
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/25 - 14:43
 * @Version: v1.0
 *
 */


object Scala04_for_2 {

  def main(args: Array[String]): Unit = {

    val result = for( i <- 1 to 3){
//      i
    }

    println(result)

    val result1 = for (i <- 1 to 3) yield{
      i * 2
    }

    println(result1)

    Thread.`yield`()




  }

}
