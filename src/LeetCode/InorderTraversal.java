package LeetCode;
import java.util.*;

class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        TreeNode current = root;
        while(current != null) {
            if(current.left != null) {
                TreeNode present = current.left;
                while((present.right != null) && (present.right != current)) {
                    present = present.right;
                }
                if(present.right == null) {
                    present.right = current;
                    current = current.left;
                } else {
                    present.right = null;
                    nodes.add(current.val);
                    current = current.right;
                }
            } else {
                nodes.add(current.val);
                current = current.right;
            }
        }
        return nodes;
    }
}