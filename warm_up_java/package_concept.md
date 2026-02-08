# Java Packages Guide

## 1️⃣ What is a package in Java?

A package is a **namespace** that organizes a set of related classes and interfaces.

Think of it as a **folder** on your computer:

* Keeps your files organized.
* Helps avoid name conflicts between classes with the same name.

**Example:**

```
animals/
    Animal.java
    Hippo.java
    Dog.java
vehicles/
    Car.java
    Bike.java
```

Here, `animals` and `vehicles` are **packages**.

---

## 2️⃣ Why use packages?

**a) Organization:**

* Keeps related classes together.
* Makes large programs easier to manage.

**b) Avoid naming conflicts:**

* Two different developers might create a `Car` class.
* Using different packages avoids conflicts:

```
vehicles.Car
garage.Car
```

**c) Access control:**

* Control which classes are visible outside the package using `public`, `protected`, or default (package-private) access.

**d) Reusability:**

* Import packages into other programs easily.

---

## 3️⃣ How to create and use a package

**Step 1: Create a package**

```java
// In file Animal.java
package animals; // declare package at the top

public class Animal {
    public void makeSound() {
        System.out.println("Some animal sound");
    }
}
```

**Step 2: Use the package**

```java
// In file Main.java (outside the package)
import animals.Animal;  // import the class

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.makeSound();
    }
}
```

---

## 4️⃣ Package directory structure

When using packages, your **directory must match the package name**:

```
project/
    animals/
        Animal.java
    Main.java
```

**Compile from project root:**

```
javac animals/Animal.java Main.java
```

**Run:**

```
java Main
```

---

## 5️⃣ Importing packages

* **Single class import:**

```java
import animals.Animal;
```

* **All classes in package:**

```java
import animals.*;
```

* **Static import (for static members):**

```java
import static java.lang.Math.PI;
```

---

## 6️⃣ Built-in Java packages

Java comes with many built-in packages:

* `java.lang` → fundamental classes (String, Math, Object)
* `java.util` → collections, date/time, random numbers
* `java.io` → file I/O classes
* `javax.swing` → GUI classes

**Example:**

```java
import java.util.ArrayList;
ArrayList<String> list = new ArrayList<>();
```

---

## 7️⃣ Summary

| Feature   | Description                                                     |
| --------- | --------------------------------------------------------------- |
| Package   | A namespace for grouping related classes and interfaces         |
| Benefits  | Organization, avoid name conflicts, access control, reusability |
| Syntax    | `package packageName;` at top of file                           |
| Importing | `import packageName.ClassName;` or `import packageName.*;`      |

💡 **Tip:** Always use packages in larger projects. Even small projects benefit from grouping classes logically.
