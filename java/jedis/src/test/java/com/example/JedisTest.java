package com.example;

import java.util.Set;
import junit.*;
import redis.clients.jedis.Jedis;

public class JedisTest {
    
    public static void main(String[] args){
        KeyTest();
    }
    public static void KeyTest(){
        Jedis jedis = new Jedis("119.23.226.146",6379);
        String pong = jedis.ping();
        System.out.println("success"+pong);
        jedis.set("k1","v1");
        jedis.set("k2","v2");
        jedis.set("k3","v3");
        Set <String> keys = jedis.keys("*");
        System.out.println(keys.size());
        for(String key:keys){
            System.out.println(key);
        }
        System.out.println(jedis.exists("k1"));
        System.out.println(jedis.ttl("k1"));
        System.out.println(jedis.get("k1"));
        jedis.close();
    }
    
}
