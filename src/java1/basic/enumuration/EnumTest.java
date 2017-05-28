/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1.basic.enumuration;

/**
 *
 * @author yokukuma
 */
public class EnumTest {
    public static void main(String[] args) {
        RUN.FIVE.printRun(RUN.SIX);
    }
}


enum RUN{
    ONE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX;
    
    void printRun(RUN run){
        if(run == RUN.FOUR){
            System.out.println("you made 4");
        }
        
        if(run == RUN.ONE){
            System.out.println("you made 1");
        }
        
        if(run == RUN.SIX){
            System.out.println("you made 6.. Supperrbbb");
        }
        
        if(run == RUN.TWO){
            System.out.println("you made 2");
        }
        
    }
}