package chapter07

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/3 9:19
 */
object Test06_ImmutableSet {
  def main(args: Array[String]): Unit = {
    val set1 = Set(12, 323, 12, 54, 345, 543, 32, 45, 45)
    println(set1)

    set1 .+(20)
    val set2 = set1 + 20

    val set3 = Set(192,12,234,45,6,3,3,4)
    val set4 = set2 ++ set3

    val set5 = set3 - 12
  }
}
