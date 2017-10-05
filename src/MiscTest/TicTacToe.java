/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiscTest;

import java.util.Scanner;

/**
 *
 * @author yokukuma
 */
public class TicTacToe {

    private Board board;            // the game board
    private GameState currentState; // the current state of the game (of enum GameState)
    private Seed currentPlayer;     // the current player (of enum Seed)

    private static Scanner in = new Scanner(System.in);  // input Scanner

    public TicTacToe() {
        board = new Board();  // allocate game-board

        // Initialize the game-board and current status
        initGame();
        // Play the game once. Players CROSS and NOUGHT move alternately.
        do {
            playerMove(currentPlayer); // update the content, currentRow and currentCol
            board.paint();             // ask the board to paint itself
            updateGame(currentPlayer); // update currentState
            // Print message if game-over
            if (currentState == GameState.CROSS_WON) {
                System.out.println("'X' won! Bye!");
            } else if (currentState == GameState.NOUGHT_WON) {
                System.out.println("'O' won! Bye!");
            } else if (currentState == GameState.DRAW) {
                System.out.println("It's Draw! Bye!");
            }
            // Switch player
            currentPlayer = (currentPlayer == Seed.CROSS) ? Seed.NOUGHT : Seed.CROSS;
        } while (currentState == GameState.PLAYING);  // repeat until game-over
    }

    /**
     * Initialize the game-board contents and the current states
     */
    public void initGame() {
        board.init();  // clear the board contents
        currentPlayer = Seed.CROSS;       // CROSS plays first
        currentState = GameState.PLAYING; // ready to play
    }

    /**
     * The player with "theSeed" makes one move, with input validation. Update
     * Cell's content, Board's currentRow and currentCol.
     */
    public void playerMove(Seed theSeed) {
        boolean validInput = false;  // for validating input
        do {
            if (theSeed == Seed.CROSS) {
                System.out.print("Player 'X', enter your move (row[1-3] column[1-3]): ");
            } else {
                System.out.print("Player 'O', enter your move (row[1-3] column[1-3]): ");
            }
            int row = in.nextInt() - 1;
            int col = in.nextInt() - 1;
            if (row >= 0 && row < Board.ROWS && col >= 0 && col < Board.COLS
                    && board.cells[row][col].content == Seed.EMPTY) {
                board.cells[row][col].content = theSeed;
                board.currentRow = row;
                board.currentCol = col;
                validInput = true; // input okay, exit loop
            } else {
                System.out.println("This move at (" + (row + 1) + "," + (col + 1)
                        + ") is not valid. Try again...");
            }
        } while (!validInput);   // repeat until input is valid
    }

    /**
     * Update the currentState after the player with "theSeed" has moved
     */
    public void updateGame(Seed theSeed) {
        if (board.hasWon(theSeed)) {  // check for win
            currentState = (theSeed == Seed.CROSS) ? GameState.CROSS_WON : GameState.NOUGHT_WON;
        } else if (board.isDraw()) {  // check for draw
            currentState = GameState.DRAW;
        }
        // Otherwise, no change to current state (still GameState.PLAYING).
    }

    public static void main(String[] args) {
        new TicTacToe();  // Let the constructor do the job
    }

    //player
    enum Seed {
        EMPTY, NOUGHT, CROSS;
    }

    // current staus of game
    enum GameState {
        PLAYING, DRAW, NOUGHT_WON, CROSS_WON;
    }

    class Cell {  // save as Cell.java
        // package access

        Seed content; // content of this cell of type Seed.
        // take a value of Seed.EMPTY, Seed.CROSS, or Seed.NOUGHT
        int row, col; // row and column of this cell, not used in this program

        /**
         * Constructor to initialize this cell
         */
        public Cell(int row, int col) {
            this.row = row;
            this.col = col;
            clear();  // clear content
        }

        /**
         * Clear the cell content to EMPTY
         */
        public void clear() {
            content = Seed.EMPTY;
        }

        /**
         * Paint itself
         */
        public void paint() {
            switch (content) {
                case CROSS:
                    System.out.print(" X ");
                    break;
                case NOUGHT:
                    System.out.print(" O ");
                    break;
                case EMPTY:
                    System.out.print("   ");
                    break;
            }
        }
    }

    class Board {  // save as Board.java
        // Named-constants for the dimensions

        public static final int ROWS = 3;
        public static final int COLS = 3;

        // package access
        Cell[][] cells;  // a board composes of ROWS-by-COLS Cell instances
        int currentRow, currentCol;  // the current seed's row and column

        /**
         * Constructor to initialize the game board
         */
        public Board() {
            cells = new Cell[ROWS][COLS];  // allocate the array
            for (int row = 0; row < ROWS; ++row) {
                for (int col = 0; col < COLS; ++col) {
                    cells[row][col] = new Cell(row, col); // allocate element of the array
                }
            }
        }

        /**
         * Initialize (or re-initialize) the contents of the game board
         */
        public void init() {
            for (int row = 0; row < ROWS; ++row) {
                for (int col = 0; col < COLS; ++col) {
                    cells[row][col].clear();  // clear the cell content
                }
            }
        }

        /**
         * Return true if it is a draw (i.e., no more EMPTY cell)
         */
        public boolean isDraw() {
            for (int row = 0; row < ROWS; ++row) {
                for (int col = 0; col < COLS; ++col) {
                    if (cells[row][col].content == Seed.EMPTY) {
                        return false; // an empty seed found, not a draw, exit
                    }
                }
            }
            return true; // no empty cell, it's a draw
        }

        /**
         * Return true if the player with "theSeed" has won after placing at
         * (currentRow, currentCol)
         */
        public boolean hasWon(Seed theSeed) {
            return (cells[currentRow][0].content == theSeed // 3-in-the-row
                    && cells[currentRow][1].content == theSeed
                    && cells[currentRow][2].content == theSeed
                    || cells[0][currentCol].content == theSeed // 3-in-the-column
                    && cells[1][currentCol].content == theSeed
                    && cells[2][currentCol].content == theSeed
                    || currentRow == currentCol // 3-in-the-diagonal
                    && cells[0][0].content == theSeed
                    && cells[1][1].content == theSeed
                    && cells[2][2].content == theSeed
                    || currentRow + currentCol == 2 // 3-in-the-opposite-diagonal
                    && cells[0][2].content == theSeed
                    && cells[1][1].content == theSeed
                    && cells[2][0].content == theSeed);
        }

        /**
         * Paint itself
         */
        public void paint() {
            for (int row = 0; row < ROWS; ++row) {
                for (int col = 0; col < COLS; ++col) {
                    cells[row][col].paint();   // each cell paints itself
                    if (col < COLS - 1) {
                        System.out.print("|");
                    }
                }
                System.out.println();
                if (row < ROWS - 1) {
                    System.out.println("-----------");
                }
            }
        }
    }
}
