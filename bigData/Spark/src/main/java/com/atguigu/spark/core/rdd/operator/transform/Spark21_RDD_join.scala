package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark21_RDD_join
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/14 14:00
 */
object Spark21_RDD_join {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Operator")
    val sc = new SparkContext(sparkConf)

    // TODO 算子 - (Key - Value类型)

    val rdd1 = sc.makeRDD(List(
      ("a", 1), ("a", 2), ("c", 3)
    ))

    val rdd2 = sc.makeRDD(List(
      ("a", 5), ("c", 6), ("a", 4)
    ))

    rdd1.join(rdd2).collect.foreach(println)

    sc.stop()

  }

}
