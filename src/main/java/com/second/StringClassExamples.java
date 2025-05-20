package com.second;

import java.lang.reflect.Array;
import java.util.ArrayList;



public class StringClassExamples {
    public static void main(String[] args) {
        //what is String class in java
        //String is a class in java which is used to create string objects
        //String is a final class in java which means it cannot be inherited
        //String is immutable in java which means once it is created it cannot be changed
        //String is a sequence of characters in java
        //String is a class in java which is used to create string objects
        //String is a final class in java which means it cannot be inherited
        //String is immutable in java which means once it is created it cannot be changed
        //Example of String class in java
        String str = "Hello World";
        System.out.println("String is: " + str);
        System.out.println("Length of string is: " + str.length());
        System.out.println("String in uppercase is: " + str.toUpperCase());
        System.out.println("String in lowercase is: " + str.toLowerCase());
        System.out.println("String in substring is: " + str.substring(0, 5));
        System.out.println("String in substring is: " + str.substring(6, 11));
        System.out.println("String in substring is: " + str.substring(6));
        System.out.println("String in substring is: " + str.substring(0, 5));

        //
        //Array in java
        //Array is a collection of similar type of data
        //Array is a fixed size collection of similar type of data
        //Array is a collection of similar type of data
        //Array data type is defined at the time of creation
        //Array collection is created in heap memory
        //Array are indexed from 0 to n-1
        /*Array arr = new Array(5);
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        System.out.println("Array is: " + arr);
        System.out.println("Length of array is: " + arr.length());*/
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Array is: " + intArray);
        System.out.println("Length of array is: " + intArray.length);

        String[] strArray = {"Hello", "World", "Java", "Programming"};
        System.out.println("String array is: " + strArray);
        System.out.println("Length of string array is: " + strArray.length);

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("Character array is: " + charArray);
        System.out.println("Length of character array is: " + charArray.length);

        long[] longArray = {1L, 2L, 3L, 4L, 5L};
        System.out.println("Long array is: " + longArray);
        System.out.println("Length of long array is: " + longArray.length);

        double[] doubleArray = {1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println("Double array is: " + doubleArray);
        System.out.println("Length of double array is: " + doubleArray.length);

        StringBuffer strBuffer = new StringBuffer("Hello");
        System.out.println("StringBuffer is: " + strBuffer);
        System.out.println("Length of StringBuffer is: " + strBuffer.length());
        strBuffer.append(" World");
        System.out.println("StringBuffer after append is: " + strBuffer);
        System.out.println("Length of StringBuffer after append is: " + strBuffer.length());
        strBuffer.insert(5, " Java");
        System.out.println("StringBuffer after insert is: " + strBuffer);
        System.out.println("Length of StringBuffer after insert is: " + strBuffer.length());

        StringBuffer strBuffer1 = new StringBuffer();
        strBuffer1.append("Hello");
        strBuffer1.append(" World");
        System.out.println("StringBuffer1 is: " + strBuffer1);
        System.out.println("Length of StringBuffer1 is: " + strBuffer1.length());
        strBuffer1.insert(5, " Java");
        System.out.println("StringBuffer1 after insert is: " + strBuffer1);
        System.out.println("Length of StringBuffer1 after insert is: " + strBuffer1.length());

        StringBuffer[] strBufferArray = new StringBuffer[5];
        strBufferArray[0] = new StringBuffer("Hello");
        strBufferArray[1] = new StringBuffer("World");
        strBufferArray[2] = new StringBuffer("Java");
        strBufferArray[3] = new StringBuffer("Programming");
        strBufferArray[4] = new StringBuffer("Language");
        System.out.println("StringBuffer array is: " + strBufferArray);
        System.out.println("Length of StringBuffer array is: " + strBufferArray.length);

        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Hello");
        strBuilder.append(" World");
        System.out.println("StringBuilder is: " + strBuilder);
        System.out.println("Length of StringBuilder is: " + strBuilder.length());
        strBuilder.insert(5, " Java");
        System.out.println("StringBuilder after insert is: " + strBuilder);
        System.out.println("Length of StringBuilder after insert is: " + strBuilder.length());

        StringBuilder strBuilder1 = new StringBuilder("Hello");
        System.out.println("StringBuilder1 is: " + strBuilder1);
        System.out.println("Length of StringBuilder1 is: " + strBuilder1.length());
        strBuilder1.append(" World");
        System.out.println("StringBuilder1 after append is: " + strBuilder1);
        System.out.println("Length of StringBuilder1 after append is: " + strBuilder1.length());
        strBuilder1.insert(5, " Java");
        System.out.println("StringBuilder1 after insert is: " + strBuilder1);
        System.out.println("Length of StringBuilder1 after insert is: " + strBuilder1.length());


        StringBuilder[] strBuilderArray = new StringBuilder[5];
        strBuilderArray[0] = new StringBuilder("Hello");
        strBuilderArray[1] = new StringBuilder("World");
        strBuilderArray[2] = new StringBuilder("Java");
        strBuilderArray[3] = new StringBuilder("Programming");
        strBuilderArray[4] = new StringBuilder("Language");
        System.out.println("StringBuilder array is: " + strBuilderArray);
        System.out.println("Length of StringBuilder array is: " + strBuilderArray.length);











    }
}
