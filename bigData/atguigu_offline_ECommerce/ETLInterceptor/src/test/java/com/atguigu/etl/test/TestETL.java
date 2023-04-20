package com.atguigu.etl.test;

import com.atguigu.dw.flume.ETLUtil;
import org.apache.commons.lang.math.NumberUtils;
import org.apache.flume.source.MultiportSyslogTCPSource;
import org.junit.Test;

import java.util.regex.MatchResult;


public class TestETL {

    @Test
    public void test(){
        String startStr = "{\"action\":\"1\",\"ar\":\"MX\",\"ba\":\"HTC\",\"detail\":\"\",\"en\":\"start\",\"entry\":\"5\",\"extend1\":\"\",\"g\":\"7WBS1P70@gmail.com\",\"hw\":\"750*1134\",\"l\":\"pt\",\"la\":\"11.4\",\"ln\":\"-58.7\",\"loading_time\":\"3\",\"md\":\"HTC-8\",\"mid\":\"999\",\"nw\":\"4G\",\"open_ad_type\":\"2\",\"os\":\"8.2.7\",\"sr\":\"A\",\"sv\":\"V2.1.8\",\"t\":\"1626917615686\",\"uid\":\"999\",\"vc\":\"19\",\"vn\":\"1.0.0\"}\n";
        String eventStr = "1626932942604|{\"cm\":{\"ln\":\"-53.0\",\"sv\":\"V2.9.8\",\"os\":\"8.2.3\",\"g\":\"L13I3X6O@gmail.com\",\"mid\":\"896\",\"nw\":\"4G\",\"l\":\"pt\",\"vc\":\"4\",\"hw\":\"640*1136\",\"ar\":\"MX\",\"uid\":\"896\",\"t\":\"1626875089219\",\"la\":\"-33.7\",\"md\":\"HTC-7\",\"vn\":\"1.2.8\",\"ba\":\"HTC\",\"sr\":\"F\"},\"ap\":\"app\",\"et\":[{\"ett\":\"1626892883996\",\"en\":\"display\",\"kv\":{\"goodsid\":\"226\",\"action\":\"2\",\"extend1\":\"2\",\"place\":\"1\",\"category\":\"81\"}},{\"ett\":\"1626884316830\",\"en\":\"loading\",\"kv\":{\"extend2\":\"\",\"loading_time\":\"12\",\"action\":\"2\",\"extend1\":\"\",\"type\":\"3\",\"type1\":\"542\",\"loading_way\":\"1\"}},{\"ett\":\"1626843481513\",\"en\":\"notification\",\"kv\":{\"ap_time\":\"1626926885728\",\"action\":\"3\",\"type\":\"3\",\"content\":\"\"}},{\"ett\":\"1626901477023\",\"en\":\"active_foreground\",\"kv\":{\"access\":\"\",\"push_id\":\"1\"}},{\"ett\":\"1626914397014\",\"en\":\"error\",\"kv\":{\"errorDetail\":\"at cn.lift.dfdfdf.control.CommandUtil.getInfo(CommandUtil.java:67)\\\\n at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\\\\n at java.lang.reflect.Method.invoke(Method.java:606)\\\\n\",\"errorBrief\":\"at cn.lift.dfdf.web.AbstractBaseController.validInbound(AbstractBaseController.java:72)\"}},{\"ett\":\"1626887717988\",\"en\":\"favorites\",\"kv\":{\"course_id\":7,\"id\":0,\"add_time\":\"1626870158190\",\"userid\":5}}]}\n";

        System.out.println(ETLUtil.validStartLog(startStr));
        System.out.println(ETLUtil.validEventLog(eventStr));
        System.out.println(NumberUtils.isDigits("1626932942604"));
    }


}
