import java.lang.Character.Subset;
import java.util.*;
import java.util.concurrent.Flow.Subscription;

import javax.security.auth.Subject;

//-------->>BACKTRACKING IN JAVA <<-----------------------------

public class L17_BACKTRACKING {
    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // CHANGE ARRAY FUNCTION TO DECREASE THE ELEMENTS BY 2
    public static void changeArray(int arr[], int index, int val) {
        // base case
        if (index == arr.length) {
            printarray(arr);
            return;
        }

        // kaam
        arr[index] = val;
        changeArray(arr, index + 1, val + 1);// function call step0
        arr[index] -= 2; // backtraking step

    }

    // function to find the subdtrings.
    public static void subStrings(String str, String ans, int index) {
        // base case
        if (str.length() == index) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }
        // backticking logic
        // choices
        // chose to be part in the substring
        subStrings(str, ans + str.charAt(index), index + 1);
        // chose to be not part of substring
        subStrings(str, ans, index + 1);
    }

    // --------------------------------------------------------------------------------------------------------------
    public static void permutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // kaam
        // time complexity of this code is O(n*n!).
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // now "abcde" = "ab"+"de" =>"abde"
            String New = str.substring(0, i) + str.substring(i + 1);
            permutation(New, ans + curr);
        }
    }

    // ----------------------------------------------------------------------------------------------------------
    // classic N-QUEENS probleam

    // board printing function
    public static void printBoard(char board[][]) {
        System.out.println("------------------- board");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // n-Queens count ways.
    static int count = 0;

    // function to check the safe place to make the sit the queens that they will
    // not attack each other
    public static boolean safePlace(char board[][], int row, int column) {
        // to solve this probleam we need 3 approach

        // vertical up approach
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][column] == 'Q') {
                return false;
            }
        }

        // diagonal left up approach
        for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up approach
        for (int i = row - 1, j = column + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    // n-queens in n-rows approach
    public static void nQueens(char board[][], int row) {
        // base case
        if (board.length == row) {
            printBoard(board);
            count++; // n-Queens count ways.
            return;
        }

        // kamm
        // collumn sitting
        // make sitting the n-queens in n-rows
        for (int i = 0; i < board.length; i++) {
            if (safePlace(board, row, i)) {
                board[row][i] = 'Q'; // make queen sitting
                nQueens(board, row + 1);// function call for next row
                board[row][i] = '.';// backtracking step
            }
        }
    }

    // n-Queens print one solution way
    public static boolean Queens(char board[][], int row) {
        // base case
        if (board.length == row) {
            // printBoard(board);
            count++; // n-Queens count ways.
            return true;
        }
        for (int i = 0; i < board.length; i++) {
            if (safePlace(board, row, i)) {
                board[row][i] = 'Q'; // make queen sitting
                if (Queens(board, row + 1)) {
                    return true;
                }

                board[row][i] = '.';// backtracking step
            }
        }
        return false;
    }

    // ----------------------------------------------------------------------------------------------------------
    // GRID WAYS PROBLEAM.
    public static int gridWays(int i, int j, int row, int column) {
        // base case
        if (i == row - 1 && j == column - 1) {// when we reach on our target.
            return 1;
        } else {
            if (i == row || j == column) { // corner cases that no moves outside of the grid.
                return 0;
            }
            // moves
            int w1 = gridWays(i + 1, j, row, column);// down moves
            int w2 = gridWays(i, j + 1, row, column);// right moves

            int totalMoves = w1 + w2;

            return totalMoves;

        }
    }

    // --------------------------------------------------------------------------------------------------------
    // SUDOKO SOLVER
    public static boolean sudokuSlover(int sudoku[][], int row, int column) {
        // base case
        if(row == 9 && column ==9){
            return true;
        }
        else if (row == 9) {
            return false;
        }

        // kaam
        int Nextrow = row, Nextcolumn = column + 1;
        if (column + 1 == 9) {
            Nextrow = row + 1;
            Nextcolumn = 0;
        }

        if (sudoku[row][column] != 0) {
            return sudokuSlover(sudoku, Nextrow, Nextcolumn);
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, column, digit)) {
                sudoku[row][column] = digit;
                if (sudokuSlover(sudoku, Nextrow, Nextcolumn)) {// soln. exist
                    return true;
                }
                sudoku[row][column] = 0;
            }
        }
        return false;
    }

    public static boolean isSafe(int sudoku[][], int row, int column, int digit) {
        // for row traversal
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][column] == digit) {
                return false;
            }
        }

        // for column traversal
        for (int j = 0; j <= 8; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // grid traversal
        int startRow = (row / 3) * 3; // basic formula to calculate any grid starting row
        int startcolumn = (column / 3) * 3; // basic formula to calculate any grid starting column

        // gird matric 3x3 traversal
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startcolumn; j < startcolumn + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    // print function
    public static void print(int sudoku[][]) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku.length; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    //-------------------------------------------------------------------------------------------------------------------
    //mice maze probleam
    public static boolean isSafemaze(int arr[][], int x, int y, int n){
        if(x<n && y<n && arr[x][y] == 1 ){
            return true;
        }
        return false;
    }

    public static boolean solvemaze(int arr[][], int x, int y, int n,int sol[][]){
        //base case
        if(x == n-1 && y == n-1){
            sol[x][y] =1;
            return true;
        }

        //kamm
        if(isSafemaze(arr, x, y, n)){
            sol[x][y] =1;
            if (solvemaze(arr, x+1, y, n, sol)) {
                return true;
            }
            if (solvemaze(arr, x, y+1, n, sol)) {
                return true;
            }
            sol[x][y] = 0;//backtracking step
            return false;
        }
        return false;
    }
   
//-------------------------------------------------------------------------------------------------------------------

    //kings knight path probleam
    public static boolean path(int arr[][],int row, int col, int num){
        int l= arr.length;
        //base case
        if(arr[row][col] == num*num-1){
            return true;
        }

        //kaam
        int i,j;
        //2up 1 right
        i=row-2;
        j=col+1;
        if(i>=0 && j<l )   {
                  arr[i][j]=num+1;
                  return path(arr, i, j, num+1);}
        //2up 1 left
        i=row-2;
        j=col-1;
        if(i>=0 && j>=0 ) {      arr[i][j]=num+1;
            return path(arr, i, j, num+1);}
        //2down 1 right
        i=row+2;
        j=col+1;
        if(i<l && j<l && arr[i][j]==num+1) return path(arr, i, j, num+1);
        //2down 1 left
        i=row+2;
        j=col-1;
        if(i<l && j>=0 )  {      arr[i][j]=num+1;
            return path(arr, i, j, num+1);}
        //2right 1 up
        i=row-1;
        j=col+2;
        if(i>=0 && j<l ) {
                  arr[i][j]=num+1;
                  return path(arr, i, j, num+1);}

         //2right 1 down
        i=row+1;
        j=col+2;
        if(i<l && j<l) {
             arr[i][j]=num+1;
            return path(arr, i, j, num+1);}

        //2left 1 up
        i=row-1;
        j=col-2;
        if(i>=0 && j>=0 ){
             arr[i][j]=num+1;
            return path(arr, i, j, num+1);
} 
        //2left 1 down
        i=row+1;
        j=col-2;
        if(i>=0 && j<l){
        arr[i][j]=num+1;
         return path(arr, i, j, num+1);
        }
        return false;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[5];
        // changeArray(arr, 0, 1);
        // printarray(arr);

        // --------------------------------------------------------------------------------------------------------
        // function to find sub strings
        // String str = "abc";
        // subStrings(str,"",0);

        // ----------------------------------------------------------------------------------------------------------
        // permitation in string
        // String str ="abc";
        // permutation(str,"");

        // ----------------------------------------------------------------------------------------------------------
        // N queens probleam
        // int n = 4;
        // char board[][] = new char[n][n];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // board[i][j] = '.';
        // }
        // }

        // // nQueens(board, 0);
        // System.out.println();
        // System.out.println("the number of ways n-queens sits in the board without
        // attacking each pther is = " + count);
        // System.out.println();

        // if(Queens(board, 0)){
        // System.out.println("the solution is possible");
        // printBoard(board);
        // }
        // else{
        // System.out.println("solution is not possible ");
        // }

        // ----------------------------------------------------------------------------------------------------------
        // GRID WAYS PROBLEAM.
        // int row=3, column=3;
        // System.out.println("No. of moves is = " + gridWays(0,0,row,column));
        // ----------------------------------------------------------------------------------------------------------
        // SUDOKU SOLVER.
        int sudoku[][] = { { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 } };

        if (sudokuSlover(sudoku, 0, 0)) {
            System.out.println("solution exist ");
            print(sudoku);
        } else {
            System.out.println("solution not exist ");
        }

        //---------------------------------------------------------------------------------------------------------------
        //classic mice maze probleam
        // int maze[][] = {{1,0,0,0},
        //                 {1,1,0,0},
        //                 {0,1,0,0},
        //                 {1,1,1,1}};
        // int n = maze.length;
        // int sol[][] = new int[n][n];

        // if(solvemaze(maze,0,0,n,sol)){
        //     print(sol);
        // }
        

        //-----------------------------------------------------------------------------------------------------------------
        //kings knight path probleam

    //     int n=8;
    //     int arr[][] = new int[n][n];

    //    if( path(arr,0,0,0))
    //    {
    //     print(arr);
    //    }




    }

}
