package chapter07

import scala.collection.mutable.ListBuffer

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 9:09
 */
object Test05_ListBuffer {

  def main(args: Array[String]): Unit={
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer(12,43,23)

    list1.append(15,93)
    list2.prepend(32)
    list1.insert(1,23,24)

    println(list1)
    println(list2)

    list1 += 23 += 34

    31 +=: 97 +=: list1 += 23 += 11

    list1 ++ list2

    val list3 = list2 ++ list1
    println(list3)

    list1 ++= list2
    list1 ++=: list2
  }

}
