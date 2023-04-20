package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 7:56
 */
object Test18_WordCountCommon {
  def main(args: Array[String]):Unit={
    val stringList=List("hello","fuck","hello bithc","hello slut","hello tramp")

    val wordList1 = stringList.map(_.split(" "))
    val wordList2 = wordList1.flatten
    val wordList = stringList.flatMap(_.split(" "))
    val groupMap = wordList.groupBy(word => word)


    val countMap = groupMap.map(kv =>(kv._1,kv._2.length))

    val sortList = countMap.toList.sortWith(_._2>_._2).take(3)
    println(sortList.mkString(""))
  }

}
