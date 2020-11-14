package BinarySearch;

import java.util.*;

class LongDistance {
    public int[] solve(int[] lst) {
        List<Integer> list = new ArrayList();
        for(int i = lst.length - 1; i >= 0; i--) {
            int index = insert(lst[i], list);
            list.add(index, lst[i]);
            lst[i] = index;
        }
        return lst;
    }

    public int insert(int n, List<Integer> list) {
        int left = 0, right = list.size() - 1;
        while(left <= right) {
            int mid = left + (right-left) / 2;
            if(list.get(mid) >= n) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}