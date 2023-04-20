package com.atguigu.juc;

public class TestThread extends Thread {
    
    
    public static void main(String[] args){
        
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        TestThread t3 = new TestThread();

        t1.start();
        t2.start();
        t3.start();

        System.out.println(Thread.currentThread().getName());
        
        
    }
    
    @Override 
    public void run(){
        
        for (int i = 0; i <20; i++){
            System.out.println(Thread.currentThread().getName()+"-------"+i+"--------");
        }
    }
    
    
    
}
