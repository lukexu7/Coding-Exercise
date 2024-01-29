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


object Scala07_Function_Hell {

  def main(args: Array[String]): Unit = {


    def test():Unit={}

    println(test)
    println(test _)

    def test1(age:Int):String=age.toString
    //0表示参数列表中参数个数
    //中括号Unit表示函数没有返回值
    //中括号String表示函数返回值类型
    val f:Function0[Unit] = test _
    //函数对象参数最多只能有22个，函数参数个数无限制
    val f2:Function1[Int,String]=test1 _
  }





  


}
