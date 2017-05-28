/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 * Try with resource java 1.7 and after
 */
package java1.basic.Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author yokukuma
 */
public class TryWithResource  {
    public static void main(String[] args) throws Exception {
        // here br will automatically closed if reading fails
        try (BufferedReader br  = new BufferedReader(new InputStreamReader(System.in))){
            String str = br.readLine();
        }
    }
}
