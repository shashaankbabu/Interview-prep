package LeetCode;
import java.util.*;

class MergeIntervals {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <= 1) return intervals;
        Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));

        List<int[]> output = new ArrayList<>();
        int[] current = intervals[0];
        output.add(current);

        for(int[] interval : intervals) {
            int currentEnd = current[1];
            int nextBegin = interval[0];
            int nextEnd = interval[1];

            if(currentEnd >= nextBegin) current[1] = Math.max(currentEnd, nextEnd);
            else {
                current = interval;
                output.add(current);
            }
        }

        return output.toArray(new int[output.size()][]);
    }
}