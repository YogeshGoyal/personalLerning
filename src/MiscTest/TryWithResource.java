/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.util.HashMap;

/**
 *
 * @author yokukuma
 */
public class TryWithResource {
    public static void main(String[] args) throws Exception {
         try (TestMe r = new TestMe()) {
            r.generalTest();
        } finally {
            System.out.println("From Final Block");
        }
         
         int[] num = {1,2,3,4,5,3};
         HashMap<Integer,Integer> hash= new HashMap<>();
         for (int i : num) {
            hash.put(i, hash.get(i)+1);
        }
         for (Integer value : hash.values()) {
            
        }
         
    }
}




class TestMe implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println(" From Close -  AutoCloseable  ");
    }

    public void generalTest() {
        System.out.println(" GeneralTest ");
    }
}
