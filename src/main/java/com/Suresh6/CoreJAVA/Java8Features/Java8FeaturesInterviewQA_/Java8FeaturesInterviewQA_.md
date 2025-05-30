Java 8 features Interview Questions and Answers:
========================================================

1. What are the main features introduced in Java 8?
Java 8 introduced several key features, including:
- Lambda expressions
- Functional interfaces
- Method references
- Default methods in interfaces
- Streams API
- Optional class
- New Date and Time API
- Nashorn JavaScript engine
- Type annotations
- CompletableFuture for asynchronous programming
2. What is a lambda expression in Java 8?
A lambda expression is a concise way to represent an anonymous function (a function without a name) that can be passed around as if it were an object. It allows you to write instances of single-method interfaces (functional interfaces) in a more readable and less verbose manner. The syntax of a lambda expression is `(parameters) -> expression` or `(parameters) -> { statements; }`.
3. What is a functional interface?
A functional interface is an interface that contains exactly one abstract method. It can have multiple default or static methods, but only one abstract method. Functional interfaces can be used as the assignment target for lambda expressions and method references. Examples include `Runnable`, `Callable`, and custom interfaces like `MyFunctionalInterface`.
4. What is the Streams API in Java 8?
The Streams API is a new abstraction introduced in Java 8 that allows for functional-style operations on collections of objects. It provides a way to process sequences of elements (like lists or sets) in a declarative manner, enabling operations such as filtering, mapping, and reducing. Streams can be created from collections, arrays, or I/O channels and can be processed in parallel or sequentially.
5. How do you create a stream from a collection in Java 8?
You can create a stream from a collection using the `stream()` method. For example, if you have a `List<String>`, you can create a stream like this:

```java
List<String> list = Arrays.asList("a", "b", "c");
Stream<String> stream = list.stream();
```
6. What is the purpose of the `Optional` class in Java 8?
The `Optional` class is a container object that may or may not contain a non-null value. It is used to represent optionality and helps to avoid `NullPointerException` by providing methods to check for the presence of a value and to perform operations on the value if it is present. It encourages a more functional style of programming by providing methods like `isPresent()`, `ifPresent()`, `orElse()`, and `map()`.
7. What are default methods in interfaces?
Default methods in interfaces are methods that have a body and can be defined directly within the interface. They allow you to add new functionality to interfaces without breaking existing implementations. This feature enables backward compatibility and allows interfaces to evolve over time. Default methods are defined using the `default` keyword. For example:

```java
public interface MyInterface {
    default void myDefaultMethod() {
        System.out.println("This is a default method.");
    }
}
```
8. What is method reference in Java 8?
Method references are a shorthand notation of a lambda expression to call a method. They provide a way to refer to methods without executing them, making the code more concise and readable. Method references can be used in three forms:
- Reference to a static method: `ClassName::staticMethodName`
- Reference to an instance method of a particular object: `instance::instanceMethodName`
- Reference to an instance method of an arbitrary object of a particular type: `ClassName::instanceMethodName`
For example:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.forEach(System.out::println); // Method reference to println
```
9. What is the new Date and Time API in Java 8?
The new Date and Time API in Java 8, found in the `java.time` package, provides a comprehensive and flexible framework for handling date and time. It addresses many of the shortcomings of the old `java.util.Date` and `java.util.Calendar` classes. The new API includes classes like `LocalDate`, `LocalTime`, `LocalDateTime`, `ZonedDateTime`, and `Duration`, which allow for immutable date-time representations, better time zone handling, and more intuitive operations on dates and times.
10. How do you use the `CompletableFuture` class in Java 8?
The `CompletableFuture` class in Java 8 is part of the `java.util.concurrent` package and provides a way to write asynchronous, non-blocking code. It allows you to create a future that can be completed manually and provides methods for combining multiple futures, handling exceptions, and applying transformations. You can create a `CompletableFuture` using the `supplyAsync()` method to run a task asynchronously, and then use methods like `thenApply()`, `thenAccept()`, or `exceptionally()` to handle the result or any exceptions.
Here's an example of using `CompletableFuture`:

```java
CompletableFuture.supplyAsync(() -> {
    // Simulate a long-running task
    return "Hello, World!";
}).thenAccept(result -> {
    System.out.println(result); // Prints "Hello, World!"
}).exceptionally(ex -> {
    ex.printStackTrace();
    return null;
});
```
11. What is the difference between `Stream` and `Collection` in Java 8?
The main differences between `Stream` and `Collection` in Java 8 are:
- **Nature**: A `Collection` is a data structure that holds elements, while a `Stream` is a sequence of elements that can be processed in a functional style.
- **Mutability**: Collections are mutable and can be modified (elements can be added or removed), while Streams are immutable and do not modify the underlying data source.
- **Processing**: Streams support functional-style operations like filtering, mapping, and reducing, while Collections provide methods for iteration and manipulation.
- **Lazy Evaluation**: Streams are evaluated lazily, meaning that operations on a Stream are not executed until a terminal operation (like `collect()`, `forEach()`, or `reduce()`) is invoked. Collections, on the other hand, are eager and perform operations immediately.
12. How can you filter a list using streams in Java 8?
You can filter a list using streams in Java 8 by using the `filter()` method, which takes a predicate (a functional interface that returns a boolean) to determine which elements should be included in the resulting stream. Here's an example:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
List<String> filteredNames = names.stream()
    .filter(name -> name.startsWith("A")) // Filter names starting with 'A'
    .collect(Collectors.toList()); // Collect the results into a list
System.out.println(filteredNames); // Prints: [Alice]

```
13. What is the purpose of the `Collectors` utility class in Java 8?
The `Collectors` utility class in Java 8 provides a set of static methods that facilitate the accumulation of elements from a stream into various data structures, such as lists, sets, maps, or even concatenated strings. It is part of the `java.util.stream` package and is commonly used with the `collect()` terminal operation on streams. Some common collectors include:
- `Collectors.toList()`: Collects elements into a `List`.
- `Collectors.toSet()`: Collects elements into a `Set`.
- `Collectors.toMap()`: Collects elements into a `Map`.
- `Collectors.joining()`: Concatenates elements into a single `String`.
- `Collectors.groupingBy()`: Groups elements by a classifier function.
- `Collectors.partitioningBy()`: Partitions elements into two groups based on a predicate.
14. How do you sort a list using streams in Java 8?
You can sort a list using streams in Java 8 by using the `sorted()` method, which returns a stream with the elements sorted according to their natural order or according to a provided comparator. Here's an example of sorting a list of strings:

