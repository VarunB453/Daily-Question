# 1399. Count Largest Group | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-1399.%20Count%20Largest%20Group-blue)](https://leetcode.com/problems/count-largest-group/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)]()

---

## 🧩 Problem Statement  

You are given an integer `n`.

Every integer `x` in the range **1 ≤ x ≤ n** is placed into a bucket keyed by the **sum of its digits**.  
For example, `x = 346` goes to bucket `3+4+6 = 13`.

A **group** is the set of integers that share the same digit‑sum key.  
Return the **number of groups that share the largest size** (i.e., how many buckets tie for being the biggest).

---

## 🧠 Examples  

### Example 1  

| Input | Output |
|-------|--------|
| `n = 13` | `4` |

Explanation:  

```
Buckets
Sum  Members
 1   [1,10]
 2   [2,11]
 3   [3,12]
 4   [4,13]
 5   [5]
 6   [6]
 7   [7]
 8   [8]
 9   [9]
```

The largest bucket size is 2, and **4** buckets have that size.

---

### Example 2  

| Input | Output |
|-------|--------|
| `n = 2` | `2` |

Both `[1]` and `[2]` are of size 1 ⇒ answer = 2.

---

## ✅ Constraints  

- `1 ≤ n ≤ 10⁴`

---

## 💡 Approach  

1. **Digit‑Sum Bucketing**  
   - Iterate `x` from 1 to `n`.  
   - Compute `digitSum(x)` by repeatedly taking `% 10`.  
   - Store bucket size in a `HashMap<Integer,Integer>` keyed by the digit sum.

2. **Track Largest Size on the Fly**  
   - After incrementing a bucket, update `maxSize`.

3. **Second Pass to Count Ties**  
   - Count how many buckets have size `maxSize`.

Because the maximum digit sum for `n ≤ 10 000` is `9 + 9 + 9 + 9 = 36`, the map stays tiny.

---

## 🔍 Complexity Analysis  

|                | Value |
|----------------|-------|
| **Time** | `O(n · log₁₀(n))` → each number is visited once and digit extraction is constant time |
| **Space** | `O(1)` → at most 37 buckets |

---

## 🧪 Quick Test  

```java
public static void main(String[] args) {
    Solution sol = new Solution();
    System.out.println(sol.countLargestGroup(13)); // 4
    System.out.println(sol.countLargestGroup(2));  // 2
    System.out.println(sol.countLargestGroup(24)); // 3
}
```

---

## ✨ Possible Improvements  

- Pre‑compute digit sums using DP (`sum(i) = sum(i/10) + i%10`) for further micro‑optimisation.
- For other bases, generalise `digitSum` accordingly.

---

## 📚 Topics & Hint  

**Topics:** Hash Table • Math  

**Hint:**  
> Count the digit sum for each integer, record bucket sizes, track the maximum size, then count how many buckets reach that maximum.
