package com.atguigu.spark.core.rdd.operator.transform

import org.apache.spark.rdd.RDD.rddToPairRDDFunctions
import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark19_RDD_CombinbyKey
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/14 13:40
 */
object Spark19_RDD_CombinbyKey {

  def main(args: Array[String]): Unit = {

    val sparkConf = new SparkConf().setMaster("local[*]").setAppName("combinebykey")
    val sc = new SparkContext(sparkConf)

    val rdd = sc.makeRDD(List(("a", 1), ("a", 2), ("b", 3), ("b", 4), ("b", 5), ("a", 6)),2)

    rdd.combineByKey(
      v => (v,1),
        (t1:(Int,Int),v) =>{(t1._1+v,t1._2+1)},
        (t1:(Int,Int),t2:(Int,Int)) =>(t1._1+t2._1,t1._2+t2._2)
    ).mapValues({case (num,cnt)=>{num / cnt}}).collect.foreach(println)




    sc.stop()
  }
}