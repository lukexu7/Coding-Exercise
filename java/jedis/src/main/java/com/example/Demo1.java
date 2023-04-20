package com.example;

import redis.clients.jedis.Jedis;

public class Demo1 {
    
    public static void main(String[] args){
        
        Jedis jedis = new Jedis("119.23.226.146",6379);
        String pong = jedis.ping();
        System.out.println("success"+pong);
        jedis.close();
    }
    

    
    
}
