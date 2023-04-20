package com.atguigu.spark.core.req

import org.apache.spark.{SparkConf, SparkContext}

/**
 * @ClassName: Spark01_Req1_HotCategoryTop10
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/16 13:58
 */
object Spark01_Req1_HotCategoryTop10 {

  def main(args: Array[String]): Unit = {
    val sparConf = new SparkConf().setMaster("local[*]").setAppName("HotCategoryTop10Analysis")
    val sc = new SparkContext(sparConf)

    // 1. 读取原始日志数据
    val actionRDD = sc.textFile("datas/user_visit_action.txt")

    val clickActionRDD = actionRDD.filter(
      action => {
        val datas = action.split("_")
        datas(6) != "-1"

      }
    )

    val clickCountRDD = clickActionRDD.map(
      action => {
        val datas = action.split("_")
        (datas(6),1)
      }
    ).reduceByKey(_+_)


    val orderActionRDD = actionRDD.filter(
      action =>{
        val datas = action.split("_")
        datas(8)!= "null"
      }
    )

    val orderCountRDD = orderActionRDD.flatMap(
      action => {
        val datas = action.split("_")
        val cid = datas(8)
        val cids = cid.split(",")
        cids.map(id => (id, 1))
      }
    ).reduceByKey(_ + _)


    val payActionRDD = actionRDD.filter(
      action => {
        val datas = action.split("_")
        datas(10) != "null"
      }
    )

    val cogroupRDD = payActionRDD.flatMap(
      action => {
        val datas = action.split("_")
        val cid = datas(10)
        val cids = cid.split(",")
        cids.map(id => (id, 1))

      }
    ).reduceByKey(_ + _)


    cogroupRDD.mapValue


  }

}
