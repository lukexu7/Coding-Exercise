package chapter02

/**
 * ClassName: Test04_String
 * Package: chapter02
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/19 - 14:36
 * @Version: v1.0
 *
 */


object Test04_String {

  def main(args:Array[String]):Unit={
    val name = "acl"

    val age = 19

    println(age + "old" +  name)

    //*字符串复制多次
    println(name*3)

    //格式化输出
    printf("%d,%s\n",age,name)

    //字符串模板
    println(s"${age},${name}")

    val num=2.3456
    println(f"the num is ${num}%3.3f")
    println(raw"the nums is ${num}%3.2f")

    //三引号表示字符串原格式输出
    val sql = s"""
       |select *
       |from
       |student
       |where
       |name = ${name}
       |and
       |age = ${age}
       |""".stripMargin
    println(sql)
  }

}
