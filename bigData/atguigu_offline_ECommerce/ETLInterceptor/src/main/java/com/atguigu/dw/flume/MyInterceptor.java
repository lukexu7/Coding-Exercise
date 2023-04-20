package com.atguigu.dw.flume;

import org.apache.flume.Context;
import org.apache.flume.Event;
import org.apache.flume.interceptor.Interceptor;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MyInterceptor implements Interceptor {

    private List<Event> results = new ArrayList<>();
    private String startFlag = "\"en\":\"start\"";
    @Override
    public void initialize() {

    }

    @Override //核心拦截
    public Event intercept(Event event) {

        byte[] body = event.getBody();
        Map<String,String> headers = event.getHeaders();

        String bodyStr = new String(body, Charset.forName("utf-8"));
        boolean flag = true;
        if (bodyStr.contains(startFlag)){
            headers.put("topic","topic_start");
            flag = ETLUtil.validStartLog(bodyStr);
        } else {
            headers.put("topic","topic_event");
            flag = ETLUtil.validEventLog(bodyStr);
        }

        if (!flag){
            return null;
        }


        return event;
    }

    @Override
    public List<Event> intercept(List<Event> list) {

        results.clear();
        for (Event event : list){
            Event result = intercept(event);

            //event不符合要求，返回null
            if (result != null){
                results.add(result);
            }
        }

        return results;
    }

    @Override
    public void close() {

    }

    public static class Builder implements  Interceptor.Builder{

        @Override //创建拦截器对象
        public Interceptor build() {
            return new MyInterceptor();
        }

        @Override
        public void configure(Context context) {

        }
    }
}
