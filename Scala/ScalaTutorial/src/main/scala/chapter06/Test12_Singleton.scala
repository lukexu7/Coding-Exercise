package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/1 8:50
 */
object Test12_Singleton {

  def main(args: Array[String]): Unit={

    Student12.getInstance().printInfo()

    Student12.getInstance().printInfo()

  }

}

class Student12 private(val name:String, val age:Int){
  def printInfo(): Unit ={
  println(s"name:$name,age:$age,shcool:$Student11.school")
  }
}

//object Student12{
//
//  private val student:Student12=new Student12(name="alice",age=18)
//  def getInstance():Student12 = student
//
//}

//懒汉式
object Student12{
  private var student:Student12 = _
  def getInstance():Student12={
    if(student==null){
      student=new Student12("alice",19)
    }
    student
  }
}