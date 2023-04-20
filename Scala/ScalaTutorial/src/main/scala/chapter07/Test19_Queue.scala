package chapter07

import scala.collection.immutable.Queue
import scala.collection.mutable

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/6 9:17
 */
object Test19_Queue {

  def main(args: Array[String]):Unit={
    val queue = new mutable.Queue[String]()
    queue.enqueue("a","b","c")

    println(queue)
    println(queue.dequeue())


    val queue2 = Queue("a","b","c");

    val queue3 = queue2.enqueue("d")

  }

}
