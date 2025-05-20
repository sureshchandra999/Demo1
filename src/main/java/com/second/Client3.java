package com.second;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Client3 {
    public static void main(String[] args) {
        char ch=' ';
        System.out.println("ASCII value of " + ch + " is: " + (int)ch);
        HashSet <Character> set = new HashSet<>();
        set.add('a');
        set.add('b');
        set.add('c');
        set.add('d');
        set.add('e');
        System.out.println("Size of HashSet is: " + set.size());
        System.out.println("HashSet is: " + set);
        String str = new String("Hello World");
        HashSet<String > setString = new HashSet<>();
        setString.add(str);
        System.out.println("Size of HashSet is: " + setString.size());
        System.out.println("HashSet is: " + setString);

    }
    //what is difference between HashSet and HashMap
    //HashSet is a collection of unique elements, while HashMap is a collection of key-value pairs.
    //HashSet is implemented using HashMap, where the keys are the elements of the set and the values are all set to a constant object.
    //HashSet does not allow duplicate elements, while HashMap allows duplicate values but not duplicate keys.
    //HashSet is faster than HashMap because it does not have to store key-value pairs.
    //HashSet is used to store unique elements, while HashMap is used to store key-value pairs.
    //HashSet is implemented using HashMap, while HashMap is implemented using a hash table.
    //HashSet is a part of the Java Collections Framework, while HashMap is a part of the Java Collections Framework.
    //HashSet is a collection of unique elements, while HashMap is a collection of key-value pairs.
    //what is time complexity of HashSet and HashMap
    //The time complexity of HashSet is O(1) for add, remove, and contains operations.
    //The time complexity of HashMap is O(1) for put, get, and remove operations.
    //The time complexity of HashSet is O(n) for iterating over the elements, while the time complexity of HashMap is O(n) for iterating over the key-value pairs.
    //The space complexity of HashSet is O(n), where n is the number of elements in the set.
    //The space complexity of HashMap is O(n), where n is the number of key-value pairs in the map.
    //HashSet internally uses a HashMap to store the elements, while HashMap uses a hash table to store the key-value pairs.

    //what is the internal implementation of HashSet
    //HashSet is implemented using a HashMap, where the keys are the elements of the set and the values are all set to a constant object.
    //The HashSet class implements the Set interface, which is a part of the Java Collections Framework.
    // The HashSet class is a collection that does not allow duplicate elements and is not ordered.
    // The HashSet class uses a hash table to store the elements, which allows for fast access and retrieval of elements.
    // The HashSet class is not synchronized, which means that it is not thread-safe and should not be used in a multi-threaded environment without proper synchronization.
    // The HashSet class is implemented using a hash table, which is an array of linked lists.
    // The hash table uses a hash function to map the elements to the array indices, which allows for fast access and retrieval of elements.

    ///what is the internal implementation of HashMap
    //HashMap is implemented using a hash table, which is an array of linked lists.
    // The hash table uses a hash function to map the keys to the array indices, which allows for fast access and retrieval of key-value pairs.
    // The HashMap class implements the Map interface, which is a part of the Java Collections Framework.
    // The HashMap class is a collection that allows for duplicate values but not duplicate keys.
    // The HashMap class is not synchronized, which means that it is not thread-safe and should not be used in a multi-threaded environment without proper synchronization.
    // The HashMap class is implemented using a hash table, which is an array of linked lists.
    // The hash table uses a hash function to map the keys to the array indices, which allows for fast access and retrieval of key-value pairs.
    // The HashMap class uses a load factor to determine when to resize the hash table, which allows for efficient use of memory.
    // The load factor is the ratio of the number of elements in the hash table to the size of the hash table.
    // The default load factor is 0.75, which means that the hash table will be resized when it is 75% full.
    // The HashMap class uses a threshold to determine when to resize the hash table, which allows for efficient use of memory.
    // The threshold is the product of the load factor and the size of the hash table.
    // The default threshold is 12, which means that the hash table will be resized when it is 12% full.
    // The HashMap class uses a hash function to map the keys to the array indices, which allows for fast access and retrieval of key-value pairs.
    // The hash function is used to convert the key into an integer value, which is then used to determine the index of the array where the key-value pair will be stored.
    // The hash function is used to convert the key into an integer value, which is then used to determine the index of the array where the key-value pair will be stored.
    // The hash function is used to convert the key into an integer value, which is then used to determine the index of the array where the key-value pair will be stored.

    //what is LinkedHashSet
    //LinkedHashSet is a collection that is similar to HashSet, but it maintains the order of the elements.
    // The LinkedHashSet class is a part of the Java Collections Framework and implements the Set interface.
    // The LinkedHashSet class is a collection that does not allow duplicate elements and maintains the order of the elements.
    // The LinkedHashSet class is implemented using a hash table and a linked list, which allows for fast access and retrieval of elements while maintaining the order of the elements.
    // The LinkedHashSet class is not synchronized, which means that it is not thread-safe and should not be used in a multi-threaded environment without proper synchronization.
    // The LinkedHashSet class is implemented using a hash table and a linked list, which allows for fast access and retrieval of elements while maintaining the order of the elements.
    // The LinkedHashSet class uses a load factor to determine when to resize the hash table, which allows for efficient use of memory.
    // The load factor is the ratio of the number of elements in the hash table to the size of the hash table.
    // The default load factor is 0.75, which means that the hash table will be resized when it is 75% full.
    // The LinkedHashSet class uses a threshold to determine when to resize the hash table, which allows for efficient use of memory.
    // The threshold is the product of the load factor and the size of the hash table.
    // The default threshold is 12, which means that the hash table will be resized when it is 12% full.

    //what is LinkedHashMap
    //LinkedHashMap is a collection that is similar to HashMap, but it maintains the order of the key-value pairs.
    // The LinkedHashMap class is a part of the Java Collections Framework and implements the Map interface.
    // The LinkedHashMap class is a collection that allows for duplicate values but not duplicate keys and maintains the order of the key-value pairs.
    // The LinkedHashMap class is implemented using a hash table and a linked list, which allows for fast access and retrieval of key-value pairs while maintaining the order of the key-value pairs.
    // The LinkedHashMap class is not synchronized, which means that it is not thread-safe and should not be used in a multi-threaded environment without proper synchronization.
    // The LinkedHashMap class is implemented using a hash table and a linked list, which allows for fast access and retrieval of key-value pairs while maintaining the order of the key-value pairs.
    // The LinkedHashMap class uses a load factor to determine when to resize the hash table, which allows for efficient use of memory.
    // The load factor is the ratio of the number of key-value pairs in the hash table to the size of the hash table.
    // The default load factor is 0.75, which means that the hash table will be resized when it is 75% full.
    // The LinkedHashMap class uses a threshold to determine when to resize the hash table, which allows for efficient use of memory.
    // The threshold is the product of the load factor and the size of the hash table.
    // The default threshold is 12, which means that the hash table will be resized when it is 12% full.
    // The LinkedHashMap class uses a hash function to map the keys to the array indices, which allows for fast access and retrieval of key-value pairs.
    // The hash function is used to convert the key into an integer value, which is then used to determine the index of the array where the key-value pair will be stored.
    // The hash function is used to convert the key into an integer value, which is then used to determine the index of the array where the key-value pair will be stored.
    // The hash function is used to convert the key into an integer value, which is then used to determine the index of the array where the key-value pair will be stored.

    //what is synchronized HashMap
    //Synchronized HashMap is a thread-safe version of HashMap, which means that it can be used in a multi-threaded environment without proper synchronization.
    // The Synchronized HashMap class is a part of the Java Collections Framework and implements the Map interface.
    // The Synchronized HashMap class is a collection that allows for duplicate values but not duplicate keys and is thread-safe.
    // The Synchronized HashMap class is implemented using a hash table, which allows for fast access and retrieval of key-value pairs.
    // The Synchronized HashMap class is synchronized, which means that it is thread-safe and can be used in a multi-threaded environment without proper synchronization.









}
