package chapter07

import scala.math.Ordered.orderingToOrdered

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 20:41
 */
object Test13_SimpleFunciton {

  def main(args: Array[String]): Unit ={
    val list1 = List(1,2,3,4,5,6,7)
    val list2 = List(("a",1),("b",3),("d",4),("c",10))

    println(list1.reduce(_+_))
    println(list1.sum)
    println(list1.product)
    println(list1.max)
    println(list1.min)
    println(list1.map(_ + 1))
    println(list2.maxBy(_._2))
    println(list2.minBy(_._1))


    println(list1.sorted)
    println(list1.sorted(Ordering[Int].reverse))

    println(list2.sortBy(_._2))
    println(list2.sortBy(_._2)(Ordering[Int].reverse))

    println(list2.sortWith((_<_)))
    println(list2.sortWith((_>_)))
    println(list2.sortWith((_._2<_._2)))
    println(list2.sortWith((_._2>_._2)))
  }

}
