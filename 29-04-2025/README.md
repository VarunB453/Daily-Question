# 2962. Count Subarrays Where Max Element Appears at Least K Times | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2962.%20Count%20Subarrays%20Where%20Max%20Element%20Appears%20at%20Least%20K%20Times-blue)](https://leetcode.com/problems/count-subarrays-where-max-element-appears-at-least-k-times/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

You are given an integer array `nums` and a positive integer `k`.

Return the number of subarrays **where the maximum element in `nums` appears at least `k` times**.

- A **subarray** is a contiguous sequence of elements within the array.

---

## 🧠 Examples

### Example 1  

| Input             | Output |
|------------------|--------|
| `nums = [1,3,2,3,3], k = 2` | `6`    |

**Explanation:**  
Valid subarrays with `3` (the max element) appearing at least 2 times:
- `[1,3,2,3]`
- `[1,3,2,3,3]`
- `[3,2,3]`
- `[3,2,3,3]`
- `[2,3,3]`
- `[3,3]`

---

### Example 2  

| Input             | Output |
|------------------|--------|
| `nums = [1,4,2,1], k = 3` | `0`    |

**Explanation:**  
Max element is `4`, but it appears only once in any subarray.

---

## ✅ Constraints

- `1 <= nums.length <= 10⁵`
- `1 <= nums[i] <= 10⁶`
- `1 <= k <= 10⁵`

---

## 💡 Approach

- First, find the **maximum element** in the array.
- Use a **sliding window** (two pointers) to find subarrays where this max element appears at least `k` times.
- For every valid window ending at index `r`, count how many such subarrays start before or at `l`.

---

## 🔍 Complexity Analysis

|                | Value |
|----------------|-------|
| **Time**       | `O(n)` — Single pass through array |
| **Space**      | `O(1)` — Constant space used |

---

## 📚 Topics & Hint

**Topics:** Array • Sliding Window • Two Pointers

**Hint:**  
> Keep track of how often the max element appears in your current sliding window, and count subarrays accordingly.

---
