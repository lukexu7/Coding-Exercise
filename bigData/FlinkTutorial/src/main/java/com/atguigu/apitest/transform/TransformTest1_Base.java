package com.atguigu.apitest.transform;

import org.apache.flink.api.common.functions.FilterFunction;
import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;


/**
 * @ClassName: TransformTest1_Base
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/9 14:01
 */
public class TransformTest1_Base {
    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStream<String> inputStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

        DataStream<Integer> mapStream = inputStream.map(new MapFunction<String, Integer>() {
            @Override
            public Integer map(String s) throws Exception {
                return s.length();
            }
        });

        DataStream<String> filterStream = inputStream.filter(new FilterFunction<String>() {
            @Override
            public boolean filter(String s) throws Exception {
                return s.startsWith("sensor_1");
            }
        });

        DataStream<String> flatMapStream = inputStream.flatMap(new FlatMapFunction<String, String>() {
            @Override
            public void flatMap(String s, Collector<String> collector) throws Exception {
                String[] fields = s.split(",");
                for (String field : fields)
                    collector.collect(field);
            }
        });

        mapStream.print("map");
        flatMapStream.print("flatMpa");
        filterStream.print("filter");


        env.execute();

    }


}
