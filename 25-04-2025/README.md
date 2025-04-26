# 2799. Count Complete Subarrays in an Array | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2799.%20Count%20Complete%20Subarrays%20in%20an%20Array-blue)](https://leetcode.com/problems/count-complete-subarrays-in-an-array/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement  

You are given an integer array `nums` consisting of positive integers.

A **subarray** of `nums` is called **complete** if **the number of distinct elements** in the subarray is equal to the **number of distinct elements in the entire array**.

Return the **number of complete subarrays**.

A **subarray** is a contiguous, non-empty part of the array.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `nums = [1,3,1,2,2]` | `4` |

**Explanation:**  
Complete subarrays:  
- `[1,3,1,2]`  
- `[1,3,1,2,2]`  
- `[3,1,2]`  
- `[3,1,2,2]`  

---

### Example 2  

| Input | Output |
|-------|--------|
| `nums = [5,5,5,5]` | `10` |

**Explanation:**  
Only one unique number exists, so **every** subarray is complete. Total subarrays = 10.

---

## ✅ Constraints  

- `1 <= nums.length <= 1000`  
- `1 <= nums[i] <= 2000`

---

## 💡 Approach  

### 🔄 Sliding Window + Hash Counting  

1. **Get total number of distinct elements in `nums`** using a `Set`.
2. Use **sliding window** to count subarrays that do **not** contain all distinct elements.
3. Subtract those from total subarrays to get only the complete ones.

Or, directly **count subarrays ending at each position** where the window contains all distinct elements.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(n)` — Single pass with a sliding window |
| **Space**      | `O(K)` — Where K is the max value in `nums` (up to 2000) |

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.countCompleteSubarrays(new int[]{1,3,1,2,2})); // 4
    System.out.println(sol.countCompleteSubarrays(new int[]{5,5,5,5}));   // 10
}
```

---

## ✨ Possible Improvements  

- Replace array `count[2001]` with a `HashMap` for better space efficiency if `nums[i]` has a sparse range.
- Could pre-compute prefix frequency maps if needed for variations.

---

## 📚 Topics & Hint  

**Topics:** Array • Hash Table • Sliding Window  

**Hint:**  
> Count all subarrays ending at `i` where the window contains all distinct elements from the original array.

---
