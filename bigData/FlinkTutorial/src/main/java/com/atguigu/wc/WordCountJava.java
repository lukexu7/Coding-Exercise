package com.atguigu.wc;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.DataSet;
import org.apache.flink.api.java.ExecutionEnvironment;
import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.util.Collector;

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/7 21:27
 */
public class WordCountJava {
    public static void main(String[] args) throws Exception {

        ExecutionEnvironment env = ExecutionEnvironment.getExecutionEnvironment();

        String inputPath = "E:\\学习\\Coding\\bigData\\FlinkTutorial\\src\\main\\resources\\word.txt";
        DataSource<String> inputDataSet = env.readTextFile(inputPath);

        DataSet<Tuple2<String,Integer>> resultSet = inputDataSet.flatMap(new MyFlatMapper())
                .groupBy(0)
                .sum(1);

        resultSet.print();


    }

    public static class MyFlatMapper implements FlatMapFunction<String, Tuple2<String,Integer>>{
        @Override
        public void flatMap(String s, Collector<Tuple2<String, Integer>> collector) throws Exception {

            String[] words = s.split(" ");

            for(String word:words){
                collector.collect(new Tuple2<>(word,1));
            }

        }



    }


}
