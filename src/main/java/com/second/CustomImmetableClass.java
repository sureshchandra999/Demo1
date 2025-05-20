package com.second;

//create custom immutable class

public class CustomImmetableClass {
    private final String name;
    private final int age;

    public CustomImmetableClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "CustomImmetableClass{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    // Override equals() and hashCode() methods for proper comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CustomImmetableClass)) return false;
        CustomImmetableClass that = (CustomImmetableClass) o;
        return age == that.age && name.equals(that.name);
    }
    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }
    // No setters are provided, making this class immutable
    // Any method that modifies the state of the object would return a new instance instead
    public CustomImmetableClass withName(String name) {
        return new CustomImmetableClass(name, this.age);
    }
    public CustomImmetableClass withAge(int age) {
        return new CustomImmetableClass(this.name, age);
    }
    public CustomImmetableClass withNameAndAge(String name, int age) {
        return new CustomImmetableClass(name, age);
    }
    // Example of using the immutable class
    public static void main(String[] args) {
        CustomImmetableClass person = new CustomImmetableClass("John", 30);
        System.out.println(person);
        // Attempting to modify the object will create a new instance
        CustomImmetableClass modifiedPerson = person.withName("Doe");
        System.out.println(modifiedPerson);
        System.out.println(person); // Original object remains unchanged
    }
    // Example of using the immutable class
    public static void main1(String[] args) {
        CustomImmetableClass person = new CustomImmetableClass("John", 30);
        System.out.println(person);
        // Attempting to modify the object will create a new instance
        CustomImmetableClass modifiedPerson = person.withName("Doe");
        System.out.println(modifiedPerson);
        System.out.println(person); // Original object remains unchanged
    }
    public static void main2(String[] args) {
        CustomImmetableClass person = new CustomImmetableClass("John", 30);
        System.out.println(person);
        // Attempting to modify the object will create a new instance
        CustomImmetableClass modifiedPerson = person.withName("Doe");
        System.out.println(modifiedPerson);
        System.out.println(person); // Original object remains unchanged
    }
    //

}
