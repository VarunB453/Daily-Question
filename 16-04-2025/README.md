# 🎯 LeetCode 2179: Count Good Triplets in an Array

> 🚀 Difficulty: Hard   
> 🤯 Data Structure Magic: Binary Indexed Tree (a.k.a. Fenwick Tree)

---

## 📜 Problem

You're given two arrays `nums1` and `nums2`, both of which are permutations of `[0, 1, ..., n - 1]`. You need to count how many **good triplets (x, y, z)** exist such that:

- Their order in `nums1` is strictly increasing: `pos1[x] < pos1[y] < pos1[z]`
- Their order in `nums2` is also strictly increasing: `pos2[x] < pos2[y] < pos2[z]`

---

## 💡 Example

```txt
nums1 = [2,0,1,3]
nums2 = [0,1,2,3]

Only 1 good triplet: (0, 1, 3)
```

```txt
nums1 = [4,0,1,3,2]
nums2 = [4,1,0,2,3]

Total 4 good triplets: (4,0,3), (4,0,2), (4,1,3), (4,1,2)
```

---

## 🧠 Approach

### 🪄 Step 1: Remap Everything
Use a hashmap to remap values in `nums2` to their positions in `nums1`.  
This creates a new array `mapped[]` where relative order in `nums1` is baked in.

### 🪄 Step 2: Count Left-Side Smaller Values
- For each index `i`, use a Fenwick Tree to count how many values before `i` are **less than** `mapped[i]`.

### 🪄 Step 3: Count Right-Side Larger Values
- Iterate backwards.
- For each index `i`, use another Fenwick Tree to count how many values after `i` are **greater than** `mapped[i]`.

### 🪄 Step 4: Multiply and Conquer
- For each index `i`, the number of good triplets with `mapped[i]` in the middle is:  
  `leftSmaller[i] * rightLarger[i]`

---

## ⏱ Time Complexity

- **Mapping & Preparation**: `O(n)`
- **Each Fenwick Tree operation**: `O(log n)`
- **Total operations**:  
  - Left pass: `O(n log n)`  
  - Right pass: `O(n log n)`  
  - Final pass to count: `O(n)`  

### ➤ **Total Time: `O(n log n)`**

---

## 💾 Space Complexity

- `position` map: `O(n)`
- `mapped`, `leftSmaller`, `rightLarger`: `O(n)`
- Fenwick Trees: `O(n)`

### ➤ **Total Space: `O(n)`**

---

## 🔥 Summary

- This problem is a disguised "count increasing triplets" trick, with a twist of index mapping.
- Fenwick Tree (Binary Indexed Tree) saves the day by giving us fast prefix queries.
- The trickiest part? Understanding that once remapped, it becomes a **1D ordering** problem.

---