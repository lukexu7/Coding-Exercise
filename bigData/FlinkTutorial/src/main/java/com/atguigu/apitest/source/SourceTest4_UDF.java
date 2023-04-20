package com.atguigu.apitest.source;

import com.atguigu.apitest.beans.SensorReading;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.datastream.DataStreamSource;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.source.SourceFunction;


import java.util.HashMap;
import java.util.Random;

/**
 * @ClassName: SourceTest4_UDF
 * @Description: TODO
 * @Create by: ZhengyangXu
 * @Date: 2021/9/9 13:19
 */
public class SourceTest4_UDF {

    public static void main(String[] args) throws Exception {
        StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();

        DataStream<SensorReading> dataStream = env.addSource(new MySensorSource());

        dataStream.print();
        env.execute();

    }

    public static class MySensorSource implements SourceFunction<SensorReading>{
        private boolean running = true;

        public void run(SourceContext<SensorReading> sourceContext) throws Exception {

            Random random = new Random();

            HashMap<String,Double> sensorTempMap = new HashMap<>();

            for(int i = 0;i<10;i++){
                sensorTempMap.put("sensor_"+(i+1),60+random.nextGaussian()*20);
            }

            while(running){
                for(String sensorId:sensorTempMap.keySet()){
                    Double newtemp = sensorTempMap.get(sensorId)+random.nextGaussian();
                    sensorTempMap.put(sensorId,newtemp);
                    sourceContext.collect(new SensorReading(sensorId,System.currentTimeMillis(),newtemp));

                }
                Thread.sleep(1000L);
            }

        }

        @Override
        public void cancel() {

            running = false;

        }
    }

}
