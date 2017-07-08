/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.DP;

/**
 *
 * @author yokukuma
 */
public class Knapsack01 {
    public static void main(String[] args) {
        int val[] = {22, 20, 15, 30, 24, 54, 21, 32, 18, 25};
        int wt[] = {4, 2, 3, 5, 5, 6, 9, 7, 8, 10};
        System.out.println("total value is: "+ bottomUpDP(val, wt, 5));
    }
    
    /**
     * Solves 0/1 knapsack in bottom up dynamic programming
     */
    public static int  bottomUpDP(int val[], int wt[], int W){
        int K[][] = new int[val.length+1][W+1];
        for(int i =0;i<=val.length;i++){
            for(int j = 0;j<=W;j++){
                if(i ==0 || j == 0){
                    K[i][j]=0;
                    continue;
                }
                if(j-wt[i-1] >= 0){
                    K[i][j] = Math.max(K[i-1][j-wt[i-1]]+ val[i-1], K[i-1][j]);
                }else{
                    K[i][j] =K[i-1][j];
                }
            }
        }
        
        return K[val.length][W];
    }
}
