package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/19 20:02
 */
object Test01_FunctionAndMethod {

  def main(args: Array[String]):Unit = {
    def sayHi(name:String):Unit={
      println("hi,"+name)
    }
    sayHi("gun")
  }

}
