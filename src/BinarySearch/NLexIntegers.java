package BinarySearch;

import java.util.*;

class NLexIntegers {
    public int[] solve(int n) {
        List<String> list = new ArrayList<>();
        int[] result = new int[n];
        for(int i=1; i<=n; i++){
            list.add(String.valueOf(i));
        }

        Collections.sort(list);
        for(int j=0; j<n; j++) {
            result[j] = Integer.valueOf(list.get(j));
        }

        return result;
    }
}