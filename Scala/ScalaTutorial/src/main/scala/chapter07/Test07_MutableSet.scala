package chapter07

import scala.collection.mutable
import scala.language.postfixOps

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 19:00
 */
object Test07_MutableSet {

  def main(args: Array[String]):Unit={
    val set1 = mutable.Set(12,23,23,12,54,34);
    println(set1)

    val set2 = set1 + 11
    println(set2)

    set1 += 123
    println(set1)

    set1.add(3423)
    println(set1)


    val flag1 = set1.add(343);
    println(flag1)

    //shanchu
    set1 -= 2231
    println(set1)
    val flag2 = set1.remove(3423);
    println(flag2)


    //合并
    val set3 = mutable.Set(12,323,1232,123123);
    println(set1 ++ set3);

    set1 ++= set3
    println(set1);
  }
}
