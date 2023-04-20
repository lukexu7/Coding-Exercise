package chapter06

import scala.beans.BeanProperty

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/24 9:06
 */
object Test03_Class {
  def main(args: Array[String]):Unit={
    val student=new Student()
    println(student.age)
    println(student.sex)
    student.sex="female"
    println(student.sex)
  }


}
















class Student {
  private var name1:String ="nima"
  var name:String="alice"
  @BeanProperty
  var age:Int = _
  var sex:String = _

}