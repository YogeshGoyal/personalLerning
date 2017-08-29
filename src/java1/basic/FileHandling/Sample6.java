/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author yokukuma
 */
public class Sample6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        System.out.println("size of integer:"+ Integer.SIZE);
        File file = new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\java1\\basic\\FileHandling\\employee.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        Map<String, String> dataMap = new ConcurrentHashMap<>();

        while (line != null) {
            line = line.trim();
            System.out.println("data beofre split:" + line);
            if (!"".equals(line)) {
                String[] data = line.split("\\s+");
                if (data.length == 3) {
                    Pattern pattern = Pattern.compile("[a-zA-Z0-9-_.]+@[a-zA-Z]+[.]{1}[a-zA-Z]{2,6}", Pattern.CASE_INSENSITIVE);
                    Matcher matcher = pattern.matcher(line);
                    if (matcher.find()) {
                        System.out.println("data is: " + matcher.group(0));
                        dataMap.put(data[0], matcher.group(0));
                    }

                }

            }
            line = br.readLine();
        }
        br.close();
        File fileWriter = new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\java1\\basic\\FileHandling\\employee1.txt");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileWriter));
        for (Map.Entry<String, String> entry : dataMap.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
            bw.write(key + " "+ value+"\n");
        }
        bw.close();
    }
}


