package BinarySearch;

import java.util.*;

class KthSmallestInBST {
    public ArrayList<Integer> inorder(Tree root, ArrayList<Integer> array) {
        if(root == null) return array;
        inorder(root.left, array);
        array.add(root.val);
        inorder(root.right, array);
        return array;
    }

    public int solve(Tree root, int k) {
        ArrayList<Integer> list = inorder(root, new ArrayList<Integer>());
        return list.get(k);
    }
}
