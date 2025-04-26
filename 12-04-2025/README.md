# 2843. Count Symmetric Integers | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2843.%20Count%20Symmetric%20Integers-blue)](https://leetcode.com/problems/count-symmetric-integers/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement

You are given two positive integers `low` and `high`.  
An integer `x` consisting of `2 * n` digits is **symmetric** if the **sum of the first n digits** is equal to the **sum of the last n digits**.

- Numbers with an odd number of digits are **never** symmetric.
- Return the number of symmetric integers in the inclusive range `[low, high]`.

---

## 🧠 Examples

### Example 1:

**Input:**  
`low = 1`, `high = 100`  
**Output:**  
`9`  
**Explanation:**  
Symmetric integers: 11, 22, 33, 44, 55, 66, 77, 88, 99

---

### Example 2:

**Input:**  
`low = 1200`, `high = 1230`  
**Output:**  
`4`  
**Explanation:**  
Symmetric integers: 1203, 1212, 1221, 1230

---

## ✅ Constraints

- `1 <= low <= high <= 10⁴`

---

## 💡 Approach

This solution iterates through each number in the range and checks if it's symmetric using custom logic:

### Key Conditions:
- **2-digit numbers (10–99):** symmetric if both digits are equal (e.g., 33)
- **4-digit numbers (1000–9999):** symmetric if the sum of the first two digits equals the sum of the last two digits

---

## 🔍 Complexity Analysis

- **Time Complexity:** `O(n)`  
  - We iterate over each number in the range `[low, high]`
- **Space Complexity:** `O(1)`  
  - No extra space is used apart from variables

---

## 🧪 Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.countSymmetricIntegers(1, 100));     // Output: 9
    System.out.println(sol.countSymmetricIntegers(1200, 1230)); // Output: 4
    System.out.println(sol.countSymmetricIntegers(10, 99));     // Output: 9
}
```

---

## ✨ Possible Improvements

- Extend the logic for longer symmetric numbers (6 digits, 8 digits, etc.)
- Optimize by skipping non-even-digit numbers

---
