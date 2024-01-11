package com.atguigu01.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Package: com.atguigu01.net
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/10 - 17:25
 * @Version: v1.0
 */


public class InetAddressTest {
    public static void main(String[] args) {


        try {
            InetAddress inet1 = InetAddress.getByName("192.168.3.1");
            System.out.println(inet1);

            InetAddress inet2 = InetAddress.getByName("www.atguigu.com");
            System.out.println(inet2);

            InetAddress inet3 = InetAddress.getLocalHost();
            System.out.println(inet3);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }


    }
}
