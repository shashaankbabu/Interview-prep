package LeetCode;
import java.util.*;

class GroupThePeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> res = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < groupSizes.length; i++) {
            int size = groupSizes[i];
            if (map.containsKey(size)) {
                map.get(size).add(i);
                if (map.get(size).size() == size) {
                    res.add(new ArrayList(map.get(size)));
                    map.remove(size);
                }
            } else {
                List<Integer> curr = new ArrayList<>();
                curr.add(i);
                map.put(size, curr);
                if (map.get(size).size() == size) {
                    res.add(new ArrayList(map.get(size)));
                    map.remove(size);
                }
            }
        }
        return res;
    }
}