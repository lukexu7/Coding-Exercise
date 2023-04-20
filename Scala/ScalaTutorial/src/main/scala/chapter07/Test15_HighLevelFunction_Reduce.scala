package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 22:06
 */
object Test15_HighLevelFunction_Reduce {

  def main(args: Array[String]): Unit={

    val list= List(1,2,4,3)

    println(list.reduce(_+_))
    println(list.reduceLeft(_+_))
    println(list.reduceRight(_+_))

    val list2 = List(3,4,5,8,10)
    println(list2.reduce(_-_));
    println(list.reduceRight(_-_));

    println(list.fold(10)(_+_))
    println(list.foldLeft(10)(_-_))
    println(list2.foldRight(11)(_-_))
  }

}
