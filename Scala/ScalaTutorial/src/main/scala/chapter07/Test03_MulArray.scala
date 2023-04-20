package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/2 20:42
 */
object Test03_MulArray {

  def main(args: Array[String]): Unit={
    val array = Array.ofDim[Int](2,3)

    array(0)(1) = 19
    array(1)(1) = 23

    println(array.mkString(", "))


    for (i <- 0 until array.length; j <- 0 until array(i).length){
      println(array(i)(j))
    }

    for(i <- array.indices; j <- array(i).indices){
      print(array(i)(j) + "\t")
      if(j == array(i).length-1) println

    }

//    array.foreach(line => line.foreach(println))
    array.foreach(_.foreach(println))


  }

}
