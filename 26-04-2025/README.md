# 2845. Count of Interesting Subarrays | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2845.%20Count%20of%20Interesting%20Subarrays-blue)](https://leetcode.com/problems/count-of-interesting-subarrays/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

You are given a 0-indexed integer array `nums`, an integer `modulo`, and an integer `k`.

A subarray `nums[l..r]` is considered **interesting** if the following condition holds:

> Let `cnt` be the number of indices `i` in `[l, r]` where `nums[i] % modulo == k`.  
> Then `cnt % modulo == k`.

Return the total count of **interesting** subarrays.

---

## 🧠 Examples

### Example 1:

**Input:**  
`nums = [3, 2, 4], modulo = 2, k = 1`  
**Output:**  
`3`

**Explanation:**  
Interesting subarrays are:
- [3] → count = 1 → 1 % 2 == 1 ✅  
- [3, 2] → count = 1 → 1 % 2 == 1 ✅  
- [3, 2, 4] → count = 1 → 1 % 2 == 1 ✅

---

### Example 2:

**Input:**  
`nums = [3, 1, 9, 6], modulo = 3, k = 0`  
**Output:**  
`2`

**Explanation:**  
Interesting subarrays are:
- [3, 1, 9, 6] → count = 3 → 3 % 3 == 0 ✅  
- [1] → count = 0 → 0 % 3 == 0 ✅

---

## ✅ Constraints

- `1 <= nums.length <= 10⁵`  
- `1 <= nums[i] <= 10⁹`  
- `1 <= modulo <= 10⁹`  
- `0 <= k < modulo`

---

## 💡 Approach

We use **prefix sums** and a **hash map** to efficiently track the number of times a given prefix modulo has appeared.

### 🔑 Key Idea:
Let `prefix` be the count of elements up to index `i` where `nums[i] % modulo == k`, taken modulo `modulo`.

For a subarray to be interesting:
```text
(prefix[i] - prefix[j]) % modulo == k
→ prefix[j] == (prefix[i] - k + modulo) % modulo
```

We count how many times this target value has appeared in the prefix so far using a map.

---

## 🔍 Complexity Analysis

| Complexity | Value |
|------------|--------|
| Time       | `O(n)` — single pass through array |
| Space      | `O(modulo)` — for hashmap tracking prefix counts |

---

## 🧪 Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.countInterestingSubarrays(List.of(3, 2, 4), 2, 1)); // Output: 3
    System.out.println(sol.countInterestingSubarrays(List.of(3, 1, 9, 6), 3, 0)); // Output: 2
    System.out.println(sol.countInterestingSubarrays(List.of(1, 2, 3, 4, 5), 3, 2)); // Custom test
}
```

---

## ✨ Possible Improvements

- Works well for large input sizes due to O(n) complexity.
- Can be adapted for streaming input if needed (sliding window style).
- General pattern useful in prefix sum + modulo based problems.

---