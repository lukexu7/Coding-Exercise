package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark12_RDD_sortBy
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/13 15:14
 */
object Spark12_RDD_sortBy {

  def main(args:Array[String]):Unit={
    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("soalese")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List((1,3), (2,2), (3,7), (4,9)))



    rdd.sortBy(_._2).collect().foreach(println)
    sc.stop()


  }

}
