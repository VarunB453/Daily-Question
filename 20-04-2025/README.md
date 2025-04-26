# 2563. Count the Number of Fair Pairs | Java Solution

[![LeetCode Problem](https://img.shields.io/badge/LeetCode-2563.%20Count%20the%20Number%20of%20Fair%20Pairs-blue)](https://leetcode.com/problems/count-the-number-of-fair-pairs/)
[![Java](https://img.shields.io/badge/Language-Java-orange)](https://www.java.com)
[![Optimal Solution](https://img.shields.io/badge/Solution-Optimal-brightgreen)]()

## Problem Statement

Given a **0-indexed** integer array `nums` of size `n`, and two integers `lower` and `upper`, return *the number of fair pairs*.

A pair `(i, j)` is **fair** if:
- `0 <= i < j < n`, and
- `lower <= nums[i] + nums[j] <= upper`

---

## Example 1

**Input:**  
`nums = [0,1,7,4,4,5]`, `lower = 3`, `upper = 6`  
**Output:**  
`6`

**Explanation:**  
Valid fair pairs are:
- (0,3), (0,4), (0,5), (1,3), (1,4), (1,5)

---

## Example 2

**Input:**  
`nums = [1,7,9,2,5]`, `lower = 11`, `upper = 11`  
**Output:**  
`1`

**Explanation:**  
Only valid fair pair: (2,3)

---

## Constraints

- `1 <= nums.length <= 10⁵`
- `-10⁹ <= nums[i] <= 10⁹`
- `-10⁹ <= lower <= upper <= 10⁹`

---

## Approach

### ✅ Solution 1: Binary Search

1. Sort the array.
2. For each index `i`, find the range `[lower - nums[i], upper - nums[i]]` using binary search.
3. Use two helper functions to find the lower and upper bounds within this range.

```java
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count = 0;
        for (int i = 0; i < nums.length; i++) {
            int left = findLowerBound(nums, i + 1, nums.length - 1, lower - nums[i]);
            int right = findUpperBound(nums, i + 1, nums.length - 1, upper - nums[i]);
            count += (right - left + 1);
        }
        return count;
    }

    private int findLowerBound(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] >= target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }

    private int findUpperBound(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] <= target) start = mid + 1;
            else end = mid - 1;
        }
        return end;
    }
}
```

### ✅ Solution 2: Two Pointers (Optimized)

1. Sort the array.
2. Use two pointers to count pairs with sums ≤ `upper` and ≤ `lower - 1`.
3. The number of fair pairs is the difference between the two counts.

```java
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return countLess(nums, upper) - countLess(nums, lower - 1);
    }

    private long countLess(int[] nums, int sum) {
        long res = 0;
        for (int i = 0, j = nums.length - 1; i < j; ++i) {
            while (i < j && nums[i] + nums[j] > sum)
                --j;
            res += j - i;
        }
        return res;
    }
}
```

---

## Complexity Analysis

| Approach        | Time Complexity | Space Complexity |
|----------------|-----------------|------------------|
| Binary Search  | `O(n log n)`    | `O(1)` (in-place) |
| Two Pointers   | `O(n log n)`    | `O(1)` (in-place) |

---

## Tags

`Array`, `Two Pointers`, `Binary Search`, `Sorting`

---