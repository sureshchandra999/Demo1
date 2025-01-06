package com.suresh.OOPsConncepts.Examples;

import com.suresh.OOPsConncepts.AccessModifiersExamples.ProtectedClass;

public class ProtectedClientDemo1 extends ProtectedClass {

    int abc=100;
    public static void main(String[] args) {

        ProtectedClientDemo1 protectedClientDemo1 = new ProtectedClientDemo1();
        System.out.println(protectedClientDemo1.abc);
        System.out.println(protectedClientDemo1.protectedField);
        protectedClientDemo1.protectedMethod();

    }

}
