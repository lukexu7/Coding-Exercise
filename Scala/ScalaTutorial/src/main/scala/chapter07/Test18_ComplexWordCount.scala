package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 8:04
 */
object Test18_ComplexWordCount {

  def main(args: Array[String]):Unit={
    val tupleList = List(("hello",1),("hello",2),("hello scal",3),("hello bithc fiuck",4))
    val newStringList = tupleList.map(kv =>{
      (kv._1.trim+" ")*kv._2
    }
    )
    println(newStringList)

    val wordList = newStringList.flatMap(_.split(" "))
    val groupMap = wordList.groupBy(word => word)
    println(groupMap)
    val wordCount = groupMap.map(kv=>(kv._1,kv._2.length))
    println(wordCount.toList)

    val wordCountList = newStringList.flatMap(_.split(" "))
      .groupBy(word=>word)
      .map(kv=>(kv._1,kv._2.size))
      .toList
      .sortBy(_._2)(Ordering[Int].reverse)
      .take(3)
    println(wordCountList)

    val preCountList = tupleList.flatMap(
      tuple=>{
      val strings = tuple._1.split(" ")
      strings.map(word=>(word, tuple._2))

    })

    val preCountMap:Map[String,List[(String,Int)]] = preCountList.groupBy(_._1)

    val countMap = preCountMap.mapValues(
      tupleList => tupleList.map(_._2).sum
    )
    println(countMap)

    val countList = countMap.toList
      .sortWith(_._2>_._2)
      .take(3)
  }

}
