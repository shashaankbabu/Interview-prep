package LeetCode;

class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder current = new StringBuilder("1");
        StringBuilder previous;
        int count;
        char say;
        for(int i=1; i<n; i++) {
            previous = current;
            current = new StringBuilder();
            count = 1;
            say = previous.charAt(0);

            for(int j=1, len=previous.length(); j<len; j++) {
                if(previous.charAt(j) != say) {
                    current.append(count).append(say);
                    count = 1;
                    say = previous.charAt(j);
                } else count++;
            }
            current.append(count).append(say);
        }
        return current.toString();
    }
}