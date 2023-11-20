package com.atguigu06.createmore.callable;

import java.util.concurrent.Callable;

/**
 * ClassName: CallableTest
 * Package: com.atguigu06.createmore.callable
 * Description:
 *
 * @Author: XZY
 * @Create: 2023/11/20 - 15:33
 * @Version: v1.0
 */

class NumThread implements Callable{

    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i=1; i<=100; i++){
            if(i % 2==0){
                System.out.println(i);
                sum += i;
            }
        }
        return sum;
    }
}
public class CallableTest {

    public static void main(String[] args) {




    }


}
