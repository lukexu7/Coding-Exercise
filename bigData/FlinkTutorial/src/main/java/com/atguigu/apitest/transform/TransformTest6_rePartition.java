package com.atguigu.apitest.transform;

import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @ClassName: TransformTest6_rePartition
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/24 16:36
 */
public class TransformTest6_rePartition {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(4);

        DataStream<String> inputDataStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

        inputDataStream.print();

        inputDataStream.shuffle().print("shuffle");

//        inputDataStream.keyBy().print("keyBy");

       inputDataStream.global().print("global");

        env.execute();
    }
}
