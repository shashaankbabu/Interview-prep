package LeetCode;

class CountServersThatCommunicate {
    public int countServers(int[][] grid) {
        int total = 0;
        int single = 0;

        int m = grid.length;
        int n = grid[0].length;

        int[] row = new int[m];
        int[] col = new int[n];

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 1) {
                    total++;
                    row[i]++;
                    col[j]++;
                }
            }
        }

        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(grid[i][j] == 1) {
                    if(row[i] == 1 && col[j] == 1) single++;
                }
            }
        }

        return total - single;
    }
}