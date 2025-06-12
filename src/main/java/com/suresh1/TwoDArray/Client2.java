package com.suresh1.TwoDArray;

import java.util.Arrays;

public class Client2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][4];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[0][2] = 3;
        arr[0][3] = 4;
        arr[1][0] = 5;
        arr[1][1] = 6;
        arr[1][2] = 7;
        arr[1][3] = 0;
        arr[2][0] = 9;
        arr[2][1] = 2;
        arr[2][2] = 0;
        arr[2][3] = 4;

        System.out.println("Printing 2D array");
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Printing 2D array using enhanced for loop");
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        make2DArrayToSwap(arr);
        System.out.println("Printing 2D array using enhanced for loop After Swap:");
        for (int[] row : arr) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }

    }
    /*
    Given 2D array, make all elements in row and column zero if a[i][j]=0;
    Hints: All vales are >=0.
    TC: O(N*M), SC: O(1)

    [1, 2, 3, 4
     5, 6, 7, 0
     9, 2, 0, 4]

     =>
     [1, 2, 0, 0
      0, 0, 0, 0
      0, 0, 0, 0]

Approach:1
===========
->For each zero , replace all row & col with -1.
-> Finally convert all -1 to 0.

     */

    static void make2DArrayToSwap(int[][] A){
        int n= A.length;
        int m=A[0].length;
        for(int i=0; i<n; i++){
            int flag=0;
            for(int j=0; j<m; j++){
                if(A[i][j] ==0){
                    flag=1;
                    break;
                }
            }
            if(flag==1){
                for(int j=0; j<m; j++){
                    if(A[i][j] !=0){
                        A[i][j]=-1;
                    }
                }
            }
            for(int j=0;j<m; j++){
                int flag1=0;
                for(int i1=0; i1<n; i1++){
                    if(A[i1][j] ==0){
                        flag1=1;
                        break;
                    }
                }
                if(flag1 == 1){
                    for(int i2=0; i<n; i2++){
                        if(A[i2][j] !=0){
                            A[i][j]=-1;
                        }
                    }
                }

                for(int i3=0; i3<n; i3++){
                    for(int j3=0; j3<m; j3++){
                        if(A[i3][j3] ==-1){
                            A[i3][j3]=0;
                        }
                    }
                }



            }

        }
    }


}
