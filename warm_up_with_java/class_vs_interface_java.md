# Class vs Interface in Java  
Core and Unique Differences (Short but Clear)

Now we will understand the core and unique differences between **class** and **interface** in Java.  
I will explain it clearly and concisely.

## 1️⃣ Constructor

### Class

A class has a constructor.  
When I create an object, the constructor is automatically called.

```java
class Car {
    Car() {
        System.out.println("Car created");
    }
}
```
So, I can initialize objects using constructors.

### Interface
An interface does not have a constructor.
Because I cannot create an object directly from an interface.

👉 This is the most fundamental difference.

## 2️⃣ Object Creation
### Class
I can directly create an object from a class.

`Car c = new Car();   // ✅`
### Interface
I cannot create an object directly from an interface.

`Vehicle v = new Vehicle(); // ❌`
But I can create an object using a class that implements the interface.

`Vehicle v = new Bus();  // ✅`
So, we should use implementing classes to create objects of interface type.

## 3️⃣ Method Type
### Class
A class can contain:
- Concrete methods (with body)
- Abstract methods (if it is an abstract class)

So, I can define full implementation inside a class.

### Interface
Before Java 8, all methods were abstract by default.
After Java 8, an interface can contain:
- Abstract methods
- Default methods
- Static methods

But generally, we use interfaces to define behavior, not full implementation.

## 4️⃣ Variable Type
### Class
A class can have instance variables.
Their values can be changed.

So, I can store state inside a class.

### Interface
All variables inside an interface are automatically:

`public static final`
That means they are constants.

I cannot define normal instance variables inside an interface.

## 5️⃣ Inheritance Rule
### Class
- A class can extend only one class.
- Java does not support multiple inheritance using classes.

### Interface
- A class can implement multiple interfaces.

`class Student implements A, B, C { }`
This is a powerful feature.
We should use interfaces when we need multiple behavior inheritance.

## 6️⃣ Access Modifier
### Class Methods
Methods in a class can be:
- public, private, protected, default.
- So, I have full control over access levels.

### Interface Methods
- By default, interface methods are public.
- From Java 9, private methods are allowed (for internal use).

- But normally, interface methods are public.

## 7️⃣ Purpose (Core Philosophy)
### Class
- A class represents a real object.
It contains:
- State (variables)
- Behavior (methods)
So, I can model real-world entities using classes.

### Interface
- An interface represents capability.
- It defines a contract.
- It tells what something can do, not what it is.

Example:
Bird → class
Flyable → interface
Not all birds can fly.
But the ones that can fly should implement Flyable.

🔥 The Most Core Difference
```
Class = Blueprint of an object
Interface = Blueprint of behavior
```

Class → "What it is"
Interface → "What it can do"