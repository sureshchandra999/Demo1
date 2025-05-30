package com.Suresh6.CoreJAVA.ARRAY;
import java.util.stream.IntStream;
import java.util.Arrays;
public class FetchAllSubarrays {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4};
        System.out.println("original array is: ");
        for (int e : A) {
            System.out.print(e + " ");
        }
        System.out.println();
        printAllSubArrays(A);
        System.out.println("===================================");
        int[][] subArrays = printAllSubArrays1(A);
        System.out.println("Subarrays are: ");
        for (int[] subArray : subArrays) {
            System.out.print("[");
            for (int e : subArray) {
                System.out.print(e + " ");
            }
            System.out.print("]");
            System.out.println();
        }

    }
    /**
     * This method fetches all subarrays of a given array A.
     *
     * @param A The input array from which subarrays are to be fetched.
     * @return A 2D array containing all subarrays of A.
     */
    // Time Complexity: O(N^3), where N is the length of the input array A.
    // Space Complexity: O(N^2), where N is the length of the input array A, for storing all subarrays.
    // The method iterates through all possible starting and ending indices to create subarrays.
    // It uses a nested loop to generate all subarrays, and for each subarray, it creates a new array to store the elements.


    static int[][] fetchAllSubArrays(int[] A){
        int n= A.length;
        int totalSubArrays = (n * (n + 1)) / 2; // Total number of subarrays
        int[][] subArrays = new int[totalSubArrays][]; // Array to hold all subarrays
        int index = 0; // Index to keep track of the current subarray
        // Loop to generate all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Create a subarray from start to end
                int[] subArray = new int[end - start + 1];
                for (int k = start; k <= end; k++) {
                    subArray[k - start] = A[k];
                }
                // Store the subarray in the result array
                subArrays[index++] = subArray;
            }
        }
        return subArrays;
    }
    // Optimized version of the above method
    // Time Complexity: O(N^2), where N is the length of the input array A.
    // Space Complexity: O(N^2), where N is the length of the input array A, for storing all subarrays.
    // The method uses System.arraycopy to copy elements from the original array to the subarray, which is more efficient than manually copying elements in a loop.
    // This optimization reduces the overhead of creating subarrays and copying elements, making the code cleaner and potentially faster.
    // The method iterates through all possible starting and ending indices to create subarrays.
    // It uses a nested loop to generate all subarrays, and for each subarray, it uses System.arraycopy to copy the elements from the original array to the new subarray.
    //    // This approach is more efficient than manually copying elements in a loop, as it reduces the overhead of creating subarrays and copying elements.
    // Total Time Complexity: O(N^2), where N is the length of the input array A.
    // Total Space Complexity: O(N^2), where N is the length of the input array A, for storing all subarrays.

    static int[][] fetchAllSubArraysOptimized(int[] A) {
        int n = A.length;
        int totalSubArrays = (n * (n + 1)) / 2; // Total number of subarrays
        int[][] subArrays = new int[totalSubArrays][]; // Array to hold all subarrays
        int index = 0; // Index to keep track of the current subarray
        // Loop to generate all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Create a subarray from start to end
                int[] subArray = new int[end - start + 1];
                System.arraycopy(A, start, subArray, 0, end - start + 1);
                // Store the subarray in the result array
                subArrays[index++] = subArray;
            }
        }
        return subArrays;
    }
    //
    /*static int[][] fetchAllSubArraysUsingStreams(int[] A) {
        // This method uses Java Streams to fetch all subarrays of a given array A.
        // It generates a stream of indices and maps them to subarrays using the IntStream.range method.
        return java.util.stream.IntStream.range(0, A.length)
                .flatMap(start -> java.util.stream.IntStream.range(start, A.length)
                        .map(end -> java.util.Arrays.copyOfRange(A, start, end + 1)))
                .toArray(int[][]::new);
    }*/

    //print all subarrays in an array
    //TC: O(N^3), where N is the length of the input array A.
    //SC: O(1), as we are not using any additional space to store the subarrays.

    static void printAllSubArrays(int[] A){
        int n= A.length;
        int nofSubArrays = (n * (n + 1)) / 2; // Total number of subarrays
        int[][] subArrays = new int[nofSubArrays][]; // Array to hold all subarrays
        int index = 0; // Index to keep track of the current subarray


        for(int i=0; i<n; i++){
            for(int j=i; j<n;j++){
                System.out.print("[");
                for(int k=i; k<=j;k++){
                    System.out.print(A[k] + " ");
                    subArrays[i][k] = A[k]; // Store the subarray in the result array


                }
                System.out.print("]");
                System.out.println();
            }

        }

    }

    //
    static int[][] printAllSubArrays1(int[] A){
        int n= A.length;
        int nofSubArrays = (n * (n + 1)) / 2; // Total number of subarrays
        int[][] subArrays = new int[nofSubArrays][]; // Array to hold all subarrays
        int index = 0; // Index to keep track of the current subarray


        for(int i=0; i<n; i++){
            for(int j=i; j<n;j++){
                System.out.print("[");
                for(int k=i; k<=j;k++){
                    System.out.print(A[k] + " ");
                    subArrays[i][index] = A[k]; // Store the subarray in the result array


                }
                System.out.print("]");
                System.out.println();
            }

        }
        return subArrays;

    }

    //create all subarrays of an array and store them in a 2D array and return the 2D array
    static int[][] createAllSubArrays(int[] A) {
        int n = A.length;
        int totalSubArrays = (n * (n + 1)) / 2; // Total number of subarrays
        int[][] subArrays = new int[totalSubArrays][]; // Array to hold all subarrays
        int index = 0; // Index to keep track of the current subarray
        // Loop to generate all subarrays
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {
                // Create a subarray from start to end
                int[] subArray = new int[end - start + 1];
                System.arraycopy(A, start, subArray, 0, end - start + 1);
                // Store the subarray in the result array
                subArrays[index++] = subArray;
            }
        }
        return subArrays;
    }



}
