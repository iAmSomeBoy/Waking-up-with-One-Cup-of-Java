# Difference Between `String` and `StringBuilder` in Java

## 1. Basic Difference

In Java, the main difference between `String` and `StringBuilder` is **mutability**.

A `String` is **immutable**. Once a `String` object is created, its value cannot be changed. If you try to modify it, Java creates a new object in memory.

Example:

```java
String s = "Hello";
s = s + " World";
```

Here, the original `"Hello"` is not changed. A new object `"Hello World"` is created.

A `StringBuilder` is **mutable**. It allows modification of the same object without creating a new one.

Example:

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
```

Here, the same object is modified.

---

## 2. Performance Difference

If you modify strings many times (especially inside loops), `String` becomes slower because it keeps creating new objects.

`StringBuilder` is faster in such cases because it modifies the same object.

---

## 3. Thread Safety

`String` is naturally thread-safe because it is immutable.

`StringBuilder` is **not thread-safe**.

For thread-safe mutable strings, Java provides `StringBuffer`.

---

# Member Functions of `String`

`String` is immutable. All modifying operations return a **new String object**.

## Common Instance Methods

* `length()`
* `charAt(int index)`
* `substring(int begin)`
* `substring(int begin, int end)`
* `equals(Object obj)`
* `equalsIgnoreCase(String s)`
* `compareTo(String s)`
* `contains(CharSequence s)`
* `startsWith(String prefix)`
* `endsWith(String suffix)`
* `indexOf(String s)`
* `lastIndexOf(String s)`
* `toUpperCase()`
* `toLowerCase()`
* `trim()`
* `replace(char old, char new)`
* `replace(CharSequence target, CharSequence replacement)`
* `split(String regex)`
* `concat(String s)`
* `isEmpty()`
* `toCharArray()`

## Important Static Methods

* `valueOf(int i)`
* `valueOf(double d)`
* `valueOf(Object obj)`
* `format(String format, Object... args)`
* `join(CharSequence delimiter, CharSequence... elements)`

---

# Member Functions of `StringBuilder`

`StringBuilder` is mutable. Most methods modify the same object and return the same reference.

## Common Instance Methods

* `append(String s)`
* `append(int i)`
* `insert(int offset, String s)`
* `replace(int start, int end, String str)`
* `delete(int start, int end)`
* `deleteCharAt(int index)`
* `reverse()`
* `length()`
* `capacity()`
* `ensureCapacity(int min)`
* `setLength(int newLength)`
* `charAt(int index)`
* `setCharAt(int index, char ch)`
* `substring(int start)`
* `substring(int start, int end)`
* `toString()`

---

## `StringBuilder` has no static method. That means if we use its member methods we must create an object first.
Why?
    Because String is heavily used for conversions and formatting.
But StringBuilder is designed only for mutable string manipulation, not for utility-style operations. So almost all of its methods are instance methods, like:append(),insert(),delete(),reverse(), toString(), etc.

# Quick Practical Comparison

With `String`:

```java
String s = "A";
s.concat("B");  // creates new object
```

With `StringBuilder`:

```java
StringBuilder sb = new StringBuilder("A");
sb.append("B"); // modifies same object
```

---

# Summary

* `String` → Immutable, safer, but slower for frequent modifications.
* `StringBuilder` → Mutable, faster for modifications, not thread-safe.
