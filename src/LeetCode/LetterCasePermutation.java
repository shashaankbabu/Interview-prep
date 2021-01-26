package LeetCode;
import java.util.*;

class LetterCasePermutation {
    List<String> result = new ArrayList<>();

    public List<String> letterCasePermutation(String S) {
        permute(S.toCharArray(), 0);
        return result;
    }

    private void permute(char[] word, int index) {
        if (index == word.length) {
            result.add(new String(word));
        } else if (Character.isDigit(word[index])) {
            permute(word, index + 1);
        } else {
            word[index] = Character.toUpperCase(word[index]);
            permute(word, index + 1);
            word[index] = Character.toLowerCase(word[index]);
            permute(word, index + 1);
        }
    }
}