package chapter04

import scala.util.control.Breaks

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/15 16:57
 */
object Test06_Break {
  def main(args: Array[String]): Unit = {

    //    try{
    //      for (i <- 0 until  5){
    //        if (i == 3){
    //          throw new RuntimeException
    //        }
    //        println(i)
    //      }
    //      } catch {
    //      case e:Exception =>
    //    }
    //    println("out")
    //  }

    Breaks.breakable(for (i <- 1 to 8) {
      if (i == 4) Breaks.break()
      print(i)
    })

  }
}