class Solution {
    public long countGood(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;
        long pairCount = 0;
        long result = 0;

        for (int right = 0; right < nums.length; right++) {
            int num = nums[right];
            pairCount += freq.getOrDefault(num, 0);
            freq.put(num, freq.getOrDefault(num, 0) + 1);

            while (pairCount >= k) {
                result += nums.length - right;
                int leftNum = nums[left];
                freq.put(leftNum, freq.get(leftNum) - 1);
                pairCount -= freq.get(leftNum);
                left++;
            }
        }
        return result;
    }
}
