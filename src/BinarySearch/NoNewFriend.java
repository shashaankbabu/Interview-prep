package BinarySearch;

import java.util.*;

class NoNewFriend {
    public boolean solve(int n, int[][] friends) {
        Set<Integer> set = new HashSet<>();

        for(int i=0; i<friends.length; i++) {
            for(int j=0; j<friends[i].length; j++) {
                set.add(friends[i][j]);
            }
        }

        if(set.size() == n) return true;
        return false;
    }
}