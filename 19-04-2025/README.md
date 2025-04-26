# 38. Count and Say | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-38.%20Count%20and%20Say-blue)](https://leetcode.com/problems/count-and-say/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

The **Count and Say** sequence is a digit string sequence defined recursively as follows:

- `countAndSay(1) = "1"`
- `countAndSay(n)` is the **run-length encoding** of `countAndSay(n - 1)`

Run-length encoding works by describing the **count** of digits seen consecutively followed by the digit itself.

**Example**:  
`"3322251"` becomes `"23321511"`  
→ Two 3s, three 2s, one 5, and one 1.

---

## 🧠 Approach

### Step-by-step

1. Start with `"1"` as the base case.
2. Iteratively apply run-length encoding to build the next sequence up to `n`.
3. Use a `StringBuilder` for efficient string operations.

### Core Idea

Count the number of repeated digits and describe them as:
`<count><digit>`

For example:
- `countAndSay(1)` = `"1"`
- `countAndSay(2)` = `"11"` (one 1)
- `countAndSay(3)` = `"21"` (two 1s)
- `countAndSay(4)` = `"1211"` (one 2, one 1)
- And so on...

---

## ✅ Complexity Analysis

- **Time Complexity:** `O(n * m)`  
  where `m` is the average length of the string at each step.
- **Space Complexity:** `O(m)`  
  since we use extra space to build the next string.

---

## 🧪 Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.countAndSay(1)); // Output: "1"
    System.out.println(sol.countAndSay(4)); // Output: "1211"
    System.out.println(sol.countAndSay(5)); // Output: "111221"
}
```

---

## ✨ Highlights

- Simple yet elegant solution using iterative string building.
- Demonstrates how **run-length encoding** can be used to generate sequences.
- Great exercise for mastering string manipulation.

---