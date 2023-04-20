package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark23_RDD_cogroup
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/14 14:06
 */
object Spark23_RDD_cogroup {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Operator")
    val sc = new SparkContext(sparkConf)

    // TODO 算子 - (Key - Value类型)

    val rdd1 = sc.makeRDD(List(
      ("a", 1), ("b", 2) //, ("c", 3)
    ))

    val rdd2 = sc.makeRDD(List(
      ("a", 4), ("b", 5), ("c", 6), ("c", 7),("b",8),("a",9)
    ))

    rdd1.cogroup(rdd2).collect().foreach(println)

    sc.stop()


  }

}
