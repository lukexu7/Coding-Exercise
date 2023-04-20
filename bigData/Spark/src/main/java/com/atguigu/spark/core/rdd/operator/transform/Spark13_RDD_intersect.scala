package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}


/**
 * @ClassName: Spark13_RDD_intersect
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/13 15:29
 */
object Spark13_RDD_intersect {

  def main(args:Array[String]):Unit={
    val sparkConf = new SparkConf().setMaster("local").setAppName("double value")
    val sc = new SparkContext(sparkConf)

    val rdd1 = sc.makeRDD(List(1,2,3,4))
    val rdd2 = sc.makeRDD(List(4,5,6,7))

    println(rdd1.intersection(rdd2).collect().mkString(","))
  }

}
