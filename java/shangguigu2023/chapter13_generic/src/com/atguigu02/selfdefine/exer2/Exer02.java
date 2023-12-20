package com.atguigu02.selfdefine.exer2;

/**
 * ClassName: Exer02
 * Package: com.atguigu02.selfdefine.exer2
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/12/20 - 16:58
 * @Version: v1.0
 */


public class Exer02 {

    public static <E> void method1(E[] e, int a, int b){
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }
}
