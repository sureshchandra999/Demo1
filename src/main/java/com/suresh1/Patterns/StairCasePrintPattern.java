package com.suresh1.Patterns;

/*

if N= 5, then the pattern is:
* * * * *
_ * * * *
_ _ * * *
_ _ _ * *
_ _ _ _ *

If N= 4, then the pattern is:
* * * *
_ * * *
_ _ * *
_ _ _ *

If N= 3, then the pattern is:
* * *
_ * *
_ _ *

 */


import java.util.Scanner;

public class StairCasePrintPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("The pattern is:: ");
        for(int row = 1; row <= N; row++) {
            for(int space = 1; space < row; space++){
                System.out.print("_ ");
            }
            for(int star = 1; star <= (N-row+1); star++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
