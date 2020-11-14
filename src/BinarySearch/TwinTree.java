package BinarySearch;

import java.util.*;

class TwinTree {
    public boolean solve(Tree root0, Tree root1) {
        if(root0 == null && root1 == null) return true;
        else if(root0 != null && root1 == null || root0 == null && root1 != null) return false;
        else if(root0.val == root1.val && solve(root0.left,root1.left) && solve(root0.right,root1.right)) return true;
        return false;
    }
}