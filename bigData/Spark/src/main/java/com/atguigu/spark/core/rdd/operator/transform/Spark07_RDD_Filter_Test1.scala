package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark06_RDD_Operator_Transform_Test
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/13 13:23
 */
object Spark07_RDD_Filter_Test1 {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("coreator")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.textFile("datas/apache.log")
//    rdd.map({
//      line => {
//        val datas = line.split(" ")
//        val time = datas(3)
//        (datas,time)
//
//      }
//    })

    rdd.filter{
      line => {
        val datas = line.split(" ")
        val time = datas(3)
        time.startsWith("17/05/2015")
      }
    }.collect().foreach(println)

    sc.stop()
  }

}