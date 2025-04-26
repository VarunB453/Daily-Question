/*Solution 1: */

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


/*Solution 2: */
/*
class Solution {
  public long countFairPairs(int[] nums, int lower, int upper) {
      // Step 1: Sort the array in ascending order
      Arrays.sort(nums);
      long count = 0;

      // Step 2: Iterate through each element in the array
      for (int i = 0; i < nums.length; i++) {
          int left = findLowerBound(nums, i + 1, nums.length - 1, lower - nums[i]);
          int right = findUpperBound(nums, i + 1, nums.length - 1, upper - nums[i]);

          // Step 3: Add the count of valid pairs for this element
          count += (right - left + 1); // Number of valid pairs
      }

      return count;
  }

  // Helper function to find the lower bound
  private int findLowerBound(int[] nums, int start, int end, int target) {
      while (start <= end) {
          int mid = (start + end) / 2;
          if (nums[mid] >= target) {
              end = mid - 1;
          } else {
              start = mid + 1;
          }
      }
      return start;
  }

  // Helper function to find the upper bound
  private int findUpperBound(int[] nums, int start, int end, int target) {
      while (start <= end) {
          int mid = (start + end) / 2;
          if (nums[mid] <= target) {
              start = mid + 1;
          } else {
              end = mid - 1;
          }
      }
      return end;
  }
}
  */