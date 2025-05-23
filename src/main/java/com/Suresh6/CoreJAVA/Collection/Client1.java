package com.Suresh6.CoreJAVA.Collection;

import java.util.HashSet;

public class Client1 {
    //HashSet is a collection that does not maintain any order of elements.
    //It is used to store unique elements, meaning it does not allow duplicate values.
    //HashSet is part of the Java Collections Framework and implements the Set interface.
    //It is implemented using a hash table, which allows for fast retrieval of elements.
    //HashSet is not synchronized, meaning it is not thread-safe. If multiple threads access a HashSet concurrently,

    //it must be synchronized externally to avoid data inconsistency.
    //HashSet allows null values, but only one null value can be stored in the set.

    //HashSet is not guaranteed to maintain the order of elements, so the order in which elements are retrieved may differ from the order in which they were added.
    //HashSet is generally faster than other collection types, such as ArrayList or LinkedList, for operations like add, remove, and contains.
    //HashSet is a good choice when you need to store a large number of unique elements and do not require any specific order.
    //HashSet is a part of the Java Collections Framework and implements the Set interface.
    //It is implemented using a hash table, which allows for fast retrieval of elements.
    //HashSet is not synchronized, meaning it is not thread-safe. If multiple threads access a HashSet concurrently,
    //it must be synchronized externally to avoid data inconsistency.
    //HashSet allows null values, but only one null value can be stored in the set.
    //HashSet is not guaranteed to maintain the order of elements, so the order in which elements are retrieved may differ from the order in which they were added.

  //Time complexity of HashSet operations:
    //add, remove, and contains: O(1) on average
    //Iteration: O(n)
    //Memory/Space complexity: O(n)
    //HashSet is generally faster than other collection types, such as ArrayList or LinkedList, for operations like add, remove, and contains.
    //HashSet is a good choice when you need to store a large number of unique elements and do not require any specific order.

    public static void main(String[] args) {
        HashSet<String> stringHashSet = new HashSet<>();
        stringHashSet.add("Apple");
        stringHashSet.add("Banana");
        stringHashSet.add("Orange");
        stringHashSet.add("Mango");
        stringHashSet.add("Apple"); // Duplicate value, will not be added
        stringHashSet.add(null); // Adding null value
        HashSet<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(1);
        integerHashSet.add(2);
        integerHashSet.add(3);
        integerHashSet.add(4);
        integerHashSet.add(null); // Adding null value
        integerHashSet.add(5);
        System.out.println("String HashSet: " + stringHashSet);
        System.out.println("Integer HashSet: " + integerHashSet);
        for(String fruit : stringHashSet) {
            System.out.println("Fruit: " + fruit);
        }
        for(Integer number : integerHashSet) {
            System.out.println("Number: " + number);
        }
    }


}
