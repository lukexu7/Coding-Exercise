package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}



/**
 * @ClassName: Spark17_RDD_aggregateByKey
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/13 19:27
 */
object Spark17_RDD_aggregateByKey {

  def main(args:Array[String]):Unit={
    val sparkConf = new SparkConf().setMaster("local").setAppName("aggregateBykey")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(("a",1),("a",2),("a",3),("a",4)),2)

    rdd.aggregateByKey(0)(
      (x,y) => math.max(x,y),
      (x,y) => x + y
    ).collect.foreach(println)

    sc.stop()
  }

}
