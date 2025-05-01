# 2071. Maximum Number of Tasks You Can Assign | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2071.%20Maximum%20Number%20of%20Tasks%20You%20Can%20Assign-blue)](https://leetcode.com/problems/maximum-number-of-tasks-you-can-assign/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)]()

---

## 🧩 Problem Statement

You are given two integer arrays `tasks` and `workers`, where `tasks[i]` is the strength requirement for the i-th task and `workers[j]` is the strength of the j-th worker. Each worker can complete **at most one** task and only if their strength is **greater than or equal to** the task requirement.

You also have `pills` magical pills. Each pill increases a worker's strength by `strength` **once**. A worker can take **at most one** pill.

Return the **maximum number of tasks** that can be completed.

---

## 🧠 Examples

### Example 1  

| Input | Output |
|-------|--------|
| `tasks = [3,2,1]`<br>`workers = [0,3,3]`<br>`pills = 1`<br>`strength = 1` | `3` |

**Explanation:**  
- Give the pill to worker 0 → strength = 0 + 1 = 1  
- Assign worker 0 to task 2 (1 >= 1)  
- Assign worker 1 to task 1 (3 >= 2)  
- Assign worker 2 to task 0 (3 >= 3)

### Example 2  

| Input | Output |
|-------|--------|
| `tasks = [5,4]`<br>`workers = [0,0,0]`<br>`pills = 1`<br>`strength = 5` | `1` |

### Example 3  

| Input | Output |
|-------|--------|
| `tasks = [10,15,30]`<br>`workers = [0,10,10,10,10]`<br>`pills = 3`<br>`strength = 10` | `2` |

---

## ✅ Constraints

- `1 <= tasks.length, workers.length <= 5 * 10⁴`
- `0 <= pills <= workers.length`
- `0 <= tasks[i], workers[j], strength <= 10⁹`

---

## 💡 Approach

### 🔍 Binary Search + Greedy + Priority Queue

We use **binary search** on the number of tasks we can assign. For a given `k` tasks:

1. Sort `tasks` and `workers`.
2. Try assigning the hardest `k` tasks to the strongest `k` workers.
3. Use a **greedy strategy with a multiset or deque**:
   - Try to match without a pill.
   - Otherwise, use a pill on a weak worker if possible.
   - Fallback: if no way to assign, reduce `k`.

---

## 🔄 Complexity Analysis

| Time | Space |
|------|-------|
| `O((n + m) * log(max))` | `O(n + m)` |

---

## 📚 Topics & Hint

**Topics:** Array • Binary Search • Greedy • Sorting • Queue

**Hint:**  
> Think about how many tasks you can assign by simulating a greedy assignment from hardest to easiest task, using binary search to find the maximum valid number.

---
