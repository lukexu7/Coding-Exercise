package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark01_RDD_collect
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/15 11:20
 */
object Spark01_RDD_collect {

  def main(args:Array[String]):Unit={

    val sparkConf = new SparkConf().setMaster("local").setAppName("collect")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(1,2,3,4))

    rdd.collect()

    sc.stop()
  }


}
