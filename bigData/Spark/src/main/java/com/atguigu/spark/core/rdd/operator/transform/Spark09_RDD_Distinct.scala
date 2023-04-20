package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark09_RDD_Distinct
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/13 14:26
 */
object Spark09_RDD_Distinct {

  def main(args:Array[String]):Unit={
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("distinct")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(1, 2, 3, 4, 4, 5, 6, 7, 89, 9, 9, 9, 2))
    rdd.distinct().foreach(println)
    sc.stop()
  }

}
