package com.atguigu06.collections;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionsTest
 * Package: com.atguigu06.collections
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/14 - 15:08
 * @Version: v1.0
 */


public class CollectionsTest {


    @Test
    public void test1() {
        List<Integer> list = Arrays.asList(35, 23, 4, 345, 234, 64, 34);

        System.out.println(list);

        Collections.shuffle(list);

        Collections.sort(list);

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;

            }


        });

        System.out.println(list);
    }



    @Test
    public void test2(){

        List<Integer> list = Arrays.asList(34, 2, 23, 13, 56, 97, 54, 34);

        System.out.println(Collections.max(list));

        System.out.println(Collections.max(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        }));


        System.out.println(Collections.frequency(list, 45));


    }

    @Test
    public void test3(){

        List<Integer> src = Arrays.asList(34, 23, 54, 23, 12, 23, 76, 45, 87, 56);



    }

    @Test
    public void test4(){

        ArrayList list1 = new ArrayList();

        list1.add(34);
        list1.add(12);
        list1.add(34);

        List list2 = Collections.unmodifiableList(list1);

    }

    @Test
    public void test5(){
        ArrayList list1 = new ArrayList();

    }
}