package chapter04

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/15 16:24
 */
object Test03_Multi {
  def main(args: Array[String]): Unit = {
    for (i <- 1 to 9){
      for (j <- 1 to i){
        print(s"$j * $i = ${i*j}\t")
      }
      println()
    }

    for (i <- 1 to 9; j <- 1 to i){
      print(s"${i}*${j} = ${i*j}\t")
      if (i == j) println()
    }
  }

}
