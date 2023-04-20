package com.atguigu.apitest.transform;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.functions.RichMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.configuration.Configuration;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @ClassName: TransformTest5_RichFunction
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/24 15:43
 */
public class TransformTest5_RichFunction {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(5);

        DataStream<String> inputDataStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

        DataStream<SensorReading> dataStream = inputDataStream.map(line -> {
            String[] fields = line.split(",");
            return new SensorReading(fields[0], new Long(fields[1]), new Double(fields[2]));
        });

        DataStream<Tuple2<String,Integer>> resultStream = dataStream.map(new myMapper());

        resultStream.print();

        env.execute();
    }

    public static class myMapper0 implements MapFunction<SensorReading,Tuple2<String,Integer>> {

        @Override
        public Tuple2<String, Integer> map(SensorReading sensorReading) throws Exception {
            return new Tuple2<>(sensorReading.getId(), sensorReading.getId().length());
        }
    }

    public static class myMapper extends RichMapFunction<SensorReading,Tuple2<String,Integer>>{

        @Override
        public Tuple2<String, Integer> map(SensorReading sensorReading) throws Exception {
            return new Tuple2<>(sensorReading.getId(),getRuntimeContext().getAttemptNumber());
        }

        @Override
        public void open(Configuration parameters) throws Exception {
            System.out.println("open");
        }

        @Override
        public void close() throws Exception {
            System.out.println("close");
        }
    }
}
