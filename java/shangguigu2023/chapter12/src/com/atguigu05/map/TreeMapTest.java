package com.atguigu05.map;

import org.junit.Test;

import java.util.Set;
import java.util.TreeMap;

/**
 * ClassName: TreeMapTest
 * Package: com.atguigu05.map
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/13 - 17:20
 * @Version: v1.0
 */


public class TreeMapTest {

    @Test
    public void test(){
        TreeMap map = new TreeMap();

        map.put("cc",89);
        map.put("bb",89);
        map.put("jj",89);


        Set entrySet = map.entrySet();
        for(Object entry:entrySet){
            System.out.println(entry);
        }

    }

}
