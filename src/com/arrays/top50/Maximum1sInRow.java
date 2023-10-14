package com.arrays.top50;
/*
Find the row with maximum number of 1s
Given a boolean 2D array, where each row is sorted. Find the row with the maximum number of 1s.

Example:

Input matrix : 0 1 1 1
                        0 0 1 1
                        1 1 1 1  // this row has maximum 1s
                        0 0 0 0
Output: row no :2
https://www.youtube.com/watch?v=cWKLH1BDsIg

Time Complexity: O(m log n) where m is the number of rows and n is the number of columns in the matrix.
Auxiliary Space:  O(log n), as implicit stack is created due to recursion.
 */
public class Maximum1sInRow {
    public static void main(String[] args) {
        int mat[][] = { {0, 0, 0, 1},
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {0, 0, 0, 0}};
        System.out.print("Index of row with maximum 1s is " + rowWithMax1s(mat));
    }

    private static int rowWithMax1s(int[][] mat) {
        int row=0;//initially no row
        int overallMaxCount=0;
        int max1sCount=0;
        for(int i=0;i<mat.length;i++){
            overallMaxCount = binarySearch(mat,i);
                if(max1sCount > overallMaxCount){
                    overallMaxCount=max1sCount;
                    row=i;
                }
        }
        return row;

    }
    private static int binarySearch(int mat[][],int row){
        int low = 0;
        int high = mat.length-1;
        int countOf1 = mat.length;
        int mid=(low+high)/2;
        while(low<=high){
            if(mat[row][mid] ==1){// there might be other elements on to ur left. This might not be your 1st 1.
                countOf1=mid;
                high=mid-1;
            }
            else {
                low=mid+1; // no point og going left side . it will be all 0. since its sorted. Move to right side.
            }
        }
        return mat.length-countOf1;

    }
}
