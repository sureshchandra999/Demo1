package com.suresh1.TwoDArray;

public class Client1 {
    public static void main(String[] args) {
        int[][] A = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 10}, // Note: This row has 4 elements, making it a jagged array
            {11, 12} // Another row with 2 elements
        };
        System.out.println("size:"+ A.length);
        System.out.println("A[0].length:"+ A[0].length);
        System.out.println("A[1].length:"+ A[1].length);
        System.out.println("A[2].length:"+ A[2].length);
        System.out.println("A[3].length:"+ A[3].length);
        System.out.println("A[0][0]:"+ A[0][0]);
        System.out.println("A[0][1]:"+ A[0][1]);
        System.out.println("A[0][2]:"+ A[0][2]);
        System.out.println("A[1][0]:"+ A[1][0]);
        System.out.println("===========================================================");
        System.out.println("Sum of each row in the 2D array:");
        int[] rowSums = rowSum(A);
        for (int i = 0; i < rowSums.length; i++) {
            System.out.println("Row " + i + " sum: " + rowSums[i]);
        }
        System.out.println("===========================================================");
        System.out.println("Sum of each column in the 2D array:");
        int[] colSums = columnSum(A);
        for (int i = 0; i < colSums.length; i++) {
            System.out.println("Column " + i + " sum: " + colSums[i]);
        }



    }
    static int[] rowSum(int[][] A){// //TC: O(m*n), SC: O(m) where m is the number of rows and n is the maximum number of columns in any row.
        //TC: O(m*n) because we are iterating through each element of the 2D array, where m is the number of rows and n is the number of columns.
        //SC: O(m) because we are using an additional array of size m to store the row sums.

        int[] res = new int[A.length];
        for(int i=0; i<A.length; i++){
            int sum=0;
            for(int j=0; j<A[i].length; j++){
                sum += A[i][j];
            }
            res[i] = sum;

        }
        return res;
    }


//

    static int[] columnSum(int[][] A){ // //TC: O(m*n), SC: O(n) where m is the number of rows and n is the number of columns.
        //TC: O(m*n) because we are iterating through each element of the 2D array, where m is the number of rows and n is the number of columns.
        //SC: O(n) because we are using an additional array of size n to store the column sums.
        if (A.length == 0 || A[0].length == 0) {
            return new int[0]; // Return an empty array if the input is empty
        }

        int[] res = new int[A[0].length];
        for(int i=0; i<A[i].length; i++){
            int sum=0;
            for(int j=0; j< A.length-1; j++){
                sum += A[i][j];

            }
            res[i] = sum;
        }
        return res;

    }

}
