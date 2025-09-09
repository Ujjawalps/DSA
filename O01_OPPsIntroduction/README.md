## 📘 OOPs_001 - Introduction (Interview Notes)

**1. What is OOP?**

* OOP is a programming paradigm that organizes code into objects.
* Provides modularity, reusability, and scalability.

**2. What is a Class and an Object?**

* **Class** → Blueprint or template that defines state (variables) and behavior (methods).
* **Object** → Instance of a class with its own state, behavior, and identity.

**3. What are the Properties of an Object?**

* **State** → Represents data of the object.
* **Behavior** → Represents functionality (methods).
* **Identity** → Unique reference in memory.

**4. How to Create and Access Objects in Java?**

* Objects are created using the `new` keyword.
* Access members using the `.` operator.

```java
Car myCar = new Car();
myCar.color = "Red";
myCar.drive();
```

**5. How is Memory Allocated to Objects?**

* Objects are stored in the **Heap memory**.
* Reference variables are stored in the **Stack**.

**6. What is a Constructor in Java?**

* A constructor is a special method used to initialize objects.
* Same name as class, no return type.
* Types:

    * **Default Constructor** – provided by compiler.
    * **Parameterized Constructor** – accepts arguments.
* **Constructor Overloading** – multiple constructors with different parameters.
* **Constructor Chaining** – one constructor calls another using `this()`.

**7. Explain the `this` Keyword.**

* Refers to the current object.
* Used to resolve conflicts when local and instance variables have the same name.

**8. Why do we use Wrapper Classes?**

* To treat primitives (int, double, boolean, etc.) as objects.
* Useful in collections like `ArrayList` that only work with objects.

**9. What is the `final` Keyword?**

* `final` variable → value cannot be changed.
* `final` method → cannot be overridden.
* `final` class → cannot be inherited.

**10. Explain Garbage Collection in Java.**

* Java automatically removes unused objects from memory (Heap).
* An object becomes eligible for GC when no reference points to it.
* We can suggest GC using `System.gc()` (not guaranteed).
* `finalize()` was used earlier but is deprecated; use **Cleaner API** now.

---