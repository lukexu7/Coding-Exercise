package chapter04

import scala.io.StdIn

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/15 12:44
 */
object Test01_IfElse {
  def main(args: Array[String]):Unit = {
    println("输入年龄")
    val age = StdIn.readInt()


    val result = if (age <= 15){
      "少年"
    } else if(age <= 30){
      "青年"
    } else if (age <= 65){
      "中老年"
    } else {
      "老年"
    }

    println("result:"+result)

    val result2: String = if (age >= 19) "成年" else "未成年"
    println("result2"+result2)
  }

}
