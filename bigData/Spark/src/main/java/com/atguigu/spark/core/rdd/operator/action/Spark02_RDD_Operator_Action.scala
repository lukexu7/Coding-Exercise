package com.atguigu.spark.core.rdd.operator.action

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark02_RDD_Operator_Action
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/15 11:48
 */
object Spark02_RDD_Operator_Action {

  def main(args:Array[String]):Unit={




    val sparkConf = new SparkConf().setMaster("local").setAppName("collect")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(1,2,3,4))

    val cnt = rdd.count()
    println(cnt)


    val first = rdd.first()
    println(first)

    val ints:Array[Int] = rdd.take(2)
  }

}
