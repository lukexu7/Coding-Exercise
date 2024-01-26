package chapter05

/**
 * ClassName: Scala03_Function
 * Package: chapter05
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/25 - 16:58
 * @Version: v1.0
 *
 */


object Scala04_Function {

  def hdaderUpper(s:String):String ={

    return s.substring(0,1).toUpperCase()+s.substring(1)





  }

  def fun1():Unit={
    println("fun1...")
  }

  //调用函数时，需要指明函数名称以及传递的参数

  fun1()
  fun1

  def fun2():String={
    return "zhangsam"
  }

  fun2()


  def fun3(name:String): Unit = {
    println("Name:"+name)
  }

  fun3("fk you")
  //参数只有一个时，也不能省略小括号。方法可以省略作为运算符。
  fun3 "haha"

  def fun4(name:String):String={
    return "name"+name
  }

  fun4("sdf")


  def fun5(name:String,age:Int):Unit={

    println(name,age)


  }


  fun5("haha",12)

  def fun6(name:String,age:Int):String={

    return s"Name:${name},Age:${age}"
  }





}
