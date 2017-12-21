/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author yokukuma
 */
public class test6 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String name = "this is yogesh \n mnit";
        
        File f = new File("C:\\Users\\yokukuma\\Documents\\NetBeansProjects\\personal\\src\\MiscTest\\data.txt");
        FileReader fr = new FileReader(f);
        try (BufferedReader br = new BufferedReader(fr)) {
             HashMap<String,Integer> map = new HashMap<>();
             String str = br.readLine();
             while(str != null){
                 String[] strSplit  = str.split(" ");
                 for (String string : strSplit) {
                     if(map.containsKey(string)){
                         map.put(string, map.get(string)+1);
                     }else{
                         map.put(string, 1);
                     }
                 }
                 str = br.readLine();
             }
             
             for (Map.Entry<String, Integer> entry : map.entrySet()) {
                 System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
        
        StringTokenizer st = new StringTokenizer(name,"\n");
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken().trim());
        }
        
        
        String s = "          Hello   World         ";
        System.out.println("before:"+s + ":");
        s=s.replaceAll("^\\s+|\\s+$", "");
        //s=s.replaceAll("\\s+$", "");
        System.out.println("after:"+s + ":");
        
        String s2 = "          Hello   World YOGESH        ";
        Pattern p = Pattern.compile("^\\s+(.*)\\s+$");
        Matcher m = p.matcher(s2);
        
        while(m.find()){
            System.out.println("matched:" + m.group(1));        
        }
        
        System.out.println(Pattern.matches("[amn]{1,}.*", "abcd"));//false (not a or m or n)  
        System.out.println(Pattern.matches("[amn]", "a"));//true (among a or m or n)  
        System.out.println(Pattern.matches("[amn]", "ammmna"));//false (m and a comes more than once)  

        Top.InnerClass obj = new Top.InnerClass();
        obj.fun();
        Top.InnerClass.fun();
            
    }
}


interface Top{
    
    class InnerClass{
        static void fun(){
            System.out.println("fun");
        }
    }
}