package chapter09

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 16:10
 */
object Test03_Generic {

  def main(args: Array[String]):Unit= {

    val child:Parent = new Child
    val childList:MyCollection[Parent]=new MyCollection[Child]

    def test[A <: Child](a:A): Unit ={
      println(a.getClass.getName)
    }

    test[SubChild](new SubChild)

Ordering
  }


  }

class Parent { }
class Child extends Parent{}

class SubChild extends Child{}

class MyCollection[+E]{}
