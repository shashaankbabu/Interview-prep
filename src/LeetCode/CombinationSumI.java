package LeetCode;
import java.util.*;

class CombinationSumI {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, 0, target, new ArrayList<>(), result);

        return result;
    }

    public void findCombinations(int[] candidates, int index, int target, List<Integer> current, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for(int i=index; i<candidates.length && target >= candidates[i]; i++) {
            current.add(candidates[i]);
            findCombinations(candidates, i, target - candidates[i], current, result);
            current.remove(current.size() - 1);
        }
    }
}