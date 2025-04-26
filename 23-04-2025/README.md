# 2338. Count the Number of Ideal Arrays | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2338.%20Count%20the%20Number%20of%20Ideal%20Arrays-blue)](https://leetcode.com/problems/count-the-number-of-ideal-arrays/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)]()

---

## 🧩 Problem Statement

You are given two integers `n` and `maxValue`.  
A **0-indexed** integer array `arr` of length `n` is called **ideal** if:

- Each `arr[i]` is in the range `[1, maxValue]`
- For each `i > 0`, `arr[i]` is divisible by `arr[i - 1]` (i.e., `arr[i] % arr[i-1] == 0`)

Return the **number of distinct ideal arrays** of length `n`, modulo `10⁹ + 7`.

---

## 🧠 Examples

### Example 1:

**Input:**  
`n = 2`, `maxValue = 5`  
**Output:**  
`10`  
**Explanation:**  
Valid arrays include:  
[1,1], [1,2], [1,3], [1,4], [1,5], [2,2], [2,4], [3,3], [4,4], [5,5]

---

### Example 2:

**Input:**  
`n = 5`, `maxValue = 3`  
**Output:**  
`11`

---

## ✅ Constraints

- `2 <= n <= 10⁴`
- `1 <= maxValue <= 10⁴`

---

## 💡 Approach

This problem can be tackled using a combination of **DFS with memoization**, **combinatorics**, and **number theory**:

### Key Ideas:

- **Observation 1:** Ideal arrays are non-decreasing in structure due to the divisibility requirement.
- **Observation 2:** For each possible starting number, we can build longer sequences by appending its multiples.
- Use **DFS** to explore valid sequences starting from each value.
- Use **combinatorics** to count how many ways values can appear at different positions in an array of length `n`.

---

## 🔍 Complexity Analysis

- **Time Complexity:**  
  - DFS explores up to `log(maxValue)` depth for each starting value.
  - Overall complexity is around `O(maxValue * log(maxValue) * n)`
- **Space Complexity:**  
  - `O(maxValue * 16)` for memoization  
  - `O(n * 16)` for combinatorics

---

## 🧪 Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.idealArrays(2, 5));  // Output: 10
    System.out.println(sol.idealArrays(5, 3));  // Output: 11
}
```

---

## ✨ Possible Improvements

- Precompute primes and use factorization to build sequences faster.
- Optimize combination logic with Pascal’s Triangle or modular inverse.

--- 