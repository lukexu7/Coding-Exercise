package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 19:14
 */
object Test08_ImmutableMap {

  def main(args: Array[String]): Unit={
    val map1:Map[String,Int] = Map("a"-> 13,"b"-> 234)
    println(map1)
    println(map1.getClass)

    map1.foreach(println)
    map1.foreach(kv => println(kv._1))

    println("=======================")

    for(key <- map1.keys) println(key+"--->"+map1.get(key))
    println(map1.get("a").get)
    println(map1.get("e"))
    println(map1.getOrElse("d",0))


    println(map1("a"))
  }

}
