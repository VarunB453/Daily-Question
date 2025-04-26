# 1534. Count Good Triplets | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-1534.%20Count%20Good%20Triplets-blue)](https://leetcode.com/problems/count-good-triplets/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement

Given an integer array `arr`, and three integers `a`, `b`, and `c`, return the number of **good triplets**.

A triplet `(arr[i], arr[j], arr[k])` is good if:

- `0 <= i < j < k < arr.length`
- `|arr[i] - arr[j]| <= a`
- `|arr[j] - arr[k]| <= b`
- `|arr[i] - arr[k]| <= c`

Where `|x|` represents the **absolute value** of `x`.

---

## 🧠 Approach

### Brute-force with Pruning

- Iterate over all combinations of triplets `(i, j, k)` where `i < j < k`.
- For each triplet, check if it satisfies the 3 conditions.
- Use `continue` to skip unnecessary iterations early for performance.

---

## 🔍 Example Walkthroughs

### Example 1:
**Input:** `arr = [3,0,1,1,9,7], a = 7, b = 2, c = 3`  
**Output:** `4`  
**Explanation:** Good triplets are:  
- (3,0,1)  
- (3,0,1)  
- (3,1,1)  
- (0,1,1)

---

### Example 2:
**Input:** `arr = [1,1,2,2,3], a = 0, b = 0, c = 1`  
**Output:** `0`  
**Explanation:** No triplet satisfies all conditions.

---

## ✅ Complexity Analysis

- **Time Complexity:** `O(n³)` in the worst case (but optimized with early `continue`)
- **Space Complexity:** `O(1)`

---

## ✨ Highlights

- Uses nested loops with early pruning to improve efficiency
- Straightforward and readable implementation in Java
- Works well for small input sizes (up to 100 elements)

---

## 🧪 Test Case

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    int[] arr1 = {3,0,1,1,9,7};
    System.out.println(sol.countGoodTriplets(arr1, 7, 2, 3)); // Output: 4

    int[] arr2 = {1,1,2,2,3};
    System.out.println(sol.countGoodTriplets(arr2, 0, 0, 1)); // Output: 0
}
```

---

## 📎 Related Topics

- Arrays
- Brute Force
- Combinatorics

---