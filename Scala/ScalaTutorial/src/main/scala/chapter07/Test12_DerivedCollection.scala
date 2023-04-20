package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 20:25
 */
object Test12_DerivedCollection {

  def main(args: Array[String]): Unit={
    val list1 = List(1,2,3,4)
    val list2= List(3,2,3,4,21,4,6)

    println(list1.head)

    println(list1.tail)

    println(list2.last)

    println(list2.init)

    println(list2.reverse)



    println(list1.take(5))
    println(list1.takeRight(5))


    println(list2.drop(3))
    println(list2.dropRight(3))

    val union = list1.union(list2)
    println("union" + union)
    println(list1::list2)

    val set1 = Set(1,2,4,5,2,3)
    val set2 = Set(3,2,1,5,2)

    val union2 = set1.union(set2)
    println(set1 ++ set2 )
    val intersection = list1.intersect(list2)

    println("intersection"+intersection)

    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println(diff1)
    println(diff2)

    println(list1.zip(list2))
    println(list2.zip(list1))

    println(list1.sliding(3))

    for(ele <- list1.sliding(3)) println(ele)

    list2.sliding(3,2).foreach(println)

  }

}
