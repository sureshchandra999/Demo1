package com.suresh.OOPsConncepts.PassByValue_PassByReference;

public class MyObjectClient {

    public static void main(String[] args) {
        MyObject obj = new MyObject(10);
        modifyObject(obj);
        System.out.println("Object Data: " + obj.data); // Output: 20

        modifyObject1(obj);
        System.out.println("Object Data after calling the modifyObject1: " + obj.data); // Output: 20

        MyObject returnedObj= modifyObject2(obj);
        System.out.println("Object Data after calling the modifyObject2: " + returnedObj.data); // Output: 20


        //Reassigning Object References
        //Reassigning the object reference within a method does not affect the original reference.
        reassignObject(obj);
        System.out.println("Object Data after Reassigning Object References:::: " + obj.data); // Output: 10
    }

    public static void modifyObject(MyObject obj) {
        obj.data = 20; // Changes the state of the object that obj references
    }

    public static void modifyObject1(MyObject object1) {
        object1.data = 20; // Changes the state of the object that obj references
    }

    public static MyObject modifyObject2(MyObject object2) {
        object2.data = 30; // Changes the state of the object that obj references
        return object2;
    }


    public static void reassignObject(MyObject object3) {
        object3 = new MyObject(100); // This reassignment does not affect the original reference
    }
}
