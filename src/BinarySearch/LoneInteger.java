package BinarySearch;

import java.util.*;

class LoneInteger {
    public int solve(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-2; i+=3) {
            if(nums[i] != nums[i+1]) return nums[i];
        }
        return nums[nums.length-1];
    }
}