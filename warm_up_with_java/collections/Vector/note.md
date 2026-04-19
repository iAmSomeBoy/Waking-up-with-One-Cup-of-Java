# Vector in Java

> **Source:** [BeginnersBook – Vector in Java](https://beginnersbook.com/2013/12/vector-in-java/)

---

## Overview

`Vector` implements the `List` interface in Java. Like `ArrayList`, it maintains **insertion order**, but it is **synchronized** — meaning it is thread-safe. Because of this synchronization, it gives **poor performance** in searching, adding, deleting, and updating elements in non-thread environments and is rarely used there.

---

## Importing Vector

```java
import java.util.Vector;
```

---

## Creating a Vector

### Method 1 – Default Capacity
```java
Vector<String> vector = new Vector<>();
```
Creates an empty Vector with a **default initial capacity of 10**. When the 11th element is inserted, the Vector **doubles its size** (becomes 20).

### Method 2 – Custom Initial Capacity
```java
Vector<String> vector = new Vector<>(10);
```
Creates a Vector with an initial capacity of 10.

### Method 3 – Custom Capacity + Increment
```java
Vector<String> vector = new Vector<>(4, 6);
```
- Initial capacity: `4`
- Capacity increment: `6`
- On the 5th insertion → size becomes `10` (4+6)
- On the 11th insertion → size becomes `16` (10+6)

---

## Core Operations

### Adding Elements
```java
vector.add("Chaitanya");
vector.add("BeginnersBook");
```

### Accessing Elements
```java
String firstElement = vector.get(0);

// Iterate using enhanced for loop
for (String element : vector) {
    System.out.println(element);
}
```

### Modifying Elements
```java
vector.set(0, "New Element"); // Updates element at index 0
```

### Removing Elements
```java
vector.remove(1);             // Removes element at index 1
vector.remove("Chaitanya");   // Removes first occurrence of "Chaitanya"
```

---

## Complete Example

```java
import java.util.*;

public class VectorExample {

    public static void main(String args[]) {
        Vector<String> vec = new Vector<String>(2);

        vec.addElement("Apple");
        vec.addElement("Orange");
        vec.addElement("Mango");
        vec.addElement("Fig");

        System.out.println("Size is: " + vec.size());
        System.out.println("Default capacity increment is: " + vec.capacity());

        vec.addElement("fruit1");
        vec.addElement("fruit2");
        vec.addElement("fruit3");

        System.out.println("Size after addition: " + vec.size());
        System.out.println("Capacity after increment is: " + vec.capacity());

        Enumeration en = vec.elements();
        System.out.println("\nElements are:");
        while (en.hasMoreElements())
            System.out.print(en.nextElement() + " ");
    }
}
```

**Output:**
```
Size is: 4
Default capacity increment is: 4
Size after addition: 7
Capacity after increment is: 8

Elements are:
Apple Orange Mango Fig fruit1 fruit2 fruit3
```

---

## Commonly Used Methods

| Method | Description |
|---|---|
| `addElement(Object e)` | Inserts element at the end |
| `capacity()` | Returns current capacity |
| `size()` | Returns current number of elements |
| `setSize(int size)` | Changes the size of the vector |
| `contains(Object e)` | Returns `true` if element exists |
| `containsAll(Collection c)` | Returns `true` if all elements of `c` are present |
| `elementAt(int index)` | Returns element at the given index |
| `firstElement()` | Returns the first element |
| `lastElement()` | Returns the last element |
| `get(int index)` | Returns element at the specified index |
| `isEmpty()` | Returns `true` if the vector has no elements |
| `removeElement(Object e)` | Removes the specified element |
| `removeAll(Collection c)` | Removes all elements found in collection `c` |
| `setElementAt(Object e, int index)` | Updates element at the specified index |

---

## Key Points to Remember

- `Vector` is **synchronized** → thread-safe but slower than `ArrayList`.
- It **doubles its size** by default when capacity is exceeded.
- Prefer `ArrayList` for single-threaded use; use `Vector` only when thread safety is needed without external synchronization.
- Part of the **Java Collections Framework** and implements `List`.