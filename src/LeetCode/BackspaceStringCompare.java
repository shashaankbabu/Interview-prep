package LeetCode;
import java.util.*;

class BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return helper(S).equals(helper(T));
    }

    private String helper(String S) {
        Stack<Character> stack = new Stack<>();
        for(char c : S.toCharArray()) {
            if(c != '#') stack.push(c);
            else if(!stack.isEmpty()) stack.pop();
        }

        return String.valueOf(stack);
    }
}