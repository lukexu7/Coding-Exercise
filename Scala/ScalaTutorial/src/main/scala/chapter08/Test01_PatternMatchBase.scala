package chapter08

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 9:29
 */
object Test01_PatternMatchBase {

  def main(args: Array[String]): Unit = {
    val x: Int = 2
    val y = x match {
      case 1 => "one"
      case 2 => "two"
      case 3 => "three"
      case _ => "other"
    }
    println(y)


    val a = 24
    val b = 13

    def matchDualOp(op: Char): Int = op match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case '%' => a % b
      case _ => -1
    }

    println(matchDualOp('+'))


    def abs(num: Int): Int = {
      num match {
        case i if i >= 0 => i
        case i if i < 0 => -i
      }
    }

    println(abs(-34))

  }

}
























