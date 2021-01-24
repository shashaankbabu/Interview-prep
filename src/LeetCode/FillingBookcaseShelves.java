package LeetCode;

class FillingBookcaseShelves {
    private int b[][];
    private int[] memo;
    public int minHeightShelves(int[][] books, int shelf_width) {
        b = books;
        memo = new int[b.length+1];
        int r = dp(shelf_width, 0);
        return r;
    }

    private int dp(int sw, int i) {
        if(i>= b.length)
            return 0;

        if(memo[i] != 0)
            return memo[i];

        int ch = b[i][1];
        if(i == b.length-1)
            return ch;

        int cw = sw;
        int ans = 1000000;
        for(int k=i; k<b.length && (cw-b[k][0])>=0; k++) {
            cw -= b[k][0];
            ch = Math.max(ch, b[k][1]);
            ans = Math.min(ans, ch + dp(sw, k+1));
        }

        memo[i] = ans;
        return ans;
    }
}