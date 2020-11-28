package LeetCode;
import java.util.*;

class KthLargestElementInArray {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for(int num : nums) {
            heap.offer(num);
            if(heap.size() > k) heap.poll();
        }
        return heap.peek();
    }
}

/*
if(nums.length < 1) return -1;
Arrays.sort(nums);
return nums[nums.length - k]
 */