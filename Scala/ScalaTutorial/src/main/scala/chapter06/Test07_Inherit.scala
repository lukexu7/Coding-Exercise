package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/24 20:32
 */
object Test07_Inherit {

  def main(args: Array[String]):Unit={

    val s1 = new Student7("alice",10)
    val s2 = new Student7("sdfsdf",34,"12323");

    def personInfo(person:Person7){
      person.printInfo()
    }

    personInfo(new Person7("person",8))
    personInfo(new Student7("student",12,"3434"))
    personInfo(new Teacher())
  }

}

class Person7(){
  var name:String = _
  var age:Int =_
  println("1.父构造器")

  def this(name:String,age:Int){
    this()
    println("2.辅助构造器调用")
    this.name=name;
    this.age= age
  }

  def printInfo():Unit={
    println(s"perosn:$name $age")
  }
}

class Student7(name:String,age:Int) extends Person7(name,age) {
  var stdNo:String=_
  println("3.子类主构造器")

  def this(name:String,age:Int,stdNo:String){
    this(name,age)
    println("4.子类辅助构造器")
    this.stdNo= stdNo
  }

  override def printInfo():Unit={
    println(s"studnet $name $age $stdNo")
  }
}

class Teacher extends Person7{
  override def printInfo():Unit={
    println("teacher")
  }
}
