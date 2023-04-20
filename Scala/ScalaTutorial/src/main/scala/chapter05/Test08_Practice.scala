package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/23 9:13
 */
object Test08_Practice {

  def main(args: Array[String]){
  val fun=(i:Int,s:String,c:Char)=>{if (i== 0 && s == " " && c == '0') false else true}
  print(fun(5," ",3))
    println(fun(0," ",'0'))



  def func(i:Int): String=>(Char=>Boolean) = {
      def f1(s:String):Char =>Boolean={
        def f2(c:Char):Boolean= {
          if (i==0 && s== " " && c == '0') false else true
        }
        f2
      }
      f1
    }

   println(func(0)("")('0'))

    def func1(i:Int):String=>(Char=>Boolean)={
      (s:String) =>{
        (c:Char) =>{
          if( i == 0 && s == " " && c == '0') false else true
        }
      }
    }

    println("func1:"+func1(0)(" ")('0'))

    def func2(i:Int):String=>(Char=>Boolean)={
      s => c => if (i==0 && s== " " && c=='0') false else true
    }
    println("func2:"+func2(5)("sdfsd")('4'))


    def func4(i:Int)(s:String)(c:Char):Boolean={
      if(i==0 && s == "" && c =='4') false else true
    }

    println("func4;"+func4(5)("4")('0'))

  }



}
