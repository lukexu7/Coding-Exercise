package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 20:15
 */
object Test1_CommOp {

  def main(args: Array[String]): Unit={
    val list = List(1,3,232,45)
    println(list.length)

    for (i  <- list) println(i)
    list.foreach(println)

    for(elem <- list.iterator) println(elem)

    println(list)

    println(list.contains(34))

  }

}
