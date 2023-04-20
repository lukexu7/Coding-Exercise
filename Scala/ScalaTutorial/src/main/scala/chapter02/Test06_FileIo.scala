package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source
import scala.language.postfixOps

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/8/12 22:08
 */
object Test06_FileIo {
  def main(args: Array[String]): Unit ={
    Source.fromFile("E:\\学习\\代码练习\\Scala\\ScalaTutorial\\src\\main\\resources\\xx.txt").foreach(print)
    val writer = new PrintWriter(new File( "E:\\学习\\代码练习\\Scala\\ScalaTutorial\\src\\main\\resources\\oupt.txt"))
      writer.write("heeeeeeeeeeeeeel")
      writer.close()

  }


}
