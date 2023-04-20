package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/23 9:48
 */
object Test09_ClosureCurry {
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int): Int = {
      a + b
    }

    def addByFour(b: Int): Int = {
      4 + b
    }

    def addByFive(b: Int): Int = {
      5 + b
    }

    def addByA(a: Int): Int => Int = {
      def addByB(b: Int): Int = {
        a + b
      }

      addByB
    }

    println(addByA(5)(5))

    def addByA2(a:Int):Int=>Int={
      (b:Int) => {
        a+b
      }
    }

    println("addByA2:"+addByA2(100)(100))

    def addByA3(a:Int):Int=>Int= {
      b => a + b

    }
    println("addByA3:"+addByA3(50)(60))

    def addByA4(a:Int):Int=>Int = a + _
    println("addByA4:"+addByA4(50)(1000))

    def addCurry(a:Int)(b:Int):Int={
      a + b
    }

    println("addbyCurry:"+addCurry(23)(34))
  }





}