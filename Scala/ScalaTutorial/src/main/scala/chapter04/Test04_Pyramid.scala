package chapter04

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/15 16:34
 */
object Test04_Pyramid {
  def main(args: Array[String]):Unit={
//    for (i <- 1 to 9){
//      val stars = 2 * i - 1
//      val spaces = 9- i
//      println(" "*spaces+"*"*stars);
//    }

    for (i <- 1 to 9; stars = 2*i-1;spaces=9-i){
      println(" "*spaces+"*"*stars);
    }

  }

}
