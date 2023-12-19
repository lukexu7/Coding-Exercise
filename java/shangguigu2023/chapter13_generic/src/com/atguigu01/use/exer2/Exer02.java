package com.atguigu01.use.exer2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Predicate;

/**
 * ClassName: Exer02
 * Package: com.atguigu01.use.exer2
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/19 - 15:14
 * @Version: v1.0
 */


public class Exer02 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            int random = (int)(Math.random() * (99-0+1));
            list.add(random);
        }

        for (Integer value : list){
            System.out.println(value);
        }


        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 == 0;
            }
        });

        System.out.println(list);

        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
