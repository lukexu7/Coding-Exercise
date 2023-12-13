package com.atguigu05.map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName: MapTest
 * Package: com.atguigu05.map
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/12 - 17:24
 * @Version: v1.0
 */


public class MapTest {

    @Test
    public void test4(){

        HashMap map = new HashMap();

        map.put("AA",56);
        map.put("AA",56);
        map.put("bb",56);
        map.put("cc",90);
        map.put(new Person("Jerry",12),56);

        System.out.println(map);
        System.out.println(map.size());

        System.out.println(map.remove("dd"));

        //修改
        Object oldVlue = map.put("bb", 99);
        System.out.println(oldVlue);
        System.out.println(map.get("bb"));


        Set set = map.keySet();



    }

    @Test
    public void test6(){
        HashMap map = new HashMap();
        map.put("AA",56);
        map.put("AA",56);
        map.put("bb",56);
        map.put("cc",90);

        Set set = map.entrySet();

        Iterator iterator = set.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
