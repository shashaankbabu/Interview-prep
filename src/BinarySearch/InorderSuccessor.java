package BinarySearch;

import java.util.*;

class InorderSuccessor {
    public int solve(Tree root, int t) {
        Stack<Tree> s = new Stack();
        Tree curr=root;
        while(curr !=null || s.size()>0) {
            while(curr!=null){
                s.push(curr);
                curr=curr.left;
            }
            curr = s.pop();
            if(curr.val > t) return curr.val;
            curr = curr.right;
        }
        return 0;
    }
}