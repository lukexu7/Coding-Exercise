package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 20:03
 */
object Test10_Tuple {

  def main(args: Array[String])={

    val tuple = ("sdfa",100,"sdf",true)


    println(tuple._3)

    println(tuple.productElement(1))

    for (element <- tuple.productIterator){
      println(element)

      val mulTuple =(12,3,(3,"sd"),4)
    }
  }

}
