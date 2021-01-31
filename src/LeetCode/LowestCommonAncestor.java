package LeetCode;

class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = helper(root, p, q);
        return node;
    }

    private TreeNode helper(TreeNode node, TreeNode p, TreeNode q) {
        if(node == null) return null;

        if(node.val == p.val || node.val == q.val) return node;

        TreeNode left = helper(node.left, p, q);
        TreeNode right = helper(node.right, p, q);

        if(left != null && right != null) return node;
        else if(left != null) return left;
        else return right;
    }
}