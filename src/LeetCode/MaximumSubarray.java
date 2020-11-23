package LeetCode;

class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) return 0;
        int current = nums[0];
        int max = nums[0];

        for(int i=1; i<nums.length; i++) {
            current = Math.max(nums[i], nums[i] + current);
            if(current > max) max = current;
        }
        return max;
    }
}