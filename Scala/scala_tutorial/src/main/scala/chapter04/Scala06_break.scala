package chapter04

import scala.util.control.Breaks

/**
 * ClassName: Scala06_break
 * Package: chapter04
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/25 - 15:37
 * @Version: v1.0
 *
 */


object Scala06_break {

  def main(args: Array[String]): Unit = {
    Breaks.breakable {

      for (i <- Range(1, 5)) {
        if (i == 3) {

          Breaks.break()

        }
        print(i)
      }
    }
    println("main完毕")
  }




}
