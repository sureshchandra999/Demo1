package com.Suresh6.CoreJAVA.STRING;

public class Client4 {
    public static void main(String[] args) {
        char ch= '9';
        ch= (char) (ch + 8);
        System.out.println("ch: " + ch); // Output: ch: A
        // Explanation: '9' is ASCII 57, adding 8 gives 65, which is ASCII for 'A'
        String str = "Hello World";
        String str2 = "Hello World";
        System.out.println("str == str2: " + (str == str2)); // Output: true
        System.out.println("str.equals(str2): " + str.equals(str2)); // Output: true
        // Explanation: Both str and str2 point to the same string literal in the string pool, hence == returns true.
String str3 = new String("Hello World");

        System.out.println("str == str3: " + (str == str3)); // Output: false
        System.out.println("str.equals(str3): " + str.equals(str3)); // Output: true
        // Explanation: str3 is a new String object, so it has a different reference than str, hence == returns false.
        // However, the content is the same, so equals() returns true.

        String str4 = "Hello" + " World";
        System.out.println("str == str4: " + (str == str4)); // Output: true
        // Explanation: str4 is also a string literal created at compile time, so it points to the same reference as str.
        String str5 = "Hello" + new String(" World");
        System.out.println("str == str5: " + (str == str5)); // Output: false
        // Explanation: str5 is a new String object created at runtime, so it has a different reference than str, hence == returns false.
        System.out.println("str.equals(str5): " + str.equals(str5)); // Output: true
        // Explanation: The content of str and str5 is the same, so equals() returns true.
        // Note: String literals are interned in Java, meaning that if two string literals have the same content, they will point to the same reference in the string pool.
        String str6 = "Hello World";
        System.out.println("str == str6: " + (str == str6)); // Output: true
        // Explanation: str6 is another string literal with the same content as str, so they point to the same reference in the string pool, hence == returns true.
        System.out.println("str.equals(str6): " + str.equals(str6)); // Output: true
        // Explanation: The content of str and str6 is the same, so equals() returns true.
        // Note: String comparison using == checks for reference equality, while equals() checks for content equality.
        // In summary, when comparing strings in Java, it is recommended to use equals() for content comparison and == for reference comparison.
        // Note: The above examples demonstrate the behavior of string literals and string objects in Java.
        // String literals are stored in the string pool, and if two literals have the same content, they will point to the same reference.
        // String objects created using the new keyword are stored in the heap memory and have a different reference than string literals.
        // Therefore, it is important to understand the difference between reference equality (using ==) and content equality (using equals()) when comparing strings in Java.

        
        char ch1 = (char)100;
        System.out.println("ch1: " + ch1); // Output: ch1: d
        // Explanation: 100 is the ASCII value for 'd', so casting it to char gives 'd'.

        char ch2 = (char)9000;
        System.out.println("ch2: " + ch2); // Output: ch2: Ƞ
        // Explanation: 9000 is beyond the standard ASCII range, so it maps to a character in the extended Unicode range.
        // Note: The output may vary based on the character encoding used by the console or environment.
        // In Java, characters are represented using the Unicode standard, which includes a wide range of characters beyond the basic ASCII set.
        // Note: The character 'Ƞ' is a valid Unicode character, but it may not be displayed correctly in all environments.
        // If you want to see the character representation of a specific Unicode code point, you can use the Character class methods.
        System.out.println("Character.isLetter(ch2): " + Character.isLetter(ch2)); // Output: true
        // Explanation: The isLetter() method checks if the character is a letter, and 'Ƞ' is a valid letter in the Unicode character set.
        System.out.println("Character.isDigit(ch2): " + Character.isDigit(ch2)); // Output: false
        // Explanation: The isDigit() method checks if the character is a digit, and 'Ƞ' is not a digit.
        System.out.println("Character.isWhitespace(ch2): " + Character.isWhitespace(ch2)); // Output: false
        // Explanation: The isWhitespace() method checks if the character is a whitespace character, and 'Ƞ' is not a whitespace character.
        // Note: The Character class provides various methods to check the properties of characters, such as isLetter(), isDigit(), isWhitespace(), etc.
        // In summary, characters in Java can be represented using their ASCII values or Unicode code points.
        // When casting an integer to a char, it maps to the corresponding character based on the Unicode standard.
        // Note: The output of character representations may vary based on the console or environment used.
        // Note: The above examples demonstrate the behavior of characters in Java.






    }
}
