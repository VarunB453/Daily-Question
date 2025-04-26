# 3272. Find the Count of Good Integers | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-3272.%20Find%20the%20Count%20of%20Good%20Integers-blue)](https://leetcode.com/problems/find-the-count-of-good-integers/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)]()

---

## 🧩 Problem Statement

You are given two positive integers `n` and `k`.  

An integer `x` is called **k-palindromic** if:

1. `x` is a palindrome.
2. `x` is divisible by `k`.

An integer is called **good** if its digits can be rearranged to form a **k-palindromic** integer. For example, for `k = 2`, `2020` can be rearranged to form the k-palindromic integer `2002`, whereas `1010` cannot be rearranged to form a k-palindromic integer.

Return the count of **good integers** containing exactly `n` digits.

Note that any integer must not have leading zeros, neither before nor after rearrangement. For example, `1010` cannot be rearranged to form `101`.

---

## 🧠 Approach

### Plan

1. **Understand Palindrome Structure**: A palindrome reads the same forward and backward, which means that for a given `n`, the first half of the digits determines the second half of the number. This is important when considering rearranging digits to form a k-palindromic integer.

2. **Divisibility by `k`**: In addition to being a palindrome, the number must also be divisible by `k`.

3. **Permutations**: We will generate permutations of the digits that could form the palindrome and check which of these permutations are divisible by `k`.

4. **Factorial Calculations**: The solution leverages factorials to count valid permutations of digits for efficiency. Factorial values are precomputed for quick access.

### Steps

- Calculate factorials up to `n` to compute the number of ways digits can be rearranged.
- Use the structure of a palindrome to generate possible numbers.
- Check the divisibility condition by `k`.
- Count the valid good integers and return the result.

### Time Complexity
- **Time Complexity**: `O(n!)` for generating permutations of digits and checking divisibility.
- **Space Complexity**: `O(n)` for storing intermediate results.

---

## 🧪 Example

### Example 1:

**Input:**  
`n = 3`, `k = 5`

**Output:**  
`27`

**Explanation:**

Some of the good integers are:

- `551` because it can be rearranged to form `515`.
- `525` because it is already k-palindromic.

---

### Example 2:

**Input:**  
`n = 1`, `k = 4`

**Output:**  
`2`

**Explanation:**

The two good integers are `4` and `8`.

---

### Example 3:

**Input:**  
`n = 5`, `k = 6`

**Output:**  
`2468`

---

## 🔍 Complexity Analysis

- **Time Complexity**: `O(n!)`  
  The most computationally expensive operation is generating and checking permutations of digits that could form valid numbers. This is factorial in nature, so we need to account for the number of permutations for each length `n`.

- **Space Complexity**: `O(n)`  
  We use extra space for storing factorials and intermediate calculations.

---

## 🧪 Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.countGoodIntegers(3, 5)); // Output: 27
    System.out.println(sol.countGoodIntegers(1, 4)); // Output: 2
    System.out.println(sol.countGoodIntegers(5, 6)); // Output: 2468
}
```

---

## ✨ Possible Improvements

- Consider optimizing the permutation generation to avoid unnecessary checks for duplicate numbers.
- Extend the solution to handle larger values of `n` by improving the efficiency of the palindrome and divisibility checks.

