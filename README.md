# 📘 **Day-10: Java For Loops**

Welcome to **Day-10** of our Java learning journey! Today, we’ll dive deep into one of the most commonly used control structures in programming: the **`for` loop**. You’ll learn how to repeat actions with precision, process data in a sequence, and use advanced controls like `break`, `continue`, and even `return` in loops.

---

## 📌 **Lesson Structure**

### 🔁 1️⃣ What is a `for` loop?

- Syntax of the `for` loop
- When and why to use it
- Comparison with `while` and `do-while`

### 🧱 2️⃣ Loop Structure

```java
for (initialization; condition; update) {
    // code block
}
```

- Initialization: sets up the loop
- Condition: checked before each iteration
- Update: modifies the loop control variable

### 🧠 3️⃣ Real-Life Use Cases of `for` Loops

- Printing sequences
- Repeating actions
- Accessing items in arrays
- Nested looping (rows & columns)

### ✂️ 4️⃣ Special Controls Inside Loops

- `break;` → exit the loop early
- `continue;` → skip the current iteration
- `return;` → exit the whole method from within the loop

---

## 📜 **Live Coding Examples**

---

### 🖥️ Example 1: Print numbers from 1 to 5

```java
for (int i = 1; i <= 5; i++) {
    System.out.println("i = " + i);
}
```

---

### 🖥️ Example 2: Print even numbers from 2 to 10

```java
for (int i = 2; i <= 10; i += 2) {
    System.out.println(i);
}
```

---

### 🖥️ Example 3: Countdown from 10 to 1

```java
for (int i = 10; i >= 1; i--) {
    System.out.println("Countdown: " + i);
}
```

---

### 🖥️ Example 4: Use of `break`

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        System.out.println("Stopping early at 5.");
        break;
    }
    System.out.println("i = " + i);
}
```

---

### 🖥️ Example 5: Use of `continue`

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.println("i = " + i); // Skips 3
}
```

---

### 🖥️ Example 6: Nested Loop - Print a Grid (3x3)

```java
for (int row = 1; row <= 3; row++) {
    for (int col = 1; col <= 3; col++) {
        System.out.print("[" + row + "," + col + "] ");
    }
    System.out.println();
}
```

---

### 🖥️ Example 7: Use `return` inside a loop

```java
public static void searchNumber(int[] numbers, int target) {
    for (int num : numbers) {
        if (num == target) {
            System.out.println("Found: " + num);
            return;
        }
    }
    System.out.println("Not found.");
}
```

---

## 💡 **Quick Quizzes**

### ❓ What does this print?

```java
for (int i = 0; i < 3; i++) {
    System.out.print(i + " ");
}
```

✅ Answer: `0 1 2`

---

### ❓ How many times will this loop run?

```java
for (int i = 10; i > 5; i--) {
    System.out.println(i);
}
```

✅ Answer: 5 times (`10, 9, 8, 7, 6`)

---

### ❓ Fix the bug:

```java
for (int i = 5; i >= 0; i++) {
    System.out.println(i);
}
```

✅ Bug: Loop will run forever.  
✅ Fix: `i--` is missing. It should be:

```java
for (int i = 5; i >= 0; i--) {
```

---

## 🎯 **Hands-on Exercises**

✅ Write a program to print the multiplication table for number `n` (1 to 10)  
✅ Print all odd numbers from 1 to 99  
✅ Calculate the sum of all numbers between 1 and 50  
✅ Print a triangle of stars using nested `for` loops  
✅ Use `continue` to skip all multiples of 3 from 1 to 20  

---

## 📚 **Additional Resources**

- [Java For Loop (W3Schools)](https://www.w3schools.com/java/java_for_loop.asp)  
- [Java Control Flow (Oracle Docs)](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)  
- [Break and Continue Statements](https://www.geeksforgeeks.org/java-break-continue/)  
- [Nested Loops in Java](https://www.programiz.com/java-programming/nested-loop)

---

🚀 **Great job! Practice `for` loops with creativity and purpose — they’re everywhere in real-world programming. Get ready for Day-11!** 🎉

