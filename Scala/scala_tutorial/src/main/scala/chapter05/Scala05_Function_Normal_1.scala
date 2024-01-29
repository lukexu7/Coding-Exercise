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


object Scala05_Function_Normal_1 {

  def main(args: Array[String]): Unit = {


    def test(name:String,password:String):Unit={
      println(s"${name},${password}")
    }

    test("zhangsan","00000")
    test("lisi","00000")


    def test1(name:String,password:String="000000"):Unit={
      println(s"${name},${password}")
    }

    test1("zhangsan",null)
    test1("lisi","00000")


    


  }
  


}
