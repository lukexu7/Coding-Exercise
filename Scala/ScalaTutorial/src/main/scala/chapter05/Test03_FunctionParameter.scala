package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/19 20:26
 */
object Test03_FunctionParameter {

  def main(args: Array[String]): Unit={
    def f1(str:String*):Unit={
      println(str)
    }
    f1("asdf")
    f1("er","ewr")

    def f2(str1:String,str2:String*):Unit={
      println("str1:"+str1+"str2"+str2)
    }

    f2("sdfsd")
    f2("sdfsdf","sdfssdf","wrewer")

    def f3(name: String = "fuck"): Unit ={
      println("hihih"+name)
    }

    f3()

    def f4(name:String, age:Int):Unit={
      println(s"${age},${name}")
    }

    f4(name="fuck",age=23)
  }

}
