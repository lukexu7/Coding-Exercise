package com.atguigu.apitest.window;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.timestamps.BoundedOutOfOrdernessTimestampExtractor;
import org.apache.flink.streaming.api.windowing.time.Time;

/**
 * @ClassName: WindowTest3_EventTimeWindow
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/26 17:07
 */
public class WindowTest3_EventTimeWindow {
    public static void main(String[] args) {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        env.setParallelism(1);

        DataStream<String> inputStream = env.socketTextStream("local", 7777);

        DataStream<SensorReading> dataStream = inputStream.map(line -> {
            String[] fields = line.split(",");
            return new SensorReading(fields[0], new Long(fields[1]), new Double(fields[2]));

//        }).assignTimestampsAndWatermarks(new BoundedOutOfOrdernessTimestampExtractor<SensorReading>(Time.seconds(2)) {
//            @Override
//            public long extractTimestamp(SensorReading sensorReading) {
//                return sensorReading.getTimestamp()*1000L;
//            }
//        });
        });
    }
}
