# 🧩 1920. Build Array from Permutation

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-1920-blue)](https://leetcode.com/problems/build-array-from-permutation/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)]()
[![Language](https://img.shields.io/badge/Language-Java-orange)]()

---

## 📄 Problem Statement

Given a **zero-based permutation** `nums`, build an array `ans` of the same length such that:

```
ans[i] = nums[nums[i]]
```

A **zero-based permutation** is an array of **distinct integers** from `0` to `nums.length - 1`.

---

## 🧠 Examples

### Example 1

```txt
Input:  nums = [0,2,1,5,3,4]
Output: [0,1,2,4,5,3]
```

### Example 2

```txt
Input:  nums = [5,0,1,2,3,4]
Output: [4,5,0,1,2,3]
```

---

## ✅ Constraints

* `1 <= nums.length <= 1000`
* `0 <= nums[i] < nums.length`
* All elements in `nums` are **distinct**

---

## 🚀 Follow-Up

**Can you solve it using O(1) extra space?**

Yes, using value encoding within the original array to store both old and new values.

---

## 💡 Approach

### 🔁 Basic Simulation

* Create a new array `ans`.
* For each index `i`, assign `ans[i] = nums[nums[i]]`.

### 🧠 Space-Optimized Approach (Follow-Up)

* Modify `nums` in-place by encoding both original and new values using modulus and division.

---

## 🔍 Complexity Analysis

| Metric | Value                   |
| ------ | ----------------------- |
| Time   | O(n)                    |
| Space  | O(1) (in-place) or O(n) |

---

## 📚 Topics

**Tags:** Array • Simulation

---
