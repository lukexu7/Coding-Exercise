package chapter02

import scala.io.StdIn

/**
 * ClassName: Test05_StdIn
 * Package: chapter02
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/19 - 15:14
 * @Version: v1.0
 *
 */


object Test05_StdIn {

  def main(args: Array[String]): Unit = {

    println("name:")
    val name = StdIn.readLine()

    println("age:")
    val age = StdIn.readInt()

    print(s"${name},${age},wbd")
  }

}
