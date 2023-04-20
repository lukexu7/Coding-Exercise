package chapter03

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/15 11:22
 */
object Test01_TestOperator {
  def main(args: Array[String]): Unit = {
    val s1 = "hello"
    val s2 = new String("hello")
    println(s1==s2)
    println(s1.equals(s2))
    println(s1.eq(s2))


    def m(n:Int):Int = {
      println("m被调用")
      return n
    }

    val n = 1
    println(4 > 5 && m(n)>0)

    def isNotEmpty(str:String):Boolean={
      return str != null && !("".equals(str.trim));
    }

    println("------"+isNotEmpty(""))


    val a = 60
    println(a << 3)

    val b = -60;
    println(b << 2)
    println(b >>> 1)

    println(1.234.*(23));
  }

}
