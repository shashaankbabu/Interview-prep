package BinarySearch;

import java.util.*;

class MergeKSortedList {
    public int[] solve(int[][] lists) {
        List<Integer> minHeap = new ArrayList<>();
        for(int i=0;i<lists.length; i++) {
            for(int j=0; j<lists[i].length; j++) {
                minHeap.add(lists[i][j]);
            }
        }

        Collections.sort(minHeap);
        int[] arr = new int[minHeap.size()];
        for(int k=0; k<minHeap.size(); k++) {
            arr[k] = minHeap.get(k);
        }
        return arr;
    }
}