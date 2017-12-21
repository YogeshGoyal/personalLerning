/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jedisLearn;

import redis.clients.jedis.Jedis;

/**
 *
 * @author yokukuma
 */
public class RedisJava { 
   public static void main(String[] args) { 
      //Connecting to Redis server on localhost 
      Jedis jedis = new Jedis("localhost"); 
      System.out.println("Connection to server sucessfully"); 
      //check whether server is running or not 
      jedis.set("events/city/rome", "32,15,223,828");
      System.out.println("Server is running: "+jedis.info()); 
      String cachedResponse = jedis.get("events/city/rome");
       System.out.println("jedisLearn.RedisJava.main(): "+ cachedResponse);
      
   } 
} 