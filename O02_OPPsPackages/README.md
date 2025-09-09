## 📘 OPPs_002 - Packages, Static, Inner Classes, Singleton (Interview Notes)

**1. What is a Package in Java?**

* A package is a namespace that organizes related classes and interfaces.
* Helps avoid name conflicts and makes code modular.
* Two types:

    * **Built-in** (e.g., `java.util`, `java.io`).
    * **User-defined** (created by developers).

**2. How do you use the `import` statement?**

* To access classes from a package.
* Example:

```java
import java.util.Scanner;    // specific class
import java.util.*;          // all classes in java.util
```

**3. What is the `static` keyword in Java?**

* Belongs to the class, not instances.
* Types:

    * **Static variable** → shared across all objects.
    * **Static method** → can be called without creating an object.
    * **Static block** → executed once when class is loaded.
* Example:

```java
class Counter {
    static int count = 0;
    Counter() { count++; }
}
```

**4. Can a static method access non-static members?**

* ❌ No, because static methods belong to class, not objects.
* ✅ Non-static methods can access static members.

**5. Can we use `this` in a static context?**

* ❌ No, because `this` refers to the current object, but static does not depend on objects.

**6. How are static variables initialized?**

* Either directly during declaration or using a static block.
* Example:

```java
static int x;
static {
    x = 100; // runs once when class loads
}
```

**7. What are Inner Classes in Java?**

* A class declared inside another class.
* Types:

    * **Non-static inner class** → needs outer object to access.
    * **Static nested class** → can be used without outer object.
* Example:

```java
class Outer {
    class Inner { void msg() { System.out.println("Hello"); } }
}
```

**8. What is a Singleton Class?**

* A design pattern that allows only **one instance** of a class.
* Implementation:

    * Private constructor.
    * Private static instance of the class.
    * Public static method to return the single instance.

```java
class Singleton {
    private static Singleton instance = null;
    private Singleton() {}
    public static Singleton getInstance() {
        if (instance == null) instance = new Singleton();
        return instance;
    }
}
```
---