```java
List<String> names = Arrays.asList("Charlie", "Alice", "David", "Bob");
List<String> sortedNames = names.stream()
    .sorted() // Sorts in natural order
    .collect(Collectors.toList());
System.out.println(sortedNames); // Prints: [Alice, Bob, Charlie, David]
```
You can also sort using a custom comparator:

```java
List<String> names = Arrays.asList("Charlie", "Alice", "David", "Bob");
List<String> sortedNames = names.stream()
    .sorted(Comparator.reverseOrder()) // Sorts in reverse order
    .collect(Collectors.toList());
System.out.println(sortedNames); // Prints: [David, Charlie, Bob, Alice]
```
15. What is the difference between `map()` and `flatMap()` in Java 8 streams?

The difference between `map()` and `flatMap()` in Java 8 streams lies in how they handle the transformation of elements:
- **`map()`**: The `map()` method applies a function to each element of the stream and returns a new stream containing the results. It is used when you want to transform each element into another object. The resulting stream will have the same number of elements as the original stream.

  Example:
  ```java
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
  List<Integer> nameLengths = names.stream()
      .map(String::length) // Maps each name to its length
      .collect(Collectors.toList());
  System.out.println(nameLengths); // Prints: [5, 3, 7]
  ```
- **`flatMap()`**: The `flatMap()` method is used when the function applied to each element returns a stream (or another collection) instead of a single value. It flattens the resulting streams into a single stream, effectively merging them. This is useful when you have a one-to-many relationship and want to combine the results into a single stream.
    Example:
    ```java
    List<List<String>> listOfLists = Arrays.asList(
        Arrays.asList("Alice", "Bob"),
        Arrays.asList("Charlie", "David")
    );
    List<String> allNames = listOfLists.stream()
        .flatMap(List::stream) // Flattens the lists into a single stream
        .collect(Collectors.toList());
    System.out.println(allNames); // Prints: [Alice, Bob, Charlie, David]
    ```
16. How can you handle exceptions in a stream pipeline in Java 8?
Handling exceptions in a stream pipeline can be tricky since streams do not allow checked exceptions to be thrown directly. However, you can wrap the code that might throw an exception in a try-catch block or use a custom functional interface that allows for exceptions. Here’s an example of how to handle exceptions using a try-catch block within a stream:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
List<String> processedNames = names.stream()
    .map(name -> {
        try {
            // Simulate processing that might throw an exception
            if (name.equals("Charlie")) {
                throw new RuntimeException("Error processing " + name);
            }
            return name.toUpperCase(); // Transform the name to uppercase
        } catch (RuntimeException e) {
            System.err.println(e.getMessage()); // Handle the exception
            return null; // Return null or some default value
        }
    })
    .filter(Objects::nonNull) // Filter out null values
    .collect(Collectors.toList());
System.out.println(processedNames); // Prints: [ALICE, BOB, DAVID]
```
17. What is the purpose of the `forEach()` method in Java 8 streams?
The `forEach()` method in Java 8 streams is a terminal operation that allows you to iterate over each element of the stream and perform an action on it. It takes a `Consumer` functional interface as an argument, which defines the action to be performed on each element. The `forEach()` method is typically used for side effects, such as printing elements or updating external state.
Here's an example of using `forEach()` to print each element of a list:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
names.stream()
    .forEach(name -> System.out.println(name)); // Prints each name
```
18. How can you convert a stream back to a collection in Java 8?
You can convert a stream back to a collection in Java 8 using the `collect()` method along with one of the collectors provided by the `Collectors` utility class. The most common collectors for converting a stream to a collection are `Collectors.toList()`, `Collectors.toSet()`, and `Collectors.toMap()`. Here’s an example of converting a stream to a list:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
List<String> collectedNames = names.stream()
    .filter(name -> name.startsWith("A")) // Filter names starting with 'A'
    .collect(Collectors.toList()); // Collect the results into a list
System.out.println(collectedNames); // Prints: [Alice]
```
19. What is the difference between `findFirst()` and `findAny()` in Java 8 streams?
The difference between `findFirst()` and `findAny()` in Java 8 streams lies in their behavior regarding the order of elements and their intended use:
- **`findFirst()`**: This method returns the first element of the stream that matches the given criteria (if any). It is ordered and guarantees that the first element encountered in the stream will be returned. It is typically used when you need to retrieve a specific element based on its position in the stream.

  Example:
  ```java
  List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
  Optional<String> firstName = names.stream()
      .filter(name -> name.startsWith("A"))
      .findFirst(); // Finds the first name starting with 'A'
  System.out.println(firstName.orElse("No match")); // Prints: Alice
  ```
- **`findAny()`**: This method returns any element from the stream that matches the given criteria. It is not guaranteed to return the first element and is typically used in parallel streams where the order of elements does not matter. It can be more efficient in parallel processing scenarios since it does not require maintaining the order of elements.
    Example:
    ```java
    List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
    Optional<String> anyName = names.stream()
        .filter(name -> name.startsWith("A"))
        .findAny(); // Finds any name starting with 'A'
    System.out.println(anyName.orElse("No match")); // Prints: Alice
    ```
20. How can you create a parallel stream in Java 8?
You can create a parallel stream in Java 8 by using the `parallelStream()` method available on collections or by calling the `parallel()` method on an existing stream. A parallel stream allows for concurrent processing of elements, leveraging multiple threads to improve performance for large datasets. Here's how to create a parallel stream from a collection:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
List<String> parallelNames = names.parallelStream()
    .filter(name -> name.startsWith("A")) // Filter names starting with 'A'
    .collect(Collectors.toList()); // Collect the results into a list
System.out.println(parallelNames); // Prints: [Alice]
```
You can also convert an existing stream to a parallel stream using the `parallel()` method:

```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David");
List<String> parallelNames = names.stream()
    .parallel() // Convert to a parallel stream
    .filter(name -> name.startsWith("A")) // Filter names starting with 'A'
    .collect(Collectors.toList()); // Collect the results into a list
System.out.println(parallelNames); // Prints: [Alice]
```
21. What is the purpose of the `reduce()` method in Java 8 streams?
The `reduce()` method in Java 8 streams is a terminal operation that performs a reduction on the elements of the stream using an associative accumulation function. It combines the elements of the stream into a single result, which can be of a different type than the elements in the stream. The `reduce()` method takes two parameters: an identity value (the initial value) and a binary operator (a function that combines two values).
Here's an example of using the `reduce()` method to calculate the sum of a list of integers:

```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.stream()
    .reduce(0, (a, b) -> a + b); // Reduces the stream to the sum of its elements
System.out.println(sum); // Prints: 15
```
You can also use `reduce()` to concatenate strings:

```java
List<String> words = Arrays.asList("Hello", " ", "World", "!");
String concatenated = words.stream()
    .reduce("", (a, b) -> a + b); // Reduces the stream to a single concatenated string
System.out.println(concatenated); // Prints: Hello World!
```
22. How can you use the `peek()` method in Java 8 streams?
