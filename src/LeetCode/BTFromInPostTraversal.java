package LeetCode;

class BTFromInPostTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(inorder, inorder.length-1, 0, postorder, postorder.length-1);
    }

    private TreeNode helper(int[] inorder, int inStart, int inEnd, int[] postorder,
                            int postStart) {
        if (postStart < 0 || inStart < inEnd)
            return null;

        //The last element in postorder is the root.
        TreeNode root = new TreeNode(postorder[postStart]);

        //find the index of the root from inorder. Iterating from the end.
        int rIndex = inStart;
        for (int i = inStart; i >= inEnd; i--) {
            if (inorder[i] == postorder[postStart]) {
                rIndex = i;
                break;
            }
        }
        //build right and left subtrees. Again, scanning from the end to find the sections.
        root.right = helper(inorder, inStart, rIndex + 1, postorder, postStart-1);
        root.left = helper(inorder, rIndex - 1, inEnd, postorder, postStart - (inStart - rIndex) -1);
        return root;
    }
}