package com.atguigu02.selfdefine;

import java.util.ArrayList;

/**
 * ClassName: Order
 * Package: com.atguigu02.selfdefine
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/19 - 15:59
 * @Version: v1.0
 */


public class Order<T> {

    T t;
    int orderId;

    public Order() {
    }

    public Order(T t, int orderId) {
        this.t = t;
        this.orderId = orderId;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }


    public <E> ArrayList<E> copyFromArrayToList(E[] arr){

        ArrayList<E> list = new ArrayList<>();
        for(E e: arr){
            list.add(e);
        }
        return list;
    }
}
