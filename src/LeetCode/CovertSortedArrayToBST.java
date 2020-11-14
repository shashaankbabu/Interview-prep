package LeetCode;

class CovertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums == null || nums.length == 0) return null;

        return convertBSTRecursive(nums, 0, nums.length-1);
    }

    private TreeNode convertBSTRecursive(int[] nums, int left, int right) {
        if(left > right) return null;

        int mid = left + (right-left) / 2;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = convertBSTRecursive(nums, left, mid-1);
        current.right = convertBSTRecursive(nums, mid+1, right);
        return current;
    }
}