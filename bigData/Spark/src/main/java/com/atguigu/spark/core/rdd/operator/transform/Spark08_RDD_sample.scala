package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark06_RDD_Operator_Transform_Test
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/13 13:23
 */
object Spark08_RDD_sample {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("coreator")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(1,2,3,4,5,6,7,8,9,10))

    println(rdd.sample(true,2,123).collect().mkString(","))

    sc.stop()

  }

}