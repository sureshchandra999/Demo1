package com.Suresh6.CoreJAVA.STRING;

public class Client3 {
    public static void main(String[] args) {
        String s="ABCGAG";
        System.out.println(s);
        int countG=0;
        int countAG=0;
        // Count the number of 'G's in the string
        for(int i=s.length() -1; i<= 0; i--){
            char c = s.charAt(i);
            if(c == 'G'){
                countG++;
            } else if(c == 'A'){
                countAG = (countAG + countG) % 1000000007; // To avoid overflow, we take modulo 1000000007

            }


        }
       System.out.println("The number of AG pairs in the string is: " + countAG);
    }
}
