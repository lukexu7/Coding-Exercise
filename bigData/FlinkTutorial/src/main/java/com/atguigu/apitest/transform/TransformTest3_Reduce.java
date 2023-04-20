package com.atguigu.apitest.transform;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.KeyedStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.junit.Test;

/**
 * @ClassName: TransformTest3_Reduce
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/23 20:12
 */

public class TransformTest3_Reduce {
    @Test
    public void TestReduce() throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);

        DataStream<String> inputStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

        SingleOutputStreamOperator<SensorReading> mapStream = inputStream.map(line -> {
            String[] fields = line.split(",");
            return new SensorReading(fields[0], new Long(fields[1]), new Double(fields[2]));
        });

//        mapStream.keyBy("id").print("id");
        KeyedStream<SensorReading, String> keyedStream1 = mapStream.keyBy(data -> data.getId());

        SingleOutputStreamOperator<SensorReading> reduceStream = keyedStream1.reduce(new ReduceFunction<SensorReading>() {
            @Override
            public SensorReading reduce(SensorReading t1, SensorReading t2) throws Exception {
                return new SensorReading(t1.getId(), t2.getTimestamp(), Math.max(t1.getTemperature(), t2.getTemperature()));
            }
        });

        reduceStream.print("reduceStream");
        env.execute();


    }



}
