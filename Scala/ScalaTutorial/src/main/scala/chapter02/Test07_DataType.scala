package chapter02

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/13 9:01
 */
object Test07_DataType {

  def main(args:Array[String]): Unit = {
    val a1: Byte = 127;
    val a2 = -128;

    val a4 = 12323423423423L;

    val b1 = 10;
    val b2:Byte = 10 + 30;

    val b3=(b2+100);

    val b4:Byte=(b1+20).toByte;

    println(b2)
    println(b3)
    println(b4)

    val b5 = 1.324234f
    println(b5);

    val c1='a';
    val c2 = '8'
    val c3 = '\t'
    val c4 = '\n'
    println("abc"+c3+"def")
    println("abc"+c4+"def")

    val c5='\\'
    println(c5);

    val c6 = "\""
    println(c6)

    val i1 = c1.toInt
    println("i1:"+i1)

    val isTrue=true;
    println(isTrue);

    //5 null unit nothing
    def m1():Unit={
      println("aaaaaaa")
    }

    val a = m1();
    println(a)


    val n=null;
    println(n)

    def m2(n:Int): Int={
      if (n== 0)
        throw new NullPointerException
      else
         n
    }

    val b = m2(5)
    println(b);
  }

}
