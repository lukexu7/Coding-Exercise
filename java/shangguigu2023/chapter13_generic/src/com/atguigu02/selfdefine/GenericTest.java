package com.atguigu02.selfdefine;

import org.junit.Test;

import java.util.ArrayList;

/**
 * ClassName: GenericTEST
 * Package: com.atguigu02.selfdefine
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/19 - 15:48
 * @Version: v1.0
 */


public class GenericTest {

    @Test
    public void test1(){

    }

    @Test
    public void test2(){

        Order order = new Order();
        Object t = order.getT();

        Order<Integer> order2 = new Order<>();
        Integer t2 = order2.getT();


        Order<Object> order3 = new Order<>();


    }

    @Test
    public void test3(){

    }

    @Test
    public void test4(){
        SubOrder2 subOrder2 = new SubOrder2();
        Integer t = subOrder2.getT();

    }

    @Test
    public void test5(){


        Order<Integer> order1 = new Order<>();
        Integer[] arr = {1, 2, 3, 4, 5};
        ArrayList<Integer> integers = order1.copyFromArrayToList(arr);
        for(Integer i:integers){
            System.out.println(i);
        }

    }
}
