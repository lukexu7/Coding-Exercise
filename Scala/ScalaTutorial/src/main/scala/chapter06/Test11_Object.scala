package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/1 8:43
 */
object Test11_Object {

}


class Student11(name:String, age:Int){

  def printInfo():Unit={
    println(s"name:${name},age:$age,school:$Student11.school")
  }

}

object Student11{
  val shcool:String="atuguigu"
  def newStudnet(name:String, age:Int):Student11 = new Student11(name, age)
  def apply(name:String, age:Int):Student11 = new Student11(name:String, age:Int)
}
