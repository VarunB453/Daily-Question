# 790. Domino and Tromino Tiling



[![LeetCode Problem](https://img.shields.io/badge/LeetCode-790.%20Domino%20and%20Tromino%20Tiling-blue)](https://leetcode.com/problems/domino-and-tromino-tiling/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

You are given two types of tiles: a **2×1 domino** and an **"L" shaped tromino**. You may rotate these tiles.

Given an integer `n`, return **the number of ways to tile a 2 × n board**. Since the answer may be very large, return it modulo `10⁹ + 7`.

In a tiling, every square must be covered by a tile. Two tilings are different if and only if there are two 4-directionally adjacent cells on the board such that exactly one of the tilings has both squares occupied by a tile.

---

## 🧠 Examples

### Example 1

![image](https://github.com/user-attachments/assets/1f4fd771-081a-470b-a0f8-4cbd30988716)


| Input   | Output |
| ------- | ------ |
| `n = 3` | `5`    |

**Explanation:**
The five tiling ways are shown using domino and tromino rotations.

### Example 2

| Input   | Output |
| ------- | ------ |
| `n = 1` | `1`    |

---

## ✅ Constraints

* `1 <= n <= 1000`

---

## 💡 Approach

### 🧮 Dynamic Programming

Let:

* `dp[n]` be the number of ways to tile a 2 × n board.
* Base cases:

  * `dp[0] = 1` (empty board)
  * `dp[1] = 1` (1 domino)
  * `dp[2] = 2` (2 vertical dominoes, or 2 horizontal)

The recurrence is:

```text
dp[n] = dp[n-1] + dp[n-2] + 2 * sum_{k=0}^{n-3} dp[k]
```

This simplifies with a running sum of the last few values:

```java
dp[n] = 2 * dp[n-1] + dp[n-3] - dp[n-4]
```

Or an easier recurrence form:

```text
dp[n] = dp[n-1] + dp[n-2] + 2 * dp[n-3]
```
---

## 🔍 Complexity Analysis

|           | Value |
| --------- | ----- |
| **Time**  | O(n)  |
| **Space** | O(n)  |

---

## 🧪 Quick Test

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.numTilings(3)); // 5
    System.out.println(sol.numTilings(1)); // 1
    System.out.println(sol.numTilings(5)); // 24
}
```

---

## 📚 Topics

**Topics:** Dynamic Programming • Combinatorics
