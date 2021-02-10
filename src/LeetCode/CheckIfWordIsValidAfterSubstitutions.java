package LeetCode;
import java.util.*;

class CheckIfWordIsValidAfterSubstitutions {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        Character x;

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == 'c' && stack.empty() == false) {
                x = stack.pop();
                if(x == 'b' && stack.empty() == false) {
                    x = stack.pop();
                    if(x != 'a') stack.push(x);
                } else stack.push(x);
            } else stack.push(s.charAt(i));
        }

        if(stack.empty() == true){
            return true;
        } else return false;
    }
}