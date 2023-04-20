package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/24 9:16
 */
object Test04_ClassForAccess {

}

class Person{
  private var idCard:String="34343434"
  protected var name:String="alice"
  var sex:String="female"
  private[chapter06] var age: Int = 19

  def printInfo() = {
    println(s"Person:$idCard ")
  }



}