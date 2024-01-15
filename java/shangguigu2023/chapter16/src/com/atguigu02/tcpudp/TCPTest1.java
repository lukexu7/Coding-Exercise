package com.atguigu02.tcpudp;

import org.junit.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest1
 * Package: com.atguigu02.tcpudp
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/15 - 15:17
 * @Version: v1.0
 */


public class TCPTest1 {

    @Test
    public void client(){


        Socket socket = null;
        OutputStream os = null;
        try {
            InetAddress inetA = InetAddress.getByName("192.168.1.2");
            int port = 8989;
            socket = new Socket(inetA,port);

            os = socket.getOutputStream();

            os.write("fy".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {

                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if (os != null) {
                    os.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }


    @Test
    public void server() {




        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        try {
            int port = 8989;
            serverSocket =  new ServerSocket(port);
            socket = serverSocket.accept();

            System.out.println("服务端已开启");

            is = socket.getInputStream();
            byte[] buffer = new byte[1024];

            int len;

            while((len = is.read(buffer))!=-1){
                String str = new String(buffer, 0, len);
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null) {
                    serverSocket.close();

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (is != null) {

                    is.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("\n数据接收完毕");


    }




}
