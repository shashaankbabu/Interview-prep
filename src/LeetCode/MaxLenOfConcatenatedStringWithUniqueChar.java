package LeetCode;
import java.util.*;

class MaxLenOfConcatenatedStringWithUniqueChar {
    int maxLen = 0;
    public int maxLength(List<String> arr) {
        backtracking(arr, 0, new StringBuilder(), new HashSet<Character>());
        return maxLen;
    }
    private void backtracking(List<String> arr, int start, StringBuilder sb, HashSet<Character> set) {
        if (sb.length() > maxLen) maxLen = sb.length();
        for (int i = start; i < arr.size(); i++) {
            boolean add = true;
            HashSet<Character> currSet = new HashSet<>();
            for (int j = 0; j < arr.get(i).length(); j++) {
                if (currSet.contains(arr.get(i).charAt(j)) || set.contains(arr.get(i).charAt(j))) add = false;
                currSet.add(arr.get(i).charAt(j));
            }
            if (add) {
                sb.append(arr.get(i));
                set.addAll(currSet);
                backtracking(arr, i + 1, new StringBuilder(sb), set);
                set.removeAll(currSet);
                sb.setLength(sb.length() - arr.get(i).length());
            }
        }
    }
}