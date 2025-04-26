# 1922. Count Good Numbers | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-1922.%20Count%20Good%20Numbers-blue)](https://leetcode.com/problems/count-good-numbers/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

A digit string is **good** if:

- Digits at **even indices** (0-based) are **even**: 0, 2, 4, 6, or 8.
- Digits at **odd indices** are **prime**: 2, 3, 5, or 7.

You are given a positive integer `n`. Return the **total number of good digit strings** of length `n`, **modulo 10⁹ + 7**.

---

## 🧠 Approach

### Key Observations

- Even positions (0, 2, 4, ...) → 5 possible digits (0, 2, 4, 6, 8)
- Odd positions (1, 3, 5, ...) → 4 possible digits (2, 3, 5, 7)

So if `n` = total length:

- There are `(n + 1) / 2` even indices → 5 options each
- There are `n / 2` odd indices → 4 options each

Total count = `5^even_count * 4^odd_count`

---

### Efficient Exponentiation

Use **fast modular exponentiation** to handle large powers (since `n` can be up to 10¹⁵).

---

## 🔍 Example Walkthroughs

### Example 1:
**Input:** `n = 1`  
**Output:** `5`  
**Explanation:** Valid digits are {0, 2, 4, 6, 8}

---

### Example 2:
**Input:** `n = 4`  
**Output:** `400`  
**Explanation:**  
Even positions: 0 and 2 → 2 positions → `5^2 = 25`  
Odd positions: 1 and 3 → 2 positions → `4^2 = 16`  
Total = `25 * 16 = 400`

---

### Example 3:
**Input:** `n = 50`  
**Output:** `564908303`  
**(calculated using modular exponentiation)**

---

## ✅ Complexity Analysis

- **Time Complexity:** `O(log n)` due to fast exponentiation
- **Space Complexity:** `O(1)`

---

## ✨ Highlights

- Handles extremely large `n` values (up to `10¹⁵`) efficiently
- Applies **modular arithmetic** to avoid overflow
- Clean, readable Java implementation

---

## 🧪 Test Case

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.countGoodNumbers(1));   // Output: 5
    System.out.println(sol.countGoodNumbers(4));   // Output: 400
    System.out.println(sol.countGoodNumbers(50));  // Output: 564908303
}
```

---
