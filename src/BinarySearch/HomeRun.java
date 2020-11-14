package BinarySearch;

import java.util.*;

class HomeRun {
    public int solve(int n) {
        int count = 0;

        while(n != 0) {
            n = (n & (n << 1));
            count++;
        }

        return count;
    }
}