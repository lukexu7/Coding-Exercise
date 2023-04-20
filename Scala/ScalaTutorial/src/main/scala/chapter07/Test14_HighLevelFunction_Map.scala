package chapter07



/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 21:42
 */
object Test14_HighLevelFunction_Map {

  def main(args:Array[String]):Unit={
    val list= List(1,2,3,4,5,6,7,9)

    println(list.filter(_%2 == 0))

    println(list.map(_*2))

    val nestedList = List(List(1,2,3),List(34,5,2))
    val flatList2 = nestedList.flatten
    println(flatList2)


    val strings = List("hello world","hello scala","hello java","we study")
    println(strings.flatMap(_.split(" ")))

    println(strings.map(_.split(" ")).flatten)

    val groupMap = list.groupBy(_%2)

    val groupMap2:Map[String, List[Int]] = list.groupBy( x => if (x % 2 == 0) "偶数" else "奇数")
    println(groupMap)
    println(groupMap2)

    val wordList = List("china", "adsdf","casdfas","desdf","jaaa")
    println(wordList.groupBy(_.charAt(0)))
  }

}
