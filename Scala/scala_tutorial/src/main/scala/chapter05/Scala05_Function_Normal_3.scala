package chapter05

/**
 * ClassName: Scala03_Function
 * Package: chapter05
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/25 - 16:58
 * @Version: v1.0
 *
 */


object Scala05_Function_Normal_3 {

  def main(args: Array[String]): Unit = {


    def test():String={


       "zhangsan"
    }

    println(test())


    def test4="haha"
    println(test4)


    def test5():Unit={
      return "zhangsan"
    }


    //匿名函数
    () => {
      return 123
    }


  }
  


}
