# Java-তে Method ব্যবহার করার ২টা রাস্তা  
### (Composition vs Inheritance)

Java-তে method ব্যবহার করার জন্য **inheritance বাধ্যতামূলক না**।  
মূল কথা একটাই—

> **Object থাকলেই → তার method ব্যবহার করা যায়**

---

## 🔹 Way–1: Object বানিয়ে (Composition / has-a) ✅

```java
Game game = new Game();  // object create
game.start();           // method call
```

### এখানে কী হচ্ছে?
- `Game` class থেকে একটা object বানানো হয়েছে  
- সেই object-এর মাধ্যমে `start()` method call করা হয়েছে  

### 📌 Rule
- Object থাকলে → তার method ব্যবহার করা যায়  
- এর জন্য `extends` লাগে না  

---

## 🔹 Way–2: Inheritance দিয়ে (is-a)

```java
class GameLauncher extends Game {
    public static void main(String[] args) {
        GameLauncher gl = new GameLauncher();
        gl.start(); // inherited method
    }
}
```

### এখানে কী হচ্ছে?
- `GameLauncher` → `Game`-এর সব **non-private** method পেয়ে গেছে  
- আলাদা করে `Game` object বানাতে হয়নি  
- নিজের object দিয়েই method call করা হয়েছে  

---

## 🤯 পার্থক্যটা কোথায়?

### 🔸 Object Use (Composition)
- `GameLauncher has a Game`
- Object বানিয়ে method call

### 🔸 Inheritance
- `GameLauncher is a Game`
- Superclass-এর behaviour inherit করে

👉 এই example-এ **GameLauncher is NOT a Game**,  
সে শুধু Game **চালু করে**।

---

## 🧪 Real-life Analogy — 🚗 Car & Driver

### ❌ Wrong Inheritance
```java
class Driver extends Car { } // Driver is NOT a Car
```

### ✅ Correct Design (Composition)
```java
class Driver {
    Car car = new Car(); // Driver HAS a Car
}
```

- Driver → `car.drive()` করতে পারে  
- কিন্তু Driver কখনো Car হয় না  

---

## 🧠 JVM কী দেখে?

```java
Game game = new Game();
game.start();
```

JVM internally ভাবে—
1. `Game` class memory-তে load করো  
2. নতুন `Game` object বানাও  
3. object-এর `start()` method call করো  

👉 Inheritance দরকার নেই।

---

## 🆚 One-line Difference

| বিষয় | Object Use | Inheritance |
|---|---|---|
| `extends` দরকার? | ❌ না | ✅ হ্যাঁ |
| Object লাগে? | ✅ হ্যাঁ | ✅ হ্যাঁ |
| Relation | has-a / uses-a | is-a |
| Real projects | ✅ বেশি | ⚠️ কম |

---

# 🎮 Game + CarRace vs 🚗 Car + CarDriver  
### (Inheritance vs Composition — Crystal Clear)

---

## 🔹 Case–1: Game + CarRace  
### (Inheritance → is-a)

**প্রশ্ন:** 👉 `CarRace` কি একটা `Game`?  
✔️ হ্যাঁ — CarRace আসলে একধরনের Game।

### ✅ Correct Design
```java
class Game {
    void start() {
        System.out.println("Game started");
    }
}

class CarRace extends Game {
    void race() {
        System.out.println("Car race started");
    }

    public static void main(String[] args) {
        CarRace race = new CarRace();
        race.start(); // inherited
        race.race();
    }
}
```

### কী বোঝা যায়?
- `CarRace is a Game`  
- তাই `extends Game`  
- `start()` method inherit হয়েছে  

📌 **Rule:**  
Subclass যদি সত্যিই superclass-এর special form হয় → Inheritance ব্যবহার করো।

---

## 🔹 Case–2: Car + CarDriver  
### (Composition → has-a)

**প্রশ্ন:** 👉 `CarDriver` কি একটা `Car`?  
❌ না।

### ❌ Wrong Design
```java
class CarDriver extends Car { }
```

### ✅ Correct Design (Composition)
```java
class Car {
    void drive() {
        System.out.println("Car is driving");
    }
}

class CarDriver {
    public static void main(String[] args) {
        Car car = new Car(); // Driver HAS a Car
        car.drive();
    }
}
```

### এখানে কী হচ্ছে?
- `CarDriver has a Car`  
- Object বানিয়ে method call  
- কোনো inheritance নেই  

📌 **Rule:**  
Object বানিয়ে method ব্যবহার করা = **Composition**

---

## 🧠 One-line Logic

| Relation | Technique |
|---|---|
| is-a | `extends` (Inheritance) |
| has-a / uses-a | Object create (Composition) |

---

## 🔥 Side-by-side Mapping

| Example | Relation | Correct Technique |
|---|---|---|
| CarRace → Game | is-a | Inheritance |
| Driver → Car | has-a | Object use |
| GameLauncher → Game | uses-a | Object use |
| Hippo → Animal | is-a | Inheritance |

## 🎯 Final Takeaway
> **Method ব্যবহার করতে inheritance দরকার নেই**  
> **Object থাকলেই যথেষ্ট**
Inheritance শুধু তখনই ব্যবহার করো,  
যখন relationship সত্যিই **is-a**।


# Inheritance vs Composition — Basic Differences
## 1️⃣ Method override করা যায়?
🔹 Inheritance (is-a) → YES
```
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}
```

✔️ Subclass superclass-এর method override করতে পারে।
🔹 Composition (has-a) → NO (directly না)
``` class Engine {
    void start() {
        System.out.println("Engine started");
    }
}

class Car {
    Engine engine = new Engine();
}
```

 ❌ Car → Engine-এর method override করতে পারে না
 ✔️ শুধু engine.start() call করতে পারে
 👉 Override শুধু parent-child relationship-এ হয়।

## 2️⃣ Relationship type
Topic	Inheritance	Composition
Relationship	is-a	has-a / uses-a
Keyword	extends	object create
Method override	✅ Yes	❌ No
## 3️⃣ Polymorphism support
🔹 Inheritance → Full polymorphism
Animal a = new Dog();
a.sound(); // Bark

🔹 Composition → No runtime polymorphism
Car c = new Car();
c.engine.start();

## 4️⃣ Access level
Feature	Inheritance	Composition
protected access	✅ Yes	❌ No
private access	❌ No	❌ No
## 5️⃣ Code change impact
 Inheritance
Parent class change → child break হতে পারে
Fragile base class problem

 Composition:
Component change → low impact
Easy to replace component
