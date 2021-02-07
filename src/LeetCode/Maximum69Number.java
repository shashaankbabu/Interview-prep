package LeetCode;

class Maximum69Number {
    boolean flag = false;
    public int maximum69Number (int num) {
        return recursive(num, 1);
    }

    private int recursive(int num, int ten) {
        if(num/ten == 0) return num;

        int result = recursive(num, ten*10);
        if(result/ten%10 == 6 && flag == false) {
            result = result+3*ten;
            flag = true;
        }
        return result;
    }
}