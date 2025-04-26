class Solution {
  public int countCompleteSubarrays(int[] nums) {
    int high = 2000;
    int totalDistinct = Arrays.stream(nums).boxed().collect(Collectors.toSet()).size();
    int ans = 0;
    int distinct = 0;
    int[] count = new int[high + 1];

    int l = 0;
    for (int num : nums) {
      if (++count[num] == 1)
        ++distinct;
      while (distinct == totalDistinct)
        if (--count[nums[l++]] == 0)
          --distinct;
      ans += l;
    }

    return ans;
  }
}