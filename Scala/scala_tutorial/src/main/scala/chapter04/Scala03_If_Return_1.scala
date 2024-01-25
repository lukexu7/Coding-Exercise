package chapter04

/**
 * ClassName: Scala03_If_Return_1
 * Package: chapter03
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/24 - 17:54
 * @Version: v1.0
 *
 */


object Scala03_If_Return_1 {

  def main(args: Array[String]): Unit = {


    val age = 30
    val result:Any =if(age==30){
      "zhangsan"
    }else{
      null
    }

    println(result)


  }

}
