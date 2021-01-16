package LeetCode;
import java.util.*;

class SubstringWithConcatenationOfAllWords {
    public List<Integer> findSubstring(String s, String[] words) {
        int l = words[0].length();
        int k = words.length*l;
        Map<String, Integer> dict = new HashMap<>();
        for(String s1 : words){
            dict.put(s1, dict.getOrDefault(s1, 0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<=(s.length()-k); i++){
            if(compareWords(s.substring(i, i+k), dict, l, k))
                res.add(i);
        }
        return res;
    }

    public Boolean compareWords(String s, Map<String, Integer> words, int l, int k){
        Map<String, Integer> tempMap = new HashMap<>();
        for(int i=0; i<s.length(); i=i+l){
            tempMap.put(s.substring(i, i+l), tempMap.getOrDefault(s.substring(i, i+l), 0)+1);
        }
        for(Map.Entry<String, Integer> entry : words.entrySet()){
            if(!tempMap.containsKey(entry.getKey()) || tempMap.get(entry.getKey())!=(int)entry.getValue())
                return false;
        }
        return true;
    }
}