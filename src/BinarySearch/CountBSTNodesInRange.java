package BinarySearch;

import java.util.*;

class CountBSTNodesInRange {
    int count = 0;
    public int solve(Tree root, int lo, int hi) {
        if(root == null) return 0;
        if(root.left != null) solve(root.left, lo, hi);
        if(root.val >= lo && root.val <= hi) count++;
        if(root.right != null) solve(root.right, lo, hi);
        return count;
    }
}