package LeetCode;
import java.util.*;

class MinCostToCutStick {
    public int minCost(int n, int[] cut){
        int[][] memo=new int[2+cut.length][2+cut.length];

        Arrays.sort(cut);
        int[] cuts = new int[cut.length + 2];
        System.arraycopy(cut, 0, cuts, 1, cut.length);
        cuts[cuts.length-1] = n;

        for(int len=2; len<cuts.length; len++){
            for(int row=0; row+len<cuts.length; row++){
                int col=row+len;
                int val=Integer.MAX_VALUE;
                for(int k=row+1; k<col; k++)
                    val=Math.min(val,memo[row][k]+memo[k][col]);
                memo[row][col]=cuts[col]-cuts[row]+val;
            }
        }
        return memo[0][memo[0].length-1];
    }
}