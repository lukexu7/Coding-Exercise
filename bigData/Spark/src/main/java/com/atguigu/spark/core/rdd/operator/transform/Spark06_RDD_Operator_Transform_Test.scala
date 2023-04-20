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
object Spark06_RDD_Operator_Transform_Test {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("coreator")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.textFile("datas/apache.log")

    var timeRDD: RDD[(String, Iterable[(String, Int)])] = rdd.map(
      line => {
        val datas = line.split(" ")
        val time = datas(3)

        val sdf = new SimpleDateFormat("dd/MM/yyyy:HH:mm:ss")

        val date = sdf.parse(time)

        val sdf1 = new SimpleDateFormat("HH")

        val hour = sdf1.format(date)

        (hour, 1)

      }
    ).groupBy(_._1)

    timeRDD.map({
      case (hour, iter) =>
        (hour, iter.size)
    }).collect().foreach(println)
  }
}