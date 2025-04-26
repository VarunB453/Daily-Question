# 2145. Count the Hidden Sequences | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2145.%20Count%20the%20Hidden%20Sequences-blue)](https://leetcode.com/problems/count-the-hidden-sequences/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement

You are given a 0-indexed array of `n` integers called `differences`, representing the **difference** between adjacent elements in a hidden sequence of length `n + 1`. That is:

```
differences[i] = hidden[i + 1] - hidden[i]
```

Additionally, you are given two integers `lower` and `upper`, which define the **inclusive range** of values the hidden sequence can take.

You must return the **number of valid hidden sequences** such that all elements are in `[lower, upper]`.

### Example 1:

**Input:**  
`differences = [1,-3,4]`, `lower = 1`, `upper = 6`  
**Output:** `2`  
**Explanation:** Two valid sequences are `[3, 4, 1, 5]` and `[4, 5, 2, 6]`.

### Example 2:

**Input:**  
`differences = [3,-4,5,1,-2]`, `lower = -4`, `upper = 5`  
**Output:** `4`

### Example 3:

**Input:**  
`differences = [4,-7,2]`, `lower = 3`, `upper = 6`  
**Output:** `0`  

---

## Approach

This problem is best solved using **prefix sums**.

### Key Observations:
- Suppose we fix `hidden[0] = x`. Then every subsequent `hidden[i]` is just the prefix sum of `differences` added to `x`.
- To keep **all** values of the sequence within `[lower, upper]`, the **minimum** and **maximum** values of the prefix sums determine how much room we have for `x`.

### Key Steps:
1. Compute prefix sums from `differences`.
2. Find the **minimum** and **maximum** values of these prefix sums.
3. Let the starting number be `x = hidden[0]`. To ensure all elements are within range:
   - `lower <= x + min_prefix <= x + max_prefix <= upper`
   - Solve for valid `x`:  
     - `x >= lower - min_prefix`  
     - `x <= upper - max_prefix`
4. Total number of valid `x` values is:  
   `max(0, (upper - lower) - (max_prefix - min_prefix) + 1)`

---

## Complexity Analysis

- **Time Complexity:** `O(n)`  
  - We iterate through the array once and compute prefix sum and min/max in linear time.

- **Space Complexity:** `O(n)`  
  - Prefix sum array takes `n + 1` space.

---

## Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.numberOfArrays(new int[]{1, -3, 4}, 1, 6));  // Output: 2
    System.out.println(sol.numberOfArrays(new int[]{3, -4, 5, 1, -2}, -4, 5));  // Output: 4
    System.out.println(sol.numberOfArrays(new int[]{4, -7, 2}, 3, 6));  // Output: 0
}
```

---

## Summary

This problem is a classic **prefix sum + range adjustment** scenario. Instead of reconstructing every sequence, we use range logic to count valid starting points based on prefix behavior. Elegant, fast, and efficient!

---