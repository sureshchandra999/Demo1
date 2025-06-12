package com.suresh1.TwoDArray;

public class Client5 {
    public static void main(String[] args) {
        // Example usage of printMergedIntervals
        int [] start = {0, 1, 5, 6, 7, 8, 12};
        int [] end = {2, 4, 6, 8, 10, 9, 14};
        printMergedIntervals(start, end); // Output: [[0, 4], [5, 10], [12, 14]]
        System.out.println();
        System.out.println("------------------- Merging Intervals -------------------");

        // Example usage of printMergedIntervals
        int [] start1 = {0, 3, 5, 6, 7, 8, 12};
        int [] end1 = {2, 4, 6, 8, 10, 9, 14};
        printMergedIntervals(start1, end1); // Output: [[0, 2], [3, 4], [5, 10], [12, 14]]



    }
    /*
    Given a list of intervals, sorted w..r.t. start time, merge all overlapping intervals and return a list of non-overlapping intervals that cover all the intervals in the input.


     */
    public static int[][] mergeIntervals(int[][] intervals) { //TC: O(n log n), SC: O(n)
        if (intervals == null || intervals.length == 0) {
            return new int[0][0];
        }

        // Sort the intervals based on the start time
        java.util.Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        java.util.List<int[]> merged = new java.util.ArrayList<>();
        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            if (currentInterval[1] >= intervals[i][0]) {
                // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // Non-overlapping interval, add the current one to the result
                merged.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        // Add the last interval
        merged.add(currentInterval);

        return merged.toArray(new int[merged.size()][]);
    }


    /*
    Given  a list of intervals, sorted w.r.t. start time. merge all overlapping intervals and print the merged intervals.
    Example:
    start = [0, 1, 5, 6, 7, 8, 12]
    end =   [2, 4, 6, 8, 10, 9, 14]
    Output: [[0, 4], [5, 10], [12, 14]]

     */
    public static void printMergedIntervals(int[] start, int[] end) { //TC: O(n log n), SC: O(n)
       int S= start[0];
       int E = end[0];
       for(int i=1; i < start.length; i++) { //TC: O(n), SC: O(1)
           if(start[i] <= E) {
               // Overlapping intervals, merge them
               E = Math.max(E, end[i]);
           } else {
               // Non-overlapping interval, print the current one
               System.out.println("[" + S + ", " + E + "]");
               S = start[i];
               E = end[i];
           }
       }
         // Print the last interval
         System.out.println("[" + S + ", " + E + "]");


    }

    //

}
