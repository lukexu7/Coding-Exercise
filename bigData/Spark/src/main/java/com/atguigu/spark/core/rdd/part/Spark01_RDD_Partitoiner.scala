package com.atguigu.spark.core.rdd.part

import org.apache.spark.{Partitioner, SparkConf, SparkContext}

/**
 * @ClassName: Spark01_RDD_Partitoiner
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/15 17:57
 */
object Spark01_RDD_Partitoiner {

  def main(args: Array[String]): Unit = {
    val sparkConf = new SparkConf( ).setMaster("local").setAppName("partitoner")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(("nba","sdfsdfsdfs"),("cba","sb"),("wnba","caonima"),("nba","fuck"),("nba","fuck")),3)

    val partRDD = rdd.partitionBy(new MyPartitoner)

    partRDD.saveAsTextFile("output")
    sc.stop()


  }

  class MyPartitoner extends Partitioner{
    override def numPartitions: Int = 3

    override def getPartition(key: Any): Int = {
      key match {
        case "nba" => 0
        case "wnba" => 1
        case _ => 2
      }
    }
  }

}
