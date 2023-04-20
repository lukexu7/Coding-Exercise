package chapter08

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 10:38
 */
object Test02_MatchTypes {

  def main(args: Array[String]):Unit={
    def describeConst(x:Any)=x match{
      case 1=> "number one"
      case "hello" => "string hello"
      case true => "Boolean"
      case '+' => "char +"
      case _ => "哈哈哈"
    }
    println(describeConst("hello"))
    println(describeConst(0.3))

    def describeType(x:Any):String = x match {
      case i : Int => "Int" + i
      case s: String => "String" + s
      case list: List[String] => "List"+List
      case array:Array[Int] => "Array[Int]" + array.mkString(",")
      case a => "something else" + a
    }

    println(describeType(34))
    println(describeType("hello"))

    for (arr <- List(Array(0),Array(1,0),Array(0,1,0),Array(2,3,4,5))){
      val result = arr match{
        case Array(0) => " 0"
        case Array(1,0) => "Array(2,0)"
        case Array(x,y)  => "Array: x"+x+"y:"+y
        case Array(0,_*) =>  "以0开头数组"
        case Array(x,1,z) => "中间为1"
        case _ =>"啥都没有"
      }
      println(result )
    }


    for ( list <- List(List(0),List(1,0),List(0,1,0))){
      val result = list match{
        case List(0) => "0"
        case List(x,y) => "List(x,y)"
        case List(0,_*) => "List(0,_*)"
        case List(a) => "List(a)"
        case _ => "something else"
      }
    }


    val list = List(1,2,4,7,34)

//    list match {
//      case x :: List(a:Int) :: rest => println(s"first:${List(x,y)},second:${List(a)},rest:${rest}")
//      case _ => println("somehtin else ")
//    }


    for (tuple <- List((0,1),(0,0),
      (0,1,0),(0,1,1,0),(0,1,23,56),
      ("hello",true,0.5))){
      val result = tuple match{
        case(a,b) => " "+a + "," + b
        case(0,_)=>("(0,_)")
        case(a,b,0) => "(a,1,_)" + a
        case("hello",a,b) => "hell0,a,b"
        case _ => "something else"
      }
      println(result)
    }
  }

}


















