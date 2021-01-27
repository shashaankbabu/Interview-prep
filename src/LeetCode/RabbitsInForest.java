package LeetCode;
import java.util.*;

class RabbitsInForest {
    public int numRabbits(int[] arr) {
        if (arr == null || arr.length == 0) return 0;

        int rabbits = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (i == 0) {
                rabbits++;
                continue;
            }
            if (!map.containsKey(i)) {
                rabbits += i + 1;
                map.put(i, i);
            } else {
                map.put(i, map.get(i) - 1);
                if (map.get(i) == 0) {
                    map.remove(i);
                }
            }
        }

        return rabbits;
    }
}