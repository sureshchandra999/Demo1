package com.Suresh6.CoreJAVA.STRING;

public class Client5 {
    public static void main(String[] args) {
        char [] s1 = {'A', 'n', 'a', 'C', 'o', 'n', 'D', 'a'};
        System.out.println("Original String: " + new String(s1));
        toggle(s1);
        System.out.println("Toggled String: " + new String(s1));

        System.out.println("===========================================================");

        char [] s2 = {'c', 'o', 'M', 'p', 'u', 'T', 'e', 'R'};
        System.out.println("Original String: " + new String(s2));
        toggle1(s2);
        System.out.println("Toggled String: " + new String(s2));


        System.out.println("===========================================================");



        char[] s = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        System.out.println("Original String: " + new String(s));
        toggle(s);
        System.out.println("Toggled String: " + new String(s));

    }
    static void toggle( char[] s){// //TC: O(n), SC: O(1) where n is the length of the string



        for(int i=0; i<s.length; i++) {
            if(s[i] >=65 && s[i] <=90){
                s[i] += 32; // Convert uppercase to lowercase
            } else{
                s[i] -= 32; // Convert lowercase to uppercase
            }
        }
    }

    static void toggle1(char s[]){// //TC: O(n), SC: O(1) where n is the length of the string


        for(int i=0; i<s.length; i++) {
            if(s[i] >= 'A' && s[i] <='Z'){
                s[i] += ('a' - 'A'); // Convert uppercase to lowercase
            } else{
                s[i] -= ('a' - 'A'); // Convert lowercase to uppercase
            }
        }
        //System.out.println("Toggled String: " + new String(s));
    }
}
