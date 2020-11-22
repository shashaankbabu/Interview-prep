package LeetCode;
import java.util.*;

class LengthLongestSubstringWithoutRepetition {
    public int lengthOfLongestSubstring(String s) {
        int aPointer = 0;
        int bPointer = 0;

        HashSet<Character> hashSet = new HashSet();
        int max = 0;

        while(bPointer < s.length()){
            if(!hashSet.contains(s.charAt(bPointer))){
                hashSet.add(s.charAt(bPointer));
                bPointer++;
                max = Math.max(hashSet.size(), max);
            } else {
                hashSet.remove(s.charAt(aPointer));
                aPointer++;
            }
        }
        return max;
    }
}