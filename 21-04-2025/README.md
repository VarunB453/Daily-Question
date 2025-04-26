# 781. Rabbits in Forest | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-781.%20Rabbits%20in%20Forest-blue)](https://leetcode.com/problems/rabbits-in-forest/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com/)
[![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)]()

---

## 🧩 Problem Statement

There is a forest with an unknown number of rabbits. We asked `n` rabbits:  
**"How many rabbits have the same color as you?"**  

We collect their responses in an array `answers`, where `answers[i]` is the response of the `i-th` rabbit.

Each rabbit’s answer `x` means there are **x other rabbits** (besides itself) with the same color. Our goal is to **minimize the total number of rabbits** that could exist in the forest while being consistent with the given answers.

---

## 🧠 Approach

### Plan

- Use a HashMap to count how many rabbits gave the same answer.
- For each unique answer `x`, the group size is `x + 1`.
- If `count` rabbits gave the same answer `x`, then the minimum number of rabbits required to satisfy all of them is:
  
  \[
  \left\lceil \frac{count}{x+1} \right\rceil \times (x+1)
  \]

  This is because multiple rabbits may be referring to the **same group** of `(x + 1)` rabbits.

---

## 🔍 Complexity Analysis

- **Time Complexity:** `O(n)`  
  We traverse the array once and iterate through the HashMap once.
  
- **Space Complexity:** `O(n)`  
  In the worst case, all answers are different, and we store them in the map.

---

## 🧪 Examples

### Example 1:

**Input:**  
`answers = [1,1,2]`  
**Output:** `5`  
**Explanation:**  
- Two rabbits say "1" → they can form a group of 2 rabbits (1 + itself).  
- One rabbit says "2" → needs a group of 3 rabbits.  
- Minimum total = 2 (for the two “1”s) + 3 (for the “2”) = **5**.

---

### Example 2:

**Input:**  
`answers = [10,10,10]`  
**Output:** `11`  
**Explanation:**  
- Each says "10", meaning each belongs to a group of 11 rabbits.
- 3 rabbits can be in one such group of 11, and the other 8 rabbits are implied.

---

## 🧪 Test Cases

```java
public static void main(String[] args) {
    Solution sol = new Solution();

    System.out.println(sol.numRabbits(new int[]{1, 1, 2}));       // Output: 5
    System.out.println(sol.numRabbits(new int[]{10, 10, 10}));    // Output: 11
    System.out.println(sol.numRabbits(new int[]{0, 0, 1, 1, 1})); // Output: 6
}
```

---

## ✨ Possible Improvements

- The current solution is optimal and greedy by design.
- Could be extended to track actual groupings if needed for visualization or more detailed reasoning.

---