package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/19 20:33
 */
object Test04_simiplify {

  def main(args: Array[String]): Unit={
    def f0(name:String):String={
     name
    }

    def f2(name:String):String=name
    println(f2("sdfsd"))

    def f3(name:String)= name
    println(f3("sdfsdfsf"))

   def f4(name:String) {
     return name;
   }

     (name:String) => {println(name)}
  }

}
