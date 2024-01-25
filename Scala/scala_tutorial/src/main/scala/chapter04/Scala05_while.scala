package chapter04

import scala.io.Source

/**
 * ClassName: Scala05_while
 * Package: chapter04
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/25 - 15:27
 * @Version: v1.0
 *
 */


object Scala05_while {

  def main(args: Array[String]): Unit = {
//    while(true){
//
//      println("xxxx")
//
//
//    }

    do {
      println("xxx")
    } while (false)

    val source = Source.fromFile("abc.txt")

    val iter = source.getLines()

    while(iter.hasNext){
      println(iter.next())
    }

    source.close()


  }

}
