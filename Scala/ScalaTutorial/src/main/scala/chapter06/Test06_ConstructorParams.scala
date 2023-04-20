package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/24 20:13
 */
object Test06_ConstructorParams {

  def main(args: Array[String]):Unit={
    val s2 = new Student2;
    println(s"name=${s2.name},age=${s2.age}")
    s2.name="sff"
    s2.age=39
    println(s"name=${s2.name},age=${s2.age}")

    val s3 = new Student3("bobo",34);
    println(s"name=${s3.name},age=${s3.age}")

    val s4 = new Student3("b34obo",34);
    println(s"name=${s4.name},age=${s4.age}")


    val s6 = new Student6("b34obo",34,school="tsinghua");
    println(s"name=${s6.name},age=${s6.age},school=${s6.school}")


  }

}

class Student2{
  var name:String = _
  var age: Int = _
}

class Student3(var name:String, var age:Int){

}

class Student4(name:String, age:Int){
  def pirntInfo(): Unit ={
    println(s"name=${name},age=${age}")
  }
}

class Student5(val name:String, val age:Int)

class Student6(val name:String, val age:Int){
  var school:String = _

  def this(name:String, age:Int, school:String){
    this(name,age);
    this.school = school;
  }
}