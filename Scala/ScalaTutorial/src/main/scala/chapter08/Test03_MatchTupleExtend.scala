package chapter08

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 11:13
 */
object Test03_MatchTupleExtend {
  def main(args: Array[String]):Unit={

    val (x,y) = (10,"hello")
    println(x,y)
    println(x)

    val List(first,second,_*) = List(23,14,2,12)

    val fir :: sec :: rest = List(12,123,123,343)


    val list:List[(Char,Int)] = List(('a',12),('b',34),('c',21))

    for(elem<-list) {
      println(elem._1+""+elem._2)
    }

    for((word,count) <- list){

    }

    for ((word,_) <- list){
      println(word)
    }

  }





}
