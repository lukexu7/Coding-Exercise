package com.atguigu01.use;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionMapTest
 * Package: com.atguigu01.use
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/19 - 14:32
 * @Version: v1.0
 */


public class CollectionMapTest {

    @Test
    public void test1(){

        ArrayList list = new ArrayList();

        list.add(58);
        list.add(19);
        list.add(32);
        list.add(99);
        list.add(87);

        Iterator iterator = list.iterator();

    }


    @Test
    public void test2(){

        List<Integer> list = new ArrayList<>();

        list.add(34);
        list.add(94);
        list.add(14);
        list.add(64);
        list.add(34);

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }

    /*
    泛型在map中使用
     */


    @Test

    public void test3(){


        HashMap map = new HashMap();
        //新特性jdk7
        HashMap<String,Integer> map2 = new HashMap<>();
        map.put("haha",34);
        map.put("haba",14);
        map.put("haca",94);

        Set set = map.entrySet();

        var entryset = map.entrySet();



    }
}
