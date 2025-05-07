# 3341. Find Minimum Time to Reach Last Room | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-3341.%20Find%20Minimum%20Time%20to%20Reach%20Last%20Room-blue)](https://leetcode.com/problems/find-minimum-time-to-reach-last-room/)
[![Language](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

You are in a dungeon with rooms arranged in a 2D grid. Each cell `(i, j)` in the grid represents a room and contains the minimum time `moveTime[i][j]` at which you are allowed to enter that room.

You start at `(0, 0)` at time `0` and can move to **adjacent** rooms (up, down, left, right). Each move takes **1 second**. However, you **cannot enter** a room before its `moveTime`.

Return the **minimum** time to reach the bottom-right cell `(n - 1, m - 1)`.

---

## 🧠 Approach

This is a **shortest path** problem on a grid with **time constraints**, where:

* You can only enter a room at or **after** `moveTime[i][j]`.
* Movement takes 1 second.
* Some rooms may delay you if you arrive early.

We'll use **Dijkstra’s Algorithm** with a priority queue:

* Each entry in the queue is `(time, x, y)`.
* When moving to a neighbor, you **wait** if you arrive too early.

---

## 🔍 Complexity

| Type  | Complexity              |
| ----- | ----------------------- |
| Time  | `O(n * m * log(n * m))` |
| Space | `O(n * m)`              |

---

## ✅ Constraints

* `2 <= n, m <= 50`
* `0 <= moveTime[i][j] <= 10^9`

```
---

## 🧪 Examples

### Example 1

**Input:** `[[0,4],[4,4]]`
**Output:** `6`

```
0 → wait until 4 → move to (1,0) at 4 → (1,1) at 5
```

### Example 2

**Input:** `[[0,0,0],[0,0,0]]`
**Output:** `3`

### Example 3

**Input:** `[[0,1],[1,2]]`
**Output:** `3`

---

## 🧵 Related Topics

* Graph
* Dijkstra's Algorithm
* Matrix Traversal
* Priority Queue
