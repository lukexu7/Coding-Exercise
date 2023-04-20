package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/19 20:16
 */
object Test02_FunctionDefine {

  def main(args: Array[String]):Unit={
    def f1(): Unit={
      println("1.午餐无返回值")
    }
    f1()
    println(f1())

    def f2():Int={
      println("wucan")
      return 12
    }

    f2()
    print(f2())


    def f5(name1:String, names:String):Unit={
      println("5:多餐 无返回值")
    }
  }

}
