package com.atguigu.apitest.window;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.commons.collections.IteratorUtils;
import org.apache.flink.api.common.functions.AggregateFunction;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.windowing.WindowFunction;
import org.apache.flink.streaming.api.windowing.assigners.TumblingProcessingTimeWindows;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.util.Collector;

/**
 * @ClassName: WindowTest1_TimeWindow
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/24 20:11
 */
public class WindowTest1_TimeWindow {
    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);


//        DataStream<String> inputStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

        DataStream<String> inputStream = env.socketTextStream("localhost", 7777);
        DataStream<SensorReading> dataStream = inputStream.map(line -> {
            String[] fields = line.split(",");
            return new SensorReading(fields[0], new Long(fields[1]), new Double(fields[2]));
        });

        DataStream<Integer> resultStream = dataStream.keyBy("id")
//                .countWindow(10, 2);
//                .window(EventTimeSessionWindows.withGap(Time.minutes(1)));
//                .window(TumblingProcessingTimeWindows.of(Time.seconds(15)))
                .timeWindow(Time.seconds(15))
                .aggregate(new AggregateFunction<SensorReading, Integer, Integer>() {
                    @Override
                    public Integer createAccumulator() {
                        return 0;
                    }

                    @Override
                    public Integer add(SensorReading value, Integer accumulator) {
                        return accumulator + 1;
                    }

                    @Override
                    public Integer getResult(Integer accumulator) {
                        return accumulator;
                    }

                    @Override
                    public Integer merge(Integer a, Integer b) {
                        return a + b;
                    }
                });
        resultStream.print();


//        dataStream.keyBy("id")
//                        .timeWindow(Time.seconds(15))
//                                .apply(new WindowFunction<SensorReading, Integer, Tuple, TimeWindow>() {
//
//                                    @Override
//                                    public void apply(Tuple tuple, TimeWindow timeWindow, Iterable<SensorReading> iterable, Collector<Integer> collector) throws Exception {
//                                        int size = IteratorUtils.toList(iterable).size();
//                                    }
//                                })

        env.execute();
    }
}
