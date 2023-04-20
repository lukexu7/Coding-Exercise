package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/19 20:49
 */
object Test05_Lambda {

  def main(args: Array[String]) :Unit= {

    val fun = (name: String) => {
      println(name)
    }
    fun("atugigu")

    def f(func: String => Unit): Unit = {
      func("atguigugssdfsdfs");
    }

    f(fun)

    def dualFunction(fun:(Int,Int)=>Int):Int={
      fun(1,2)
    }

    val add=(a:Int,b:Int) => a+ b
    val minus=(a:Int,b:Int) => a-b
    println(dualFunction((add)))

    def operation(arr:Array[Int],op:Int=>Int) = {
      for (elem <- arr) yield op(elem)
    }
    def op(ele:Int):Int={
      ele + 1
    }

    val arr=operation(Array(1,2,3,4),op)
    println(arr.mkString(","))

    val arr1=operation(Array(1,2,3,4),(ele:Int) => {ele+1})
    println(arr1.mkString(","))

    val arr2=operation(Array(2,3,4,5),ele=>ele+1)
    println(arr2.mkString(","))

    val arr3=operation(Array(4,5,6,7),_+1)
    println(arr3.mkString(","))

    def caculator(a:Int,b:Int,op:(Int,Int)=>Int):Int={
      op(a,b)
    }

    println(caculator(1,1,(x,y)=>{x+y}))

    println(caculator(1,2,(x,y)=>x+y))

    println(caculator(4,5,_+_))
  }



}
