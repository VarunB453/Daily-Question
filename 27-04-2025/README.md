# 2444. Count Subarrays With Fixed Bounds | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2444.%20Count%20Subarrays%20With%20Fixed%20Bounds-blue)](https://leetcode.com/problems/count-subarrays-with-fixed-bounds/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)]()

---

## 🧩 Problem Statement  

You are given an integer array `nums` and two integers `minK` and `maxK`.

A **fixed-bound subarray** of `nums` is a subarray that satisfies the following conditions:
- The minimum value in the subarray is equal to `minK`.
- The maximum value in the subarray is equal to `maxK`.

Return the number of fixed-bound subarrays.

A **subarray** is a contiguous part of an array.

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `nums = [1,3,5,2,7,5], minK = 1, maxK = 5` | `2` |

**Explanation:**  
The fixed-bound subarrays are:  
- `[1,3,5]`  
- `[1,3,5,2]`

---

### Example 2  

| Input | Output |
|-------|--------|
| `nums = [1,1,1,1], minK = 1, maxK = 1` | `10` |

**Explanation:**  
Every subarray is a fixed-bound subarray. Total subarrays = 10.

---

## ✅ Constraints  

- `2 <= nums.length <= 10^5`  
- `1 <= nums[i], minK, maxK <= 10^6`

---

## 💡 Approach  

### 🔄 Sliding Window Tracking  

1. Use three pointers:
   - `j` — latest index where an invalid number (out of `[minK, maxK]` range) was found.
   - `prevMinKIndex` — latest index where `minK` appeared.
   - `prevMaxKIndex` — latest index where `maxK` appeared.
2. For each `i`, count the number of valid subarrays ending at `i` based on the minimal of `prevMinKIndex` and `prevMaxKIndex`.
3. If an invalid element occurs, reset `j`.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time**       | `O(n)` — Single pass through the array |
| **Space**      | `O(1)` — Constant extra space |

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.countSubarrays(new int[]{1,3,5,2,7,5}, 1, 5)); // 2
    System.out.println(sol.countSubarrays(new int[]{1,1,1,1}, 1, 1));     // 10
}
```

---

## ✨ Possible Improvements  

- Could explore segment trees or RMQ if asked for range minimum/maximum queries in variations.

---

## 📚 Topics & Hint  

**Topics:** Array • Sliding Window  

**Hint:**  
> Keep track of the last position of minK and maxK to efficiently count valid subarrays ending at each index.

---