package com.arrays.medium;

import java.util.Scanner;

public class FindIsland {

    public static int numIslands(int[][] grid){

     int rows = grid.length;
     int cols = 0;
     if(rows == 0){
         return 0;
     }
     if(grid[0]!=null){
         cols = grid[0].length;
     }
     int no_of_islands= 0;
     for ( int i =0; i< rows ; i++){
         for(int j =0 ;j< cols ; j++ ){

             if(grid[i][j] == 1){
                 mark_current_island(grid, i , j ,rows, cols);
                 no_of_islands +=1;
             }
         }
     }
   return no_of_islands;

    }

    static  void mark_current_island( int[][] matrix , int x , int y , int rows , int cols){
        if(x < 0 || y< 0 || x >=rows || y >= cols ||  matrix[x][y]!=1){
            return;
        }
        matrix[x][y] = 2;
        mark_current_island(matrix, x+1,y , rows ,cols);
        mark_current_island(matrix, x,y+1 , rows ,cols);
        mark_current_island(matrix, x-1,y , rows ,cols);
        mark_current_island(matrix, x,y-1 , rows ,cols);

    }

    public static int[][] readMatrixByUser()
    {
        int m, n, i, j;
        Scanner in = null;
        int first[][] = new int[0][];
        try {
            in = new Scanner(System.in);
            System.out.println("Enter the number "
                    + "of rows of the matrix");
            m = in.nextInt();
            System.out.println("Enter the number "
                    + "of columns of the matrix");
            n = in.nextInt();

            // Declare the matrix
             first= new int[m][n];

            // Read the matrix values
            System.out.println("Enter the elements of the matrix");
            for (i = 0; i < m; i++)
                for (j = 0; j < n; j++)
                    first[i][j] = in.nextInt();

            // Display the elements of the matrix
            System.out.println("Elements of the matrix are");
            for (i = 0; i < m; i++) {
                for (j = 0; j < n; j++)
                    System.out.print(first[i][j] + "  ");
                System.out.println();
            }


        }
        catch (Exception e) {
        }
        finally {
            in.close();
        }
        return  first;
    }

    public static void main(String[] args) {
        int[][] result = readMatrixByUser();
        System.out.println(numIslands(result));
    }
}
