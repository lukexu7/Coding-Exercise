package com.atguigu.apitest.state;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @ClassName: StateTest1_OperatorState
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/27 11:28
 */
public class StateTest1_OperatorState {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);


        DataStream<String> inputStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

//        DataStream<String> inputStream = env.socketTextStream("localhost", 7777);
       DataStream<SensorReading> dataStream = inputStream.map(line -> {
            String[] fields = line.split(",");
            return new SensorReading(fields[0], new Long(fields[1]), new Double(fields[2]));
        });

    }
}
