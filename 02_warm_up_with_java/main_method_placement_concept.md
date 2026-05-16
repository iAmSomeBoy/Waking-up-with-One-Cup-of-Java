# main() Placement in Java: Design Comparison

🔥 এই দুইটা design-ই valid, কিন্তু **OOP point of view থেকে একটার মানে বেশি**।  
এখানে situation-wise দেখানো হলো—**কখন কোনটা ব্যবহার করা উচিত**।

---

## 🔹 Design–1 : `main()` + object একই class-এ

```java
class Game {

    void start() {
        System.out.println("Game started");
    }

    public static void main(String[] args) {
        Game g = new Game();
        g.start();
    }
}
```

### এটা কখন ঠিক?
- ছোট program  
- practice / learning phase  
- quick test দরকার  
- single-file solution  

### কেন কাজ করে?
- `main()` static → JVM এখান থেকেই execution শুরু করে  
- `start()` non-static → তাই object বানাতে হচ্ছে  

👉 এখানে main class-ই **launcher + worker** দুইটাই।

### Limitation
- responsibility মিশে যাচ্ছে  
- Single Responsibility Principle পুরোপুরি follow করে না  
- future-এ code বড় হলে messy হয়ে যেতে পারে  

---

## 🔹 Design–2 : `main()` আলাদা launcher class-এ  
### (BEST PRACTICE ✅)

```java
class Game {

    void start() {
        System.out.println("Game started");
    }
}

class GameLauncher {

    public static void main(String[] args) {
        Game game = new Game();
        game.start();
    }
}
```

### এটা কেন ভালো?
- Single Responsibility Principle follow করে  
- `Game` → business logic  
- `GameLauncher` → program entry point  

👉 `Game` class এখন:
- reusable  
- testable  
- extendable  

---

## 🧠 Head First Java — Golden Line

> **Use `main()` as a launcher, not as a place where your program lives.**

---

## 🆚 Side-by-side Comparison

| Aspect | Design–1 | Design–2 |
|---|---|---|
| Valid Java | ✅ | ✅ |
| Clean OOP | ⚠️ Medium | ✅ Best |
| Reusability | ❌ কম | ✅ বেশি |
| Testing | ❌ কঠিন | ✅ সহজ |
| Real projects | ❌ Rarely | ✅ Always |

---

## 🎯 তাহলে কোনটা কখন ব্যবহার করবো?

### আমি Design–1 ব্যবহার করি যখন:
- exam practice  
- small demo  
- single-file program  
- quick experimentation  

### আমি Design–2 ব্যবহার করি যখন:
- real project  
- Head First Java / OOP শেখা  
- clean architecture দরকার  
- future scalability দরকার  
