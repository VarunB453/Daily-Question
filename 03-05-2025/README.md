# 1007. Minimum Domino Rotations For Equal Row | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-1007.%20Minimum%20Domino%20Rotations-blue)](https://leetcode.com/problems/minimum-domino-rotations-for-equal-row/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

In a row of dominoes, `tops[i]` and `bottoms[i]` represent the top and bottom halves of the i-th domino.
A domino has two values (between `1` and `6`), and you may rotate any domino to swap its top and bottom.

Return the **minimum number of rotations** so that all the values in **either the top row** or the **bottom row** are the same.
If it's **not possible**, return `-1`.

---

## 🧠 Examples

### Example 1

![image](https://github.com/user-attachments/assets/a9b11638-c68d-4385-8f41-b74c6fa5523b)


| Input                                               | Output |
| --------------------------------------------------- | ------ |
| `tops = [2,1,2,4,2,2]`<br>`bottoms = [5,2,6,2,3,2]` | `2`    |

**Explanation:**
We can rotate the second and fourth dominoes to make the top row all 2s.

---

### Example 2

| Input                                           | Output |
| ----------------------------------------------- | ------ |
| `tops = [3,5,1,2,3]`<br>`bottoms = [3,6,3,3,4]` | `-1`   |

**Explanation:**
No rotation strategy can make all the top or bottom values the same.

---

## ✅ Constraints

* `2 <= tops.length <= 2 * 10⁴`
* `bottoms.length == tops.length`
* `1 <= tops[i], bottoms[i] <= 6`

---

## 💡 Approach

To make all values in the top or bottom row the same, the only possible candidates are `tops[0]` or `bottoms[0]`.
We check if it's possible to make all elements in tops or bottoms equal to that value.

We evaluate:

* Number of rotations needed to make all values in `tops` equal to candidate
* Number of rotations needed to make all values in `bottoms` equal to candidate

Return the **minimum** of these, or `-1` if not possible.

---

## 🔍 Complexity Analysis

| Complexity | Value                            |
| ---------- | -------------------------------- |
| Time       | `O(n)` where `n` is array length |
| Space      | `O(1)` — constant space          |

---

## 📚 Topics

**Array** • **Greedy**

---
