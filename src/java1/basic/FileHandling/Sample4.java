/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/**
 *
 * @author yokukuma
 */
public class Sample4 {
    public static void main(String[] args) throws IOException {
        
        String fname = "D:\\personal\\work\\learning\\1.txt";
        
        BufferedReader br;
        br = new BufferedReader( new InputStreamReader(System.in));
        String line = br.readLine();
        System.out.println(line);
        while(line != null){
            System.out.println(line);
            line = br.readLine();
        }
        String fwname = "D:\\personal\\work\\learning\\2.txt";
        BufferedWriter bw = new BufferedWriter(new FileWriter(new File(fwname)));
        bw.write("this is first line\n");
        bw.write("this is second line\n");
        bw.flush();
        bw.close();
        
//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//System.out.print("Enter your name: ");
 
//String name = reader.readLine();
//System.out.println("Your name is: " + name);


//Scanner scanner = new Scanner(System.in);
//System.out.print("Enter your nationality: ");
//String nationality = scanner.nextLine();
// 
//System.out.print("Enter your age: ");
//int age = scanner.nextInt();

//Console console = System.console();
//if (console == null) {
//    System.out.println("No console: non-interactive mode!");
//    System.exit(0);
//}
// 
//System.out.print("Enter your username: ");
//String username = console.readLine();
// 
//System.out.print("Enter your password: ");
//char[] password = console.readPassword();
// 
//String passport = console.readLine("Enter your %d (th) passport number: ", 2);
        
    }
}
