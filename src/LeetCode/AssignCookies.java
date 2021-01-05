package LeetCode;
import java.util.*;

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i = g.length - 1;
        int j = s.length - 1;

        while(i>=0 && j>=0) {
            if(s[j] >= g[i]) {
                count++;
                i--;
                j--;
            } else {
                i--;
            }
        }
        return count;
    }
}