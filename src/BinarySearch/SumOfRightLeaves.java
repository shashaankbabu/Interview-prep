package BinarySearch;

import java.util.*;

class SumOfRightLeaves {
    int sum = 0;
    public int solve(Tree root) {
        if(root == null) return 0;
        if(root.right != null)
            if(root.right.left == null && root.right.right == null) sum = sum + root.right.val;
        solve(root.left);
        solve(root.right);

        return sum;
    }
}