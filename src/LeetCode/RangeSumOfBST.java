package LeetCode;

class RangeSumOfBST {
    int result;
    public int rangeSumBST(TreeNode root, int low, int high) {
        result = 0;
        dfs(root, low, high);
        return result;
    }

    public void dfs(TreeNode node, int low, int high) {
        if(node != null) {
            if(low <= node.val && node.val <= high)
                result += node.val;
            if(low < node.val)
                dfs(node.left, low, high);
            if(node.val < high)
                dfs(node.right, low, high);
        }
    }
}