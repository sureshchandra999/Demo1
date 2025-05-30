package com.Suresh6.CoreJAVA.ARRAY;

public class Client4 {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("2D Array length is:" + A.length);
        System.out.println("Original 2D Array:");
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();

        }
        /*for( int[] row : A) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }*/

        int[][] B ={
                {1 },
                {1, 2},
                {1,2,3},
                {2},
                {2,3},
                {2,3,4},
                {4}
        };

       System.out.println("2D Array B length is:" + B.length);
        System.out.println("Original 2D Array B:");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Using enhanced for loop to print 2D Array B:");
        for(int[] row : B) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        //iterate the 2D array B and store in another 2D array C
        int[][] C = new int[B.length][];
        for (int i = 0; i < B.length; i++) {
            C[i] = new int[B[i].length];
            for (int j = 0; j < B[i].length; j++) {
                C[i][j] = B[i][j];
            }
        }
        //Iteate the 1D array D and add all its subarrays to the 2D array E


        int[] D = {1, 2, 3, 4, 5};
        int[] [] allSubarrays = createAllSubArrays(D);
        System.out.println("All subarrays of the 1D array D:");
        for (int i = 0; i < allSubarrays.length; i++) {
            System.out.print("[");
            for (int j = 0; j < allSubarrays[i].length; j++) {
                System.out.print(allSubarrays[i][j] + " ");
            }
            System.out.print("]");
            System.out.println();
        }





    }
    //Iterate the 1D array D and add all its subarrays to the 2D array E
    static int[][] createAllSubArrays(int[] D) {
        int n = D.length;
        int totalSubArrays = (n * (n + 1)) / 2; // Total number of subarrays
        int[][] E = new int[totalSubArrays][]; // Array to hold all subarrays
        int index = 0; // Index to keep track of the current subarray
        // Loop to generate all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                E[index] = new int[end - start + 1]; // Create a new subarray
                for (int k = start; k <= end; k++) {
                    E[index][k - start] = D[k]; // Fill the subarray with elements from D
                }
                index++;
            }
        }
        return E;
    }


}
