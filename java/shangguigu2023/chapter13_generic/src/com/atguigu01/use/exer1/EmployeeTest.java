package com.atguigu01.use.exer1;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTEST
 * Package: com.atguigu01.use
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/19 - 14:57
 * @Version: v1.0
 */


public class EmployeeTest {

    @Test
    public void test1(){
        TreeSet<Employee> set = new TreeSet<>();

        Employee e1 = new Employee("TOM",18,new MyDate(1888,12,12));
        Employee e2 = new Employee("lilei", 20, new MyDate(1999, 11, 30));
        Employee e3 = new Employee("sfei", 20, new MyDate(1934, 11, 7));
        Employee e4 = new Employee("asf", 20, new MyDate(1912, 11, 5));
        Employee e5 = new Employee("csdi", 20, new MyDate(2000, 12, 30));
        Employee e6 = new Employee("utrty", 20, new MyDate(1999, 8, 6));

        set.add(e1);
        set.add(e2);
        set.add(e3);
        set.add(e4);
        set.add(e5);
        set.add(e6);

        Iterator<Employee> iterator = set.iterator();
        while(iterator.hasNext()){
            Employee e = iterator.next();
            System.out.println(e);
        }


    }

    @Test
    public void test2(){
        Comparator<Employee> comparator = new Comparator<>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int yeard = o1.getBirthday().getYear()- o2.getBirthday().getYear();
                if (yeard != 0){
                    return yeard;
                }

                int monthd = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
                if(monthd != 0){
                    return monthd;
                }

                int dayd = (o1.getBirthday().getDay()- o2.getBirthday().getDay());
                return dayd;
            }

            @Override
            public boolean equals(Object obj) {
                return false;
            }
        };
    }
}
