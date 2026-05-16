# When to Create Object of Main Class in Java

This note is based on a discussion about **Java main class, object creation, bad vs good design, and OOP reasoning**. It is written in a simple, exam‑friendly + practical style.

---

## 1. Common Confusion

Many beginners ask:

* Why do we sometimes create an object of the `main` class?
* Isn’t `public static void main(String[] args)` enough?
* When is `Main obj = new Main();` actually necessary?

This document clears that confusion.

---

## 2. Key Fact About `main()`

```java
public static void main(String[] args)
```

* `main()` is **static**
* JVM calls it **without creating any object**
* It is only the **entry point**, not the place for program logic

> `main()` is like a **door**, not the room where work happens.

---

## 3. ❌ Bad Design Example (Everything static)

```java
class Main {

    static int x = 10;

    static void calculate() {
        System.out.println(x * 2);
    }

    public static void main(String[] args) {
        calculate();
    }
}
```

### Why this is bad?

* No object‑oriented design
* No encapsulation
* Cannot use inheritance or polymorphism
* Looks like procedural programming (C‑style)

Use this only for **very small demos**.

---

## 4. ✅ Good Design Example (Object‑oriented)

```java
class Main {

    int x = 10;

    void calculate() {
        System.out.println(x * 2);
    }

    public static void main(String[] args) {
        Main app = new Main();   // object creation
        app.calculate();
    }
}
```

### Why this is good?

* Data + behavior stay together
* Proper OOP structure
* Easy to extend later
* Clean and maintainable

---

## 5. When Should You Create Object of Main Class?

### ✔️ You MUST create object when:

* You are calling **non‑static methods**
* You are using **instance variables**
* You want **OOP design**
* You plan to use **inheritance / polymorphism**
* Your program has **state**

Example:

```java
class Main {
    int balance = 1000;

    void withdraw(int amount) {
        balance -= amount;
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.withdraw(200);
    }
}
```

---

## 6. Interface & Polymorphism Case

```java
interface App {
    void run();
}

class Main implements App {
    public void run() {
        System.out.println("App running");
    }

    public static void main(String[] args) {
        App app = new Main();  // object is mandatory
        app.run();
    }
}
```

❌ Static methods cannot be overridden
✔️ Polymorphism works only with objects

---

## 7. When You Do NOT Need Object

| Situation                   | Object Needed? |
| --------------------------- | -------------- |
| Only static utility methods | ❌              |
| Small math helper program   | ❌              |
| One‑time demo code          | ❌              |

Example:

```java
static int add(int a, int b) {
    return a + b;
}
```

---

## 8. Golden Rule ⭐

> **`main()` creates objects.
> Objects do the real work.**

---

## 9. One‑Line Analogy (Easy to Remember)

* `main()` → Door 🚪
* Object → Room 🏠
* Work happens inside the room, not at the door

---

## 10. Exam‑Friendly Conclusion

Creating an object of the main class is necessary when the program uses non‑static members and follows object‑oriented principles. The `main()` method should only act as an entry point and delegate responsibilities to objects.

---
