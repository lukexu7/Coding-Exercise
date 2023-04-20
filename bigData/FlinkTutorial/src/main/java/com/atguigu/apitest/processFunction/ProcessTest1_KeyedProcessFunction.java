package com.atguigu.apitest.processFunction;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @ClassName: ProcessTest1_KeyedProcessFunction
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/27 17:56
 */
public class ProcessTest1_KeyedProcessFunction {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);


//        DataStream<String> inputStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

        DataStream<String> inputStream = env.socketTextStream("localhost", 7777);
        DataStream<SensorReading> dataStream = inputStream.map(line -> {
            String[] fields = line.split(",");
            return new SensorReading(fields[0], new Long(fields[1]), new Double(fields[2]));
        });

    }
}
