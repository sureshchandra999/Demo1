package com.suresh1.TwoDArray;

public class Client3 {
    public static void main(String[] args) {

    }
    //Desabool's algorithm to find the maximum sum subarray in a 2D array
    public static int maxSumSubarray(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];

            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }

                // Find the maximum sum subarray in temp
                maxSum = Math.max(maxSum, kadane(temp));
            }
        }

        return maxSum;
    }
    private static int kadane(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int num : arr) {
            maxEndingHere += num;
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }
    // Function to find the maximum sum submatrix in a 2D array
    public static int maxSumSubmatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];

            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }

                // Find the maximum sum subarray in temp
                maxSum = Math.max(maxSum, kadane(temp));
            }
        }

        return maxSum;
    }
    // Function to find the maximum sum submatrix in a 2D array using Kadane's algorithm
    public static int maxSumSubmatrixKadane(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];

            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }

                // Find the maximum sum subarray in temp
                maxSum = Math.max(maxSum, kadane(temp));
            }
        }

        return maxSum;
    }
    // Function to find the maximum sum submatrix in a 2D array using Kadane's algorithm
    public static int maxSumSubmatrixKadane2(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int maxSum = Integer.MIN_VALUE;
        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int left = 0; left < cols; left++) {
            int[] temp = new int[rows];

            for (int right = left; right < cols; right++) {
                for (int i = 0; i < rows; i++) {
                    temp[i] += matrix[i][right];
                }

                // Find the maximum sum subarray in temp
                maxSum = Math.max(maxSum, kadane(temp));
            }
        }

        return maxSum;
    }
    //How many submatrices are there in a 2D array
    public static int countSubmatrices(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Iterate through all possible top-left corners
        for (int startRow = 0; startRow < rows; startRow++) {
            for (int startCol = 0; startCol < cols; startCol++) {
                // Iterate through all possible bottom-right corners
                for (int endRow = startRow; endRow < rows; endRow++) {
                    for (int endCol = startCol; endCol < cols; endCol++) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
    // Function to find the number of submatrices in a 2D array
    public static int countSubmatrices2(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Iterate through all possible top-left corners
        for (int startRow = 0; startRow < rows; startRow++) {
            for (int startCol = 0; startCol < cols; startCol++) {
                // Iterate through all possible bottom-right corners
                for (int endRow = startRow; endRow < rows; endRow++) {
                    for (int endCol = startCol; endCol < cols; endCol++) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
    // In how many submatrices does a given element appear in a 2D array
    public static int countSubmatricesWithElement(int[][] matrix, int element) { //TC: O(n^4), SC: O(1)
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Iterate through all possible top-left corners
        for (int startRow = 0; startRow < rows; startRow++) {
            for (int startCol = 0; startCol < cols; startCol++) {
                // Iterate through all possible bottom-right corners
                for (int endRow = startRow; endRow < rows; endRow++) {
                    for (int endCol = startCol; endCol < cols; endCol++) {
                        // Check if the element is in the current submatrix
                        for (int i = startRow; i <= endRow; i++) {
                            for (int j = startCol; j <= endCol; j++) {
                                if (matrix[i][j] == element) {
                                    count++;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }

        return count;
    }
    /* Function to find the number of submatrices containing a given element in a 2D array

    Optimeized approach:
    with the optimized approach, we can reduce the time complexity to O(n^2) by using a prefix sum array.
    This approach involves calculating the prefix sum of the matrix and then using it to count the number of submatrices containing the given element.
    This way, we can avoid the nested loops for checking each submatrix.
    TC: O(n^2), SC: O(n^2)


     */
    public static int countSubmatricesWithElementOptimized(int[][] matrix, int element) { //TC: O(n^2), SC: O(n^2)
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }

        int count = 0;
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Create a prefix sum array
        int[][] prefixSum = new int[rows + 1][cols + 1];

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                prefixSum[i][j] = matrix[i - 1][j - 1] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }

        // Iterate through all possible top-left corners
        for (int startRow = 0; startRow < rows; startRow++) {
            for (int startCol = 0; startCol < cols; startCol++) {
                // Iterate through all possible bottom-right corners
                for (int endRow = startRow; endRow < rows; endRow++) {
                    for (int endCol = startCol; endCol < cols; endCol++) {
                        // Check if the element is in the current submatrix using prefix sum
                        int sum = prefixSum[endRow + 1][endCol + 1] - prefixSum[startRow][endCol + 1] - prefixSum[endRow + 1][startCol] + prefixSum[startRow][startCol];
                        if (sum == element) {
                            count++;
                        }
                    }
                }
            }
        }

        return count;
    }


}
