package chapter08



/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 11:54
 */
object Test06_PartialFunction {

  def main(args: Array[String]) :Unit={
    val list = List(("a",12),("b",13),("c",15),("a",34))

    val newList = list.map(tuple => (tuple._1,tuple._2*2))

    val newList2 = list.map(tuple =>{
      tuple match {
        case (word, count) => (word, count*2)
      }
    })

    val newList4 = list.map{case (word,count) => (word,count*2)
  }

    println(newList4)


    val positiveAbs:PartialFunction[Int,Int] = {
      case x if x > 0 => x
    }
    val negativeAbs:PartialFunction[Int,Int] = {
      case x if x < 0 => -x
    }
    val zeroAbs: PartialFunction[Int,Int] ={
      case 0 => 0
    }

    def abs(x:Int):Int = (positiveAbs orElse negativeAbs orElse zeroAbs) (x)

    println(abs(34))
    println(abs(-65))


}
}