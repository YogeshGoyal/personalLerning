/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.greedy;

/**
 * print maximum activity which can be done by selecting activity when 
 * n total number of activity
 * s[] start time of all activity
 * f[] finish time of all activity
 * @author yokukuma
 */
public class ActivitySelection {
    public static void main(String[] args) {
        int s[] = {1,3,0,5,8,7};
        int f[] = {2,4,6,7,9,9};
        int len = s.length;
        printMaxActivity(s,f,len);
    }

    private static void printMaxActivity(int[] s, int[] f, int len) {
        int i ,j;
        i =0;
        System.out.print("Following activities are selected : \n");
        // always select first activity
        System.out.println(i+" ");
        // now find next activity whist start time is greater then finish time of last activity.
        for(j = 1;j<len;j++){
            if(s[j]>=f[i]){
                System.out.println(j+" ");
                i = j;
            }
        }
    }
}
