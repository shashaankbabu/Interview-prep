package LeetCode;

class NQueensII {
    private int total = 0;
    public int totalNQueens(int n) {
        int[] queens = new int[n];
        return totalNQueens(queens, 1);
    }

    private int totalNQueens(int[] queens, int seq) {
        int total = 0;
        for(int i = 0; i < queens.length; i++) {
            if((queens[seq - 1] & (1 << i)) == 0) {
                if(seq == queens.length) {
                    total += 1;
                } else {
                    int[] stash = new int[queens.length - seq];
                    for(int j = seq; j < queens.length; j++) {
                        stash[j - seq] = queens[j];
                        queens[j] |= 1 << i;
                        queens[j] |= 1 << (i + 1 + j - seq);
                        queens[j] |= (1 << i) >> (1 + j - seq);
                    }
                    total += totalNQueens(queens, seq + 1);
                    for(int j = seq; j < queens.length; j++) {
                        queens[j] = stash[j - seq];
                    }
                }
            }
        }
        return total;
    }
}