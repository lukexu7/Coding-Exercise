package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: aggregateByKey
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/14 13:28
 */
object Spark18_RDD_aggregateByKey {

  def main(args:Array[String]):Unit={

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("aggregateBykey")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(("a",1),("a",2),("b",3),("b",4),("b",5),("a",6)))

    val newRDD = rdd.aggregateByKey((0, 0))(
      (t, v) => (t._1 + v, t._2 + 1),
      (t1, t2) => (t1._1 + t2._1, t2._2 + t1._2)

    )

    newRDD.collect.foreach(println)

    newRDD.mapValues({
      case(num,cnt)=>num/cnt
    }).collect.foreach(println)

    sc.stop()

  }

}
