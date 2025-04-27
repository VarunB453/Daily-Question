# 3392. Count Subarrays of Length Three With a Condition | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-3392.%20Count%20Subarrays%20of%20Length%20Three%20With%20a%20Condition-blue)](https://leetcode.com/problems/count-subarrays-of-length-three-with-a-condition/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement  

Given an integer array `nums`, return the number of subarrays of length 3 such that the **sum of the first and third numbers equals exactly half of the second number**.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `nums = [1,2,1,4,1]` | `1` |

**Explanation:**  
Only the subarray `[1,4,1]` satisfies the condition: (1 + 1) * 2 == 4.

---

### Example 2  

| Input | Output |
|-------|--------|
| `nums = [1,1,1]` | `0` |

**Explanation:**  
The only subarray `[1,1,1]` does not satisfy the given condition.

---

## ✅ Constraints  

- `3 <= nums.length <= 100`
- `-100 <= nums[i] <= 100`

---

## 💡 Approach  

### 🔄 Brute Force (Simple Iteration)

1. Iterate through each subarray of length 3.
2. Check if **(first + third) * 2 == middle**.
3. Count how many subarrays satisfy this condition.

> Since the array length is small (at most 100), a simple loop is efficient enough.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(n)` — Linear pass through the array |
| **Space**      | `O(1)` — Only a counter is used |

---

## ✨ Possible Improvements  

- No major improvements are needed due to the small input size.
- If constraints were larger, a sliding window or prefix sum optimization could be considered.

---

## 📚 Topics & Hint  

**Topics:** Array  

**Hint:**  
> Simply check every subarray of length 3. No optimization needed because of small input size.

---