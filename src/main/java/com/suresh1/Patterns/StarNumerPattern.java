package com.suresh1.Patterns;

import java.util.Scanner;

public class StarNumerPattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int Num = scanner.nextInt();
        System.out.println("The pattern is:: ");

        for(int row = 1; row <= 5; row++){
            for(int col = 1; col <= row; col++){
                if(col % 2 == 0){
                    System.out.print(col);
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
