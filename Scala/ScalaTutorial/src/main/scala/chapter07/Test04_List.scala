package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/2 20:53
 */
object Test04_List {

   def main(args: Array[String]): Unit ={

    val list1 = List(23,65,34)

    println(list1)
    println(list1(1))

    list1.foreach(println)

    println(list1.mkString(","))

     val list2 = 10 +: list1
     val list3 = list1 :+ 23




     println("__________---------------------")


     val list4 = list2.::(51)
     println(list4)

     val list5 = Nil.::(123)
     println(list5)


     val list6 = 32 :: Nil
     val list7 = 17 :: 29 :: 53 :: 34 :: Nil
     println(list6)
     println(list7)


     val list8 = list6 :: list7
     println(list8)

     val list9 = list6 ::: list7
     println(list9)

     val list10 = list6 ++ list7
     println(list10)
    }

}
