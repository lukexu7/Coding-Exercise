package com.atguigu.apitest.source;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

import java.util.Arrays;

/**
 * @author Zhengyang Xu
 * @version 1.0
 * @date 2021/9/8 20:44
 */
public class SourceTest1_Collection {

    public static void main(String[] args) throws Exception{

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);

        DataStream<SensorReading> dataStream = env.fromCollection(Arrays.asList(new SensorReading("sensor_1", 1547718199L, 35.8),
                new SensorReading("sensor_6", 1547718201L, 15.4),
                new SensorReading("sensor_7", 1547718202L, 6.7),
                new SensorReading("sensor_10", 1547718205L, 38.1)
        ));

        DataStream<Integer> integerDataStream = env.fromElements(1, 2, 3, 4, 5,7);

        dataStream.print("data");
        integerDataStream.print("int");

        env.execute();
    }
}
