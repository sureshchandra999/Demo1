package com.suresh1.TwoDArray;

public class Client4 {
    public static void main(String[] args) {

    }
    /*
     What is the formula for claculating number of submatrices in a 2d-dimensional array?

        The formula for calculating the number of submatrices in a 2D array of size m x n is:
        Number of submatrices = (m * (m + 1) / 2) * (n * (n + 1) / 2)

        where m is the number of rows and n is the number of columns in the 2D array.

        This formula is derived from the fact that for each row, you can choose a starting and ending row, and for each column, you can choose a starting and ending column. The total number of ways to choose two rows is m * (m + 1) / 2, and the total number of ways to choose two columns is n * (n + 1) / 2. Multiplying these two results gives the total number of submatrices.
    public static int countSubmatrices(int m, int n) {
        return (m * (m + 1) / 2) * (n * (n + 1) / 2);
    }
    public static int countSubmatrices(int[][] matrix) { //TC: O(1), SC: O(1)
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        return (m * (m + 1) / 2) * (n * (n + 1) / 2);
    }



     */
    /*
    formula for calculating the all the submatrices sum in 2D array
    The formula for calculating the sum of all submatrices in a 2D array is based on the contribution of each element to the submatrices that include it. For an element at position (i, j) in a 2D array of size n x m, the contribution to the sum of all submatrices can be calculated as follows:
    contribution[i][j] = A[i][j] * (i + 1) * (n - i) * (j + 1) * (m - j)
    where:
    - A[i][j] is the value of the element at position (i, j).
    - (i + 1) is the number of ways to choose the starting row of the submatrix that includes the element A[i][j].
    - (n - i) is the number of ways to choose the ending row of the submatrix that includes the element A[i][j].
    - (j + 1) is the number of ways to choose the starting column of the submatrix that includes the element A[i][j].
    - (m - j) is the number of ways to choose the ending column of the submatrix that includes the element A[i][j].
    public static long sumOfAllSubmatrices(int[][] matrix) { // Total TC: O(n * m), SC: O(1)
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int n = matrix.length;
        int m = matrix[0].length;
        long totalSum = 0;
        //Total TC: O(n * m), SC: O(1)
        for (int i = 0; i < n; i++) { //TC: O(n), SC: O(1)
            for (int j = 0; j < m; j++) { //TC: O(m), SC: O(1)
                long contribution = (long) matrix[i][j] * (i + 1) * (n - i) * (j + 1) * (m - j);
                totalSum += contribution;
            }
        }
        return totalSum;
    }


     */


}
