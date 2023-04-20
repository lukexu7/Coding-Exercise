package chapter02

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/12 21:49
 */
object Test04_String {

  def main(args:Array[String]):Unit={
    val name:String="alice"
    val age = 19
    println(age+"age"+name+"xx")
    println(name*3)

    printf("%d岁的老太太%s在作死",age,name)

    println(s"\nage${age}${name} xx")

    val num = 2.345f

    println(f"the num is ${num}%2.2f")

    println(raw"the num is ${num}%2.2f")

    val sql = s"""
       |select *
       |from
       |student
       |where
       |name=${name}
       |and
       |age>=${age}
       |""".stripMargin
    println(sql)
  }

}
