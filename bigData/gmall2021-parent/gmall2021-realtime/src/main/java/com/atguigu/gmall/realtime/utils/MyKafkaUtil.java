package com.atguigu.gmall.realtime.utils;

import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.kafka.clients.consumer.ConsumerConfig;

import java.util.Properties;
import java.util.function.Consumer;

public class MyKafkaUtil {
    private static String kafkaServer = "hadoop102:9092,hadoop103:9092,hadoop104:9092";
    public static FlinkKafkaConsumer<String> getKafkaSource(String topic, String groupId ){
        Properties props = new Properties();
        props.setProperty(ConsumerConfig.GROUP_ID_CONFIG,groupId);
        props.setProperty(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,kafkaServer);
        return new FlinkKafkaConsumer<String>(topic,new SimpleStringSchema(),props);

    }
}
