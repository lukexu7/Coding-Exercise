package com.atguigu.apitest.transform;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.streaming.api.collector.selector.OutputSelector;
import org.apache.flink.streaming.api.datastream.*;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.co.CoMapFunction;

import java.util.Collections;

/**
 * @ClassName: TransformTest4_MultipleStreams
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/24 13:55
 */
public class TransformTest4_MultipleStreams {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        DataStream<String> inputDataStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

        SingleOutputStreamOperator<SensorReading> mapStream = inputDataStream.map(line -> {
            String[] fields = line.split(",");
            return new SensorReading(fields[0], new Long(fields[1]), new Double(fields[2]));
        });

        SplitStream<SensorReading> splitStream = mapStream.split(new OutputSelector<SensorReading>() {
            @Override
            public Iterable<String> select(SensorReading value) {
                return (value.getTemperature() > 30 ? Collections.singletonList("high") : Collections.singletonList("low"));
            }
        });

        DataStream<SensorReading> highTempStream = splitStream.select("high");

        DataStream<SensorReading> lowTempStream = splitStream.select("low");


        SingleOutputStreamOperator<Tuple2<String, Double>> warningStream = highTempStream.map(new MapFunction<SensorReading, Tuple2<String, Double>>() {
            @Override
            public Tuple2<String, Double> map(SensorReading sensorReading) throws Exception {
                return  new Tuple2<>(sensorReading.getId(),sensorReading.getTemperature());
            }
        });

        ConnectedStreams<Tuple2<String, Double>, SensorReading> connectedStreams = warningStream.connect(lowTempStream);

        SingleOutputStreamOperator<Object> isOverLimit = connectedStreams.map(new CoMapFunction<Tuple2<String, Double>, SensorReading, Object>() {
            @Override
            public Object map1(Tuple2<String, Double> stringDoubleTuple2) throws Exception {
                return new Tuple3<>(stringDoubleTuple2.f0, stringDoubleTuple2.f1, "temperateure is over limit");
            }

            @Override
            public Object map2(SensorReading sensorReading) throws Exception {
                return new Tuple2<>(sensorReading.getId(), sensorReading.getTemperature());
            }
        });
        isOverLimit.print();
















        env.execute();

    }
}
