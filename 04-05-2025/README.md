# 1128: Number of Equivalent Domino Pairs


[![LeetCode Problem](https://img.shields.io/badge/LeetCode-1128.%20Number%20of%20Equivalent%20Domino%20Pairs-blue)](https://leetcode.com/problems/number-of-equivalent-domino-pairs/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)]()

---

## 🧩 Problem Statement

You are given a list of dominoes. Each domino is represented as a pair of numbers: `dominoes[i] = [a, b]`.
Two dominoes are considered **equivalent** if one can be rotated to equal the other, i.e.:

* `[a, b]` is equivalent to `[c, d]` **if and only if**:

  * `(a == c && b == d)` **or**
  * `(a == d && b == c)`

Return the number of pairs `(i, j)` such that:

* `0 <= i < j < dominoes.length`, and
* `dominoes[i]` is equivalent to `dominoes[j]`.

---

## 🧠 Examples

### Example 1

| Input                       | Output |
| --------------------------- | ------ |
| `[[1,2],[2,1],[3,4],[5,6]]` | `1`    |

📝 Explanation: Only the first two dominoes are equivalent.

---

### Example 2

| Input                             | Output |
| --------------------------------- | ------ |
| `[[1,2],[1,2],[1,1],[1,2],[2,2]]` | `3`    |

📝 Explanation: The equivalent pairs are (0,1), (0,3), and (1,3).

---

## ✅ Constraints

* `1 <= dominoes.length <= 4 * 10⁴`
* `dominoes[i].length == 2`
* `1 <= dominoes[i][j] <= 9`

---

## 💡 Approach

### 🔹 HashMap + Normalization

To efficiently count equivalent domino pairs:

1. **Normalize each domino**: always store as `[min(a, b), max(a, b)]` so that `[1,2]` and `[2,1]` are treated the same.
2. Use a **hash map** (or an array of size 100 for fast lookup) to count occurrences of each unique normalized domino.
3. For each new domino:

   * If it matches `n` previous dominoes, it can form `n` new pairs.
   * Add `n` to the total count.
   * Then increment the count of that domino.

---

## 🔄 Complexity Analysis

|           | Value                                        |
| --------- | -------------------------------------------- |
| **Time**  | `O(n)`                                       |
| **Space** | `O(1)` (since value range is bounded by 1-9) |

---

## 📚 Topics & Hints

**Topics:** Array • Hash Table • Counting

**Hint 1:**
For each domino `j`, find how many previously seen dominoes are equivalent.

**Hint 2:**
Use a hashmap or array to keep track of previously seen normalized domino values.

---
