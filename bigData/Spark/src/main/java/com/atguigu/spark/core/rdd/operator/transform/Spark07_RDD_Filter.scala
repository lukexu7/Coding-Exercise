package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

import java.text.SimpleDateFormat

/**
 * @ClassName: Spark06_RDD_Operator_Transform_Test
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/13 13:23
 */
object Spark07_RDD_Filter {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("coreator")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(1,2,3,4))
    val filterRdd = rdd.filter(num => num % 2 == 0)

    filterRdd.collect().foreach(println)
  }

}