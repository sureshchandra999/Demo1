package com.Suresh6.CoreJAVA.STRING;

public class UpdateString {
    public static void main(String[] args) {

        final String s= "abcd";
        char[] charsString = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder(s);


        System.out.println(stringBuilder);


        final String str="abcdefg";

        System.out.println(str.substring(0, str.length()-1));


    }
    //update the string by inserting a number after every char which will be the index of that char.
    //String s= "abz";
    //after update the string "abz" should be "a1b2z26".
    static String updateStringWithNumber(String s){
        char[] charString = s.toCharArray();
        for(int i=0; i< charString.length; i++){

        }
        return charString.toString();
    }
    static  String removeLastCharacterFromString(final String s){
        char[] charString = s.toCharArray();
        int length=charString.length;
        for(int i=0; i< length; i++ ){

        }
        return  charString.toString();

    }
}
