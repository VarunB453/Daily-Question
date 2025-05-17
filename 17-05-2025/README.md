# 75. Sort Colors | Java Solution

  


---

🧩 Problem Statement

Given an array nums with n objects colored red (0), white (1), or blue (2), sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

You must solve this problem without using any built-in sort function.


---

🧠 Examples

Example 1

Example 2


---

✅ Constraints

1 <= nums.length <= 300

nums[i] is 0, 1, or 2.



---

💡 Approach

🔁 Dutch National Flag Algorithm

1. Use three pointers:

low to mark the boundary of 0s,

mid to traverse the array,

high to mark the boundary of 2s.



2. Traverse and sort in one pass:

If nums[mid] == 0: swap with low, increment both.

If nums[mid] == 1: just move mid forward.

If nums[mid] == 2: swap with high, decrement high.




> This method efficiently partitions the array in a single pass.

---

📚 Topics & Hint

Topics: Array, Two Pointers, Sorting

Hint:

> Think of partitioning the array into three parts: <br> [0s | 1s | 2s] using in-place swaps and pointer management.

