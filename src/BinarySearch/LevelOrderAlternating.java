package BinarySearch;

import java.util.*;

class LevelOrderAlternating {
    public int[] solve(Tree root) {
        Queue<Tree> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> list = new LinkedList<>();
        boolean zig = false;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> temp = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                Tree curr = queue.poll();
                temp.add(curr.val);
                if (curr.left != null) queue.offer(curr.left);
                if (curr.right != null) queue.offer(curr.right);
            }

            if (zig) Collections.reverse(temp);
            zig = !zig;
            list.addAll(temp);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}