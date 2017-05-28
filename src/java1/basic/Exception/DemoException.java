/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package java1.basic.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

/**
 *
 * @author yokukuma
 */
public class DemoException {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            int k = Integer.parseInt(br.readLine());
            System.out.println(k);
        }catch(Exception e){
            e .printStackTrace();
        }finally{
            br.close();
        }
    }
}
