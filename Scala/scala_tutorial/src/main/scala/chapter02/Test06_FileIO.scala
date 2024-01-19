package chapter02

import java.io.{File, PrintWriter}
import scala.io.Source

/**
 * ClassName: Test06_FileIO
 * Package: chapter02
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/19 - 15:25
 * @Version: v1.0
 *
 */


object Test06_FileIO {

  def main(args: Array[String]): Unit = {

    //1.从文件中读取数据
    Source.fromFile("src/main/resources/test.txt").foreach(print)

    //2.将数据写入文件
    val writer = new PrintWriter((new File("src/main/resources/output.txt")))

    writer.write("heelow scala")
    writer.close()
  }



}
