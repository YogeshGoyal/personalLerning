/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.sort;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author yokukuma
 */
public class PQTest {

    //read content of file and print only top 5 element.
    public static void main(String[] args) throws Exception {
        File fs = new File("C:\\Users\\yokukuma\\Desktop\\numbers.txt");
        MaxPQ<Integer> pq = new MaxPQ<>(500);
        try (BufferedReader br = new BufferedReader(new FileReader(fs))) {
            String line;
            while( (line = br.readLine() ) != null){
                pq.insert(Integer.parseInt(line));
            }
        }
        
        for (Integer object : pq) {
            System.out.println(object);
        }
        

        
    }
}
