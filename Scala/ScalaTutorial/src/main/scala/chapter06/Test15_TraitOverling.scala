package chapter06

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/1 18:38
 */
object Test15_TraitOverling {

  def main(args: Array[String]): Unit = {
    val student = new Student15
    student.increase()
  }

}

trait Knowledge15{
  var amount:Int = 0
  def increase():Unit={
    println("increase knowledt15")
  }
}

trait Talent15{
  def singing(): Unit
  def dancing():Unit

  def increase():Unit={
    println("increase tanet15")
  }
}

class Student15 extends Student13 with Knowledge15 with  Talent15{
  override def singing(): Unit = println("dancing")

  override def dancing(): Unit = println("singing")

  override  def increase():Unit={
    super.increase()
  }
}