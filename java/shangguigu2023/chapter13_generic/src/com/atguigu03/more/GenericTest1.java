package com.atguigu03.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest1
 * Package: com.atguigu03.more
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/20 - 18:05
 * @Version: v1.0
 */


public class GenericTest1 {

    @Test
    public void test1(){




    }


    @Test
    public void test2(){

        List<?> list = null;

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("AA");

        list = list1;


        Object o = list.get(0);
        System.out.println(o);


        //list.add("bb"); 不行


    }
}
