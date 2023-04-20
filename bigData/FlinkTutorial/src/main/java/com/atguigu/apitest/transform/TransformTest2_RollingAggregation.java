package com.atguigu.apitest.transform;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @ClassName: TransformTest2_RollingAggregation
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/9 14:35
 */
public class TransformTest2_RollingAggregation {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);


        DataStreamSource<String> inputStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

//        DataStream<SensorReading> dataStream = inputStream.map(new MapFunction<String, SensorReading>() {
//            @Override
//            public SensorReading map(String s) throws Exception {
//                String[] fields = s.split(",");
//
//                return new SensorReading(fields[0],new Long(fields[1]),new Double(fields[2]));
//            }
//        });

        DataStream<SensorReading> dataStream = inputStream.map(line -> {
            String[] fields = line.split(",");
            return new SensorReading(fields[0], new Long(fields[1]), new Double(fields[2]));
        });

        KeyedStream<SensorReading, Tuple> keyedStream = dataStream.keyBy("id");


        KeyedStream<SensorReading, String> keyStream1 = dataStream.keyBy(data -> data.getId());

        keyedStream.maxBy("temperature").print();




        env.execute();


    }
}
