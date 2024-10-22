package flink.examples.datastream._02._2_5;

import org.apache.flink.api.common.functions.FlatMapFunction;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.datastream.DataStreamSink;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.datastream.SingleOutputStreamOperator;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.util.Collector;

import java.util.Arrays;

public class WordCountExamples {

    public static void main(String[] args) throws Exception {

        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStreamSource<String> source = env.socketTextStream("localhost",7000);


        SingleOutputStreamOperator<Tuple2<String, Integer>> singleWorldDataStream = source.flatMap(new FlatMapFunction<String, Tuple2<String, Integer>>() {
            @Override
            public void flatMap(String line, Collector<Tuple2<String, Integer>> out) throws Exception {
                Arrays.stream(line.split(" "))
                        .forEach(singleWord -> out.collect(Tuple2.of(singleWord, 1)));
            }
        });

        SingleOutputStreamOperator<Tuple2<String, Integer>> wordCountDataStream = singleWorldDataStream.keyBy(v -> v.f0).sum(1);


        DataStreamSink<Tuple2<String, Integer>> sink = wordCountDataStream.print();


        env.execute();


    }
}
