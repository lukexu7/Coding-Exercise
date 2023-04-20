package com.atguigu.wc;

import org.apache.flink.api.java.operators.DataSource;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.utils.ParameterTool;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/7 21:46
 */
public class SteamWordCountJava {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
//
//        String inputPath = "E:\\学习\\Coding\\bigData\\FlinkTutorial\\src\\main\\resources\\word.txt";
//        DataStream<String> inputDataStream = env.readTextFile(inputPath);

        ParameterTool parameterTool = ParameterTool.fromArgs(args);
        String host = parameterTool.get("host");
        int port = parameterTool.getInt("port");


        DataStream<String> inputDataStream = env.socketTextStream(host,port);

        DataStream<Tuple2<String,Integer>> resultStream= inputDataStream.flatMap(new WordCountJava.MyFlatMapper())
                .keyBy(0)
                .sum(1);

        resultStream.print();
        env.execute();
    }
}
















