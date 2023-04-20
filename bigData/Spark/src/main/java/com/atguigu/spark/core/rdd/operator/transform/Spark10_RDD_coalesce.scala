package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark10_RDD_coalesce
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/13 14:35
 */
object Spark10_RDD_coalesce {

  def main(args:Array[String]):Unit={
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("soalese")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(1, 2, 3, 4),4)

    val newRDD = rdd.coalesce(2)

    newRDD.saveAsTextFile("output")
    sc.stop()


  }

}
