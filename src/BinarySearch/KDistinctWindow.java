package BinarySearch;

import java.util.*;

class KDistinctWindow {
    public int[] solve(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<=nums.length-k; i++) {
            Set<Integer> set = new HashSet<>();
            for(int j=i; j<i+k; j++) {
                set.add(nums[j]);
            }
            list.add(set.size());
        }
        int[] arr = new int[list.size()];
        for(int i=0; i<list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}