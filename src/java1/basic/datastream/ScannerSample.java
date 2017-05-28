/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.datastream;

import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class ScannerSample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("give name:");
        String name = sc.nextLine();
        System.out.print("give age:");
        int age = sc.nextInt();
        System.out.print("give weight:");
        float weight = sc.nextFloat();
        System.out.println("name: "+ name + " age: "+ age + " weight: "+ weight);
        
    }
    
}
