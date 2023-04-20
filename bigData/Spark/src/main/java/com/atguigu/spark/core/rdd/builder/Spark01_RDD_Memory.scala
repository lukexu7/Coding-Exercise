package com.atguigu.spark.core.rdd.builder

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark01_RDD_Memory
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/13 11:06
 */
object Spark01_RDD_Memory {

  def main(args:Array[String]):Unit={

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("RDD")
    val sc = new SparkContext(sparkConf)

    val seq=Seq[Int](1,2,3,4)

    val rdd:RDD[Int] = sc.makeRDD(seq)

    rdd.collect.foreach(println)

    sc.stop()

  }





}
