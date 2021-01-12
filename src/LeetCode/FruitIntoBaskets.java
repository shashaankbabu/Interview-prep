package LeetCode;
import java.util.*;

class FruitIntoBaskets {
    public int totalFruit(int[] tree) {
        if(tree == null || tree.length == 0) return 0;
        int max = 1;
        int i = 0;
        int j = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while(j < tree.length) {
            if(map.size() <= 2) {
                map.put(tree[j], j++);
            }
            if(map.size() > 2) {
                int min = tree.length - 1;
                for(int value : map.values()) {
                    min = Math.min(min, value);
                }

                i = min + 1;
                map.remove(tree[min]);
            }
            max = Math.max(max, j - i);
        }
        return max;
    }
}