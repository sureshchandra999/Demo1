
Creational design patterns:
Creational design patterns are design patterns that deal with object creation mechanisms, trying to create objects in a manner suitable to the situation. These patterns can be categorized into several types, each serving a specific purpose in software design. Below are some of the most commonly used creational design patterns along with their Java implementations.



1. Singleton Design Pattern:
=============================
Singleton is a design pattern that restricts the instantiation of a class to one single instance. This is useful when exactly one object is needed to coordinate actions across the system.

java
```java
public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // private constructor to prevent instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```


2. Factory Design Pattern:
=============================
Factory is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.
java
```java
public abstract class Animal {
    public abstract void speak();
}
public class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
public class Cat extends Animal {
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
public class AnimalFactory {
    public static Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("cat")) {
            return new Cat();
        }
        return null;
    }
}
```


3. Abstract Factory Design Pattern:
===========================================
Abstract Factory is a creational design pattern that provides an interface for creating families of related or dependent objects without specifying their concrete classes.
java
```java
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
public class WinFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
public class MacFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
public interface Button {
    void paint();
}
public interface Checkbox {
    void paint();
}
public class WinButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows button.");
    }
}
public class MacButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac button.");
    }
}
public class WinCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Windows checkbox.");
    }
}
public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a Mac checkbox.");
    }
}
```

4. Builder Design Pattern:
===========================================
Builder is a creational design pattern that allows constructing complex objects step by step. It separates the construction of a complex object from its representation, allowing the same construction process to create different representations.
java
```java
public class Car {
    private String engine;
    private String wheels;
    private String color;

    public static class Builder {
        private String engine;
        private String wheels;
        private String color;

        public Builder setEngine(String engine) {
            this.engine = engine;
            return this;
        }

        public Builder setWheels(String wheels) {
            this.wheels = wheels;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.engine = this.engine;
            car.wheels = this.wheels;
            car.color = this.color;
            return car;
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine='" + engine + '\'' +
                ", wheels='" + wheels + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
```
5. Prototype Design Pattern:
===========================================
Prototype is a creational design pattern that allows cloning of objects, even complex ones, without coupling to their specific classes. It is useful when the cost of creating a new instance of an object is more expensive than copying an existing one.
java
```java
public abstract class Prototype {
    public abstract Prototype clone();
}
public class ConcretePrototype extends Prototype {
    private String field;

    public ConcretePrototype(String field) {
        this.field = field;
    }

    @Override
    public Prototype clone() {
        return new ConcretePrototype(this.field);
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                "field='" + field + '\'' +
                '}';
    }
}
```

6. Object Pool Design Pattern:
===========================================
Object Pool is a creational design pattern that manages a set of reusable objects, allowing for efficient reuse of resources. It is particularly useful in scenarios where object creation is expensive and the same objects can be reused multiple times.
java
```java
import java.util.ArrayList;
import java.util.List;
public class ObjectPool<T> {
    private List<T> available = new ArrayList<>();
    private List<T> inUse = new ArrayList<>();

    public T borrowObject() {
        if (available.isEmpty()) {
            throw new RuntimeException("No objects available in the pool");
        }
        T obj = available.remove(available.size() - 1);
        inUse.add(obj);
        return obj;
    }

    public void returnObject(T obj) {
        inUse.remove(obj);
        available.add(obj);
    }

    public void addObject(T obj) {
        available.add(obj);
    }
}
```
```java
// Example usage
public class Main {
    public static void main(String[] args) {
        ObjectPool<ConcretePrototype> pool = new ObjectPool<>();
        pool.addObject(new ConcretePrototype("Object 1"));
        pool.addObject(new ConcretePrototype("Object 2"));

        ConcretePrototype obj1 = pool.borrowObject();
        System.out.println("Borrowed: " + obj1);

        pool.returnObject(obj1);
        System.out.println("Returned: " + obj1);
    }
}
```
