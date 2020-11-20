package LeetCode;

class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        int start = 0, rows = matrix.length, cols = matrix[0].length;
        int end = cols * rows - 1;

        while(start<=end) {
            int mid = start + (end-start) / 2;
            if(matrix[mid/cols][mid%cols] == target) return true;
            if(matrix[mid/cols][mid%cols] < target) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }
}