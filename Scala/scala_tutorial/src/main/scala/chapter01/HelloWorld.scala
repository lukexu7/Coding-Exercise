package chapter01

/**
 * ClassName: HelloWorld
 * Package: chapter01
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/18 - 14:36
 * @Version: v1.0
 *
 */

/*
object:关键字，声明一个单例对象（半生对象）
 */
object HelloWorld {

  /*
  main：从外部可以直接调用执行的方法
  def 方法名称(参数名称：参数类型）
   */
  def main(args:Array[String]):Unit={
    println("hello world")
    System.out.println("helle java")
  }

}
