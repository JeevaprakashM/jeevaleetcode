class Solution {
    public int maximizeSum(int[] nums, int k) {
                int max = nums[0];
        for (int m: nums)
            max = Math.max(m, max);
        int sum = max++;
        for (int i = 0; i < k - 1; i++)
            sum += max++;
        return sum;
    }
}