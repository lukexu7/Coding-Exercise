package chapter07

import scala.collection.mutable

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 19:45
 */
object Test09_MutableMap {

  val map1 = mutable.Map("a"->12,"b"->34)

  println(map1)
  println(map1.getClass)


  map1.put("34",123)

  map1 += (("e",12334))

  println(map1)

  map1.remove("c")

  map1 -= "a"

  println(map1)


  map1.update("c",34)


  val map2 = Map("a"->123,"b"->342)
  map1 ++= map2
  println(map1)
  println(map2)

  val map3 = map2 ++ map1


}
