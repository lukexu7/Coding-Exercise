package chapter02

import scala.io.StdIn

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/12 22:04
 */
object Test05_StdIn {
  def main(args: Array[String]) {
    println("your name")
    val name = StdIn.readLine()
    println("your age")
    val age = StdIn.readInt()

    println(s"${name} is ${age}'s old")
  }
}
