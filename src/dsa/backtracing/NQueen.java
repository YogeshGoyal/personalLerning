/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa.backtracing;

import java.util.Arrays;

/**
 *
 * @author yokukuma
 */
public class NQueen {

    class Position{
        int row;
        int col;

        public Position(int row, int col) {
            this.row = row;
            this.col = col;
        }
        
    }
    
    public Position[] solveNQueenProblem(int n){
        Position[] positions = new Position[n];
        boolean hasSol =  solveNQueenProblem(n,0,positions);
        if(hasSol){
            return positions;
        }else{
            return new Position[0];
        }
    }
    
    private boolean solveNQueenProblem(int n, int row, Position[] positions) {
        if(n == row){
            return true;
        }
        int col;
        for (col = 0; col < n; col++) {
            boolean foundSafe = true;
            for(int q = 0; q < row;q++){
                if( positions[q].col == col || 
                        positions[q].col- positions[q].row == col-row ||
                        positions[q].col+ positions[q].row == col+row){
                    foundSafe = false;
                    break;
                }
            }
            if(foundSafe){
                positions[row] = new Position(row, col);
                if(solveNQueenProblem(n, row+1, positions)){
                    return true;
                }
            }
            
        }
        
        return false;
    }
    
    
    public static void main(String[] args) {
        NQueen nq = new NQueen();
        Position[] positions = nq.solveNQueenProblem(8);
        System.out.println("size of position is: "+ positions.length);
        Arrays.stream(positions).forEach(position -> System.out.println(position.row + " " + position.col));
    }
}
