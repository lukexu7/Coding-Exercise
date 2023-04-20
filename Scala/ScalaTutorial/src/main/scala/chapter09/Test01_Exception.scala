package chapter09

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 13:26
 */
object Test01_Exception {

  def main(args: Array[String]):Unit={
    try {
      val n= 10/0
    } catch {
      case e:ArithmeticException =>{
        println("算属于常")
      }
      case e:Exception => {
        println("一般异常")
      }
    } finally {
      println("end")
    }
  }

}
