/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.misc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author yokukuma
 */
public class Sample3 {
    public static void main(String[] args) throws IOException {
        printLogMail();
    }
    
    public static void printLogMail() throws FileNotFoundException, IOException{
        String fileName = "C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\java1\\basic\\misc\\log.txt";
        BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
        String line = br.readLine();
        
        while(line != null){
            Pattern p = Pattern.compile("([A-Za-z0-9]{1,})@([A-Za-z0-9]{1,})\.([A-Za-z0-9]{1,})");
            Matcher matcher = p.matcher(line);
            if(matcher.find()){
                System.out.println(matcher.groupCount());
                System.out.println(matcher.group(0));
            }
            line = br.readLine();
        }
        
    }
}
