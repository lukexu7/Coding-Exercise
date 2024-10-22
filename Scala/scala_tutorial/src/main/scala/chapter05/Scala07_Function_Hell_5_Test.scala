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


object Scala07_Function_Hell3 {

  def main(args: Array[String]): Unit = {


    //将函数对象作为参数使用
    def fun():Unit={
      println("test")
    }

    def test(f:()=>Unit):Unit={

      f()


    }

    val f = fun _

    test(f)


  }





  


}
