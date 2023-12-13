package com.atguigu05.map.exer1;

import java.util.*;

/**
 * ClassName: SingerTest
 * Package: com.atguigu05.map.exer1
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/13 - 23:15
 * @Version: v1.0
 */


public class SingerTest {

    public static void main(String[] args) {


        HashMap singers = new HashMap();

        String singer1 = "Jay Chou";

        ArrayList songs1 = new ArrayList();

        songs1.add("晴天");
        songs1.add("七里阿星");
        songs1.add("发如雪");
        songs1.add("屋顶");
        songs1.add("青花瓷");



        String singer2 = "JJ";
        ArrayList songs2 = new ArrayList();

        songs2.add("江南");
        songs2.add("caocao");
        songs2.add("koukou");


        singers.put(singer1,songs1);
        singers.put(singer2,songs2);


        Set set = singers.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("歌手:"+entry.getKey());
            System.out.println("歌曲:"+entry.getValue());
        }


    }
}
