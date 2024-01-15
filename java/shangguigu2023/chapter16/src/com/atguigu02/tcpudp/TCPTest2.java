package com.atguigu02.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest2
 * Package: com.atguigu02.tcpudp
 * Description:
 *
 * @Author: XZY
 * @Create: 2024/1/15 - 15:49
 * @Version: v1.0
 */


public class TCPTest2 {

    @Test
    public void client(){
        FileInputStream fis = null;
        OutputStream os = null;
        Socket socket = null;

        try {
            //创建socket
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 9090;
            socket = new Socket(inetAddress,port);

            //2.创建file实例，fileInputStream的实例
            File file = new File("pic.png");
            fis = new FileInputStream(file);


            //3.通过socket获取输出流
            os = socket.getOutputStream();


            //4.读写数组

            byte[] buffer = new byte[1024];
            int len;

            while((len = fis.read(buffer))!=-1){

                os.write(buffer,0,len);

            }

            System.out.println("数据发送完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4.关闭socket流

            try {
                if (os != null) {

                    os.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null) {

                    fis.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                if(socket != null){
                    socket.close();
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
    }


    @Test
    public void server() throws IOException {

        //1.serversocket
        int port= 9090;
        ServerSocket serverSocket = new ServerSocket(port);


        //2.客户端socket

        Socket socket = serverSocket.accept();


        //3.通过socket获取输入流
        InputStream is = socket.getInputStream();


        //4.file,fileoutputStream
        File file = new File("pic_c.jpg");
        FileOutputStream fos = new FileOutputStream(file);


        //5.读写
        byte[] buffer = new byte[1024];
        int len;

        while((len = is.read(buffer)) != -1){

            fos.write(buffer, 0 ,len);

        }

        System.out.println("数据接收完毕");


        fos.close();
        is.close();
        socket.close();
        serverSocket.close();


    }
}
