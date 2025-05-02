# 838. Push Dominoes | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-838.%20Push%20Dominoes-blue)](https://leetcode.com/problems/push-dominoes/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

There are `n` dominoes in a row, initially standing upright. Some dominoes are pushed either to the left ('L') or right ('R'), and the rest remain upright ('.').

Every second:

* A domino falling left pushes its left neighbor.
* A domino falling right pushes its right neighbor.
* If a domino is pushed from both sides at the same time, it remains upright.

You are given a string `dominoes` of length `n` representing the initial state. Return the **final state** as a string after all the dominoes have fallen accordingly.

---

## 🧠 Examples

### Example 1

| Input               | Output   |
| ------------------- | -------- |
| `dominoes = "RR.L"` | `"RR.L"` |

**Explanation:**

* The first domino falls to the right.
* The third domino falls to the left.
* They do not affect each other due to the dot in between.

---

### Example 2

| Input                | Output             |
| -------------------- | ------------------ |
| `" .L.R...LR..L.. "` | `"LL.RR.LLRRLL.."` |

---

## ✅ Constraints

* `1 <= dominoes.length <= 10⁵`
* `dominoes[i]` is either `'L'`, `'R'`, or `'.'`

---

## 💡 Approach

We simulate the **force** applied to each domino:

1. Traverse left to right to apply rightward forces (`R`), decreasing by 1 as we move.
2. Traverse right to left to apply leftward forces (`L`), also decreasing by 1.
3. The net force at each position determines the final direction:

   * Positive → `'R'`
   * Negative → `'L'`
   * Zero → `'.'`

---

## 🔍 Complexity Analysis

| Complexity | Value  |
| ---------- | ------ |
| **Time**   | `O(n)` |
| **Space**  | `O(n)` |

---

## 📚 Topics & Hint

**Topics:** String • Two Pointers • Simulation

**Hint:**

> Think of "forces" traveling from each pushed domino and accumulating on the dots. Use two passes to simulate force propagation.

---
