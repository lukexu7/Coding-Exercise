package chapter04

/**
 * ClassName: Scala04_for_1
 * Package: chapter04
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/24 - 18:22
 * @Version: v1.0
 *
 */


object Scala04_for_1 {

  def main(args: Array[String]): Unit = {

    val array = 1 to 5
    for( i <- array if i != 3){
      println(i)
    }


    val array1 = 1 to 5 by 2
    val array2 =Range(1,5,2)

    for(i <- array1){
      println(i)
    }

    for(i <-array2){
      println(i)
    }

    for (i <- Range(1,4);j<-Range(1,4)){
      println("i="+i+",j="+j)
    }

//    for( i<-1 to 3){
//      val j = i - 1
//      println(j)
//    }

    for( i<-1 to 3; j=i-1){
      println(j)
    }



  }

}
