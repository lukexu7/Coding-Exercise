package com.atguigu.apitest.window;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.api.common.functions.AggregateFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.api.java.tuple.Tuple3;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;

/**
 * @ClassName: WindowTest2_CountWindow
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/26 13:30
 */
public class WindowTest2_CountWindow {
    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setParallelism(1);


//        DataStream<String> inputStream = env.readTextFile("E:\\codingExercise\\bigData\\FlinkTutorial\\src\\main\\resources\\sensor.txt");

        DataStream<String> inputStream = env.socketTextStream("localhost", 7777);
        DataStream<SensorReading> dataStream = inputStream.map(line -> {
            String[] fields = line.split(",");
            return new SensorReading(fields[0], new Long(fields[1]), new Double(fields[2]));
        });

        SingleOutputStreamOperator<Tuple2<String, Double>> avgTemp = dataStream.keyBy("id")
                .countWindow(2, 10)
                .aggregate(new MyAvgTemp());

        avgTemp.print();

        env.execute();
    }

    public static class MyAvgTemp implements AggregateFunction<SensorReading, Tuple3<String,Double,Integer>,Tuple2<String,Double>>{


        @Override
        public Tuple3<String, Double, Integer> createAccumulator() {
            return new Tuple3<>("",0.0,0);
        }

        @Override
        public Tuple3<String, Double, Integer> add(SensorReading sensorReading, Tuple3<String, Double, Integer> stringDoubleIntegerTuple3) {
            return new Tuple3<>(sensorReading.getId(),stringDoubleIntegerTuple3.f1+sensorReading.getTemperature(),stringDoubleIntegerTuple3.f2+1);
        }

        @Override
        public Tuple2<String, Double> getResult(Tuple3<String, Double, Integer> stringDoubleIntegerTuple3) {
            return new Tuple2<>(stringDoubleIntegerTuple3.f0, stringDoubleIntegerTuple3.f1/stringDoubleIntegerTuple3.f2);
        }

        @Override
        public Tuple3<String, Double, Integer> merge(Tuple3<String, Double, Integer> stringDoubleIntegerTuple3, Tuple3<String, Double, Integer> acc1) {
            return new Tuple3<>(stringDoubleIntegerTuple3.f0,stringDoubleIntegerTuple3.f1+acc1.f1,stringDoubleIntegerTuple3.f2+acc1.f2);
        }
    }
}
