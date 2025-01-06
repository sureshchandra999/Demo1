package com.suresh.OOPsConncepts.AccessModifiersExamples;

public class ProtectedClass {
    protected int protectedField=199;

    protected void protectedMethod() {
        // Accessible within the same package and by subclasses
        System.out.println("This is protectedMethod() inside the ProtectedClass");
    }
}
