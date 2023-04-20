package chapter05

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/23 11:04
 */
object test12_MyWhile {
  def main(args: Array[String]): Unit ={
    var n = 10
    def myWhile(condition: =>Boolean):(=>Unit)=>Unit = {
      def doloop(op: => Unit):Unit= {
        if (condition) {
         op
          myWhile(condition)(op)
        }
      }
        doloop _
      }

    var i = 1
    myWhile(i <= 10){
      println(i)
      i += 1
    }

    def myWhile2(condition: =>Boolean):(=>Unit)=>Unit={
      op => {
        if (condition){
          op
          myWhile2(condition)(op)
        }
      }
    }
    i = 1
    myWhile2(i <= 5){
      println("myWhile2:"+i)
      i += 1
    }

    def myWhile3(condition: =>Boolean)(op: =>Unit): Unit={

      if (condition){
        op
        myWhile3(condition)(op)
      }
      }
    i = 1
    myWhile3(i <= 5){
      println(i)
      i += 1



    }

    }


}
