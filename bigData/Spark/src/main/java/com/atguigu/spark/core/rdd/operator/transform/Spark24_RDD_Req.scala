package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark24_RDD_Req
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/14 14:27
 */
object Spark24_RDD_Req {

  def main(args:Array[String]):Unit={


    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("Operator")
    val sc = new SparkContext(sparkConf)

    // TODO 案例实操

    // 1. 获取原始数据：时间戳，省份，城市，用户，广告
    val dataRDD = sc.textFile("datas/agent.log")

    val mapRDD = dataRDD.map(line => {
      val datas = line.split(" ")
      ((datas(1), datas(4)), 1)
    })

    val reduceRDD = mapRDD.reduceByKey(_ + _);

    val newMapRDD = reduceRDD.map({ case ((prv, ad), sum) => {
      (prv, (ad, sum))
    }
    })

    val groupRDD = newMapRDD.groupByKey()

    val resultRDD = groupRDD.mapValues(iter => {
      iter.toList.sortBy(_._2)(Ordering.Int.reverse).take(3)
    })

    resultRDD.collect.foreach(println)

    sc.stop()









  }

}
