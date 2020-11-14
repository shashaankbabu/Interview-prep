package LeetCode;
import java.util.*;

class GenerateParanthesis {
    public List<String> generateParenthesis(int n) {
        List<String> outputArray = new ArrayList();
        backtrack(outputArray, "", 0, 0, n);
        return outputArray;
    }

    public void backtrack(List<String> outputArray, String currentString, int open, int close, int max) {
        if(currentString.length() ==  max * 2) {
            outputArray.add(currentString);
            return;
        }

        if(open < max) backtrack(outputArray, currentString + '(', open+1, close, max);
        if(close < open) backtrack(outputArray, currentString + ')', open, close+1, max);
    }
}