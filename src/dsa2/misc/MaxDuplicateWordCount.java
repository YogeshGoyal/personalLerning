/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa2.misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 *
 * @author yokukuma
 */
public class MaxDuplicateWordCount {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("D:\\project\\doc\\work_assigned");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        Map<String,Integer> counter= new  HashMap<>();
        while(line != null){
            for (String string : line.split(" ")) {
                
                if(counter.containsKey(string)){
                    counter.put(string, counter.get(string)+1);
                }else{
                    counter.put(string, 1);
                }
            }
            line = br.readLine();
        }

        List<Map.Entry<String,Integer>> list = new ArrayList<>(counter.entrySet());
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        
        for (Map.Entry<String, Integer> entry : list) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + ":"+ value);
            
        }
    
        
    }
}
