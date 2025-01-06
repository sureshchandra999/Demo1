package com.suresh.OOPsConncepts.PassByValue_PassByReference;

public class PrimitiveDataType {

    public static void main(String[] args) {
        int originalValue = 10;
        modifyPrimitive(originalValue);
        int resultInt=modifyPrimitive1(originalValue);
        System.out.println("Original Value: " + originalValue); // Output: 10
        System.out.println("Result Int value is:"+ resultInt);
    }

    public static void modifyPrimitive(int value) {
        value = 20;
    }

    public static int modifyPrimitive1(int value) {
        value = 20;
        return value;
    }
}
