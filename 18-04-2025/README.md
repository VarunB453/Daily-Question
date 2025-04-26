# 2176. Count Equal and Divisible Pairs in an Array | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2176.%20Count%20Equal%20and%20Divisible%20Pairs%20in%20an%20Array-blue)](https://leetcode.com/problems/count-equal-and-divisible-pairs-in-an-array/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement

You are given a **0-indexed** integer array `nums` of length `n` and an integer `k`.  

Return *the number of pairs* `(i, j)` **where**:

- `0 <= i < j < n`,  
- `nums[i] == nums[j]`, and  
- `(i * j) % k == 0`.

---

## 🧠 Approach

### Brute-force Solution

This problem can be approached by checking **every pair** `(i, j)` where `i < j` and evaluating:

1. If the elements at `i` and `j` are equal (`nums[i] == nums[j]`).
2. If the product `i * j` is divisible by `k`.

Since `n <= 100`, a nested loop will work efficiently within the constraints.

---

## 🧪 Examples

### Example 1:

**Input:**  
`nums = [3,1,2,2,2,1,3], k = 2`

**Output:**  
`4`

**Explanation:**  
Valid pairs:
- `(0, 6)` → `nums[0] == nums[6]` and `0 * 6 % 2 == 0`
- `(2, 3)` → `2 * 3 % 2 == 0`
- `(2, 4)` → `2 * 4 % 2 == 0`
- `(3, 4)` → `3 * 4 % 2 == 0`

---

### Example 2:

**Input:**  
`nums = [1,2,3,4], k = 1`

**Output:**  
`0`

**Explanation:**  
No values are repeated.

---

## 🔍 Complexity Analysis

- **Time Complexity:** `O(n^2)`  
  Two nested loops iterate over all pairs of indices.

- **Space Complexity:** `O(1)`  
  No extra space is used except a counter.

---

## 📌 Constraints

- `1 <= nums.length <= 100`
- `1 <= nums[i], k <= 100`

---

## ✨ Follow-up Ideas

- Use a hash map to group indices by number and reduce pair checking.
- Could be optimized further for large inputs (if constraints were higher).

---