package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/23 10:17
 */
object Test10_Recursion {
  def main(args: Array[String]): Unit={
    def factorial(x: Int): Int = {
      if (x==1) {1}
      else{
        x * factorial(x-1)
      }
    }
    println(factorial(5))

    def tailRecursion(n:Int):Int={
      def loop(n:Int,curRes:Int):Int={
        if (n==0) return curRes
          loop(n-1,curRes*n)
      }
      loop(n,1)
    }
    println("tailRecursion:"+tailRecursion(5))
  }

}
