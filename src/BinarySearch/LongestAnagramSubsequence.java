package BinarySearch;

import java.util.*;

class LongestAnagramSubsequence {
    public int solve(String a, String b) {
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for(int i=0; i<a.length(); i++) arr1[(int)a.charAt(i) - (int)'a']++;
        for(int j=0; j<b.length(); j++) arr2[(int)b.charAt(j) - (int)'a']++;

        int result = 0;
        for(int k=0; k<26; k++) result = result + Math.min(arr1[k], arr2[k]);

        return result;
    }
}