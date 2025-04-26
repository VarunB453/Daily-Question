# 🎯 LeetCode 2537: Count the Number of Good Subarrays

> 🚀 Difficulty: Medium  
> 🧠 Data Structure Magic: HashMap + Sliding Window

---

## 📜 Problem

Given an integer array `nums` and an integer `k`, you are tasked with counting how many subarrays are **good**. A subarray is **good** if it contains at least `k` pairs of indices `(i, j)` such that `i < j` and `arr[i] == arr[j]`.

### **Subarray**: A contiguous non-empty sequence of elements within an array.

---

## 💡 Example

```txt
nums = [1,1,1,1,1], k = 10
Output: 1
Explanation: The only good subarray is the array nums itself.
```

```txt
nums = [3,1,4,3,2,2,4], k = 2
Output: 4
Explanation: There are 4 different good subarrays:
- [3,1,4,3,2,2] that has 2 pairs.
- [3,1,4,3,2,2,4] that has 3 pairs.
- [1,4,3,2,2,4] that has 2 pairs.
- [4,3,2,2,4] that has 2 pairs.
```

---

## 🧠 Approach

### 🪄 Step 1: Use a Sliding Window Approach
- The problem requires counting subarrays, so we can use a sliding window (two-pointer technique) to efficiently explore all potential subarrays. The idea is to expand the window as much as possible while maintaining the constraint of having at least `k` pairs of equal elements.

### 🪄 Step 2: Track Pair Counts with a HashMap
- We use a HashMap to store the frequency of each element within the current window. As we expand the window, we keep track of how many valid pairs (where `arr[i] == arr[j]` and `i < j`) we have by adding to the `pairCount` as elements repeat within the window.

### 🪄 Step 3: Count Valid Subarrays
- If the number of pairs in the current window exceeds or meets `k`, then all subarrays starting from `left` to `right` are valid. This is because we can incrementally reduce the window size from the left side without violating the condition.

---

### Explanation:

1. **Sliding Window**: We use two pointers, `left` and `right`, to represent the current subarray.
2. **Frequency Map**: We maintain a frequency map `freq` to track the count of each number in the current window.
3. **Pair Counting**: As we move the `right` pointer, we incrementally update the number of pairs by adding the current frequency of the number.
4. **Valid Subarrays**: When the `pairCount` becomes greater than or equal to `k`, all subarrays starting from `left` to `right` are valid. We count these subarrays and adjust the `left` pointer to explore new windows.

---

## ⏱ Time Complexity

- **Iterating over the array**: `O(n)` where `n` is the length of the `nums` array.
- **Operations with HashMap**: Each operation (insert and update) is `O(1)`, so the overall complexity remains linear.
  
### ➤ **Total Time: `O(n)`**

---

## 💾 Space Complexity

- **HashMap for frequencies**: `O(n)` in the worst case.
  
### ➤ **Total Space: `O(n)`**

---

## 🔥 Summary

- This problem uses a sliding window technique with a HashMap to efficiently count subarrays that satisfy the pair condition.
- The key insight is that once the pair count reaches the threshold `k`, we can count all valid subarrays starting from the current left pointer to the right pointer.
- The approach runs in linear time, making it suitable for large inputs.

---