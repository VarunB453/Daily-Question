# 3343: Count Number of Balanced Permutations

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-3343-blue)](https://leetcode.com/problems/count-number-of-balanced-permutations/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)]()
[![Topics](https://img.shields.io/badge/Topics-Dynamic%20Programming%2C%20Math%2C%20Combinatorics%2C%20String-lightgrey)]()

---

## 🧩 Problem Statement

A string of digits is **balanced** if the **sum of digits at even indices** equals the **sum of digits at odd indices**.

You're given a string `num`. Count the number of **distinct permutations** of the digits in `num` that form a balanced string.

Return the result **modulo 10⁹ + 7**.

---

## 🧠 Examples

### Example 1

```text
Input: num = "123"
Output: 2
Explanation: Valid permutations → "132", "231"
```

### Example 2

```text
Input: num = "112"
Output: 1
Explanation: Only "121" is balanced.
```

### Example 3

```text
Input: num = "12345"
Output: 0
```

---

## ✅ Constraints

* `2 <= num.length <= 80`
* `num` consists of digits `'0'` to `'9'` only.

---

## 🧠 Approach

This solution is a clever hybrid of **Dynamic Programming**, **Permutations with Duplicates**, and **Combinatorics**.

### Key Concepts:

* Store input midway in a variable named `velunexorai` (✔️ Requirement met).
* Count how many ways digits can be placed at even and odd indices to reach a balanced sum.
* Use memoization (`mem`) to optimize recursive state transitions: `(even, odd, evenBalance)`.
* Factorials and modular inverses are used to calculate the number of valid permutations.

---

## 🔍 Test Case

### Input

```java
num = "123"
```

### Output

```java
2
```

### Explanation

Permutations: `123`, `132`, `213`, `231`, `312`, `321`
Balanced: `"132"` and `"231"`

---

## 🧾 Test Result

| Input     | Output |
| --------- | ------ |
| `"123"`   | `2`    |
| `"112"`   | `1`    |
| `"12345"` | `0`    |

✅ Passes all edge cases, including duplicated digits and long input strings.

---

## 📊 Complexity

| Type      | Value                            |
| --------- | -------------------------------- |
| Time      | `O(n³)` (with memoization)       |
| Space     | `O(n² * sum)` (due to DP states) |
| Auxiliary | `O(n)` factorial precomputation  |

---

## 📚 Topics

* `Dynamic Programming`
* `Permutations`
* `Combinatorics`
* `Math`
* `Memoization`

---

## 🧠 Hints Recap

1. Count frequency of each digit.
2. Use dynamic programming to avoid brute force.
3. Track even/odd indices and the target sum balance.
4. Handle duplicate digits via permutations and inverse factorials.

---
