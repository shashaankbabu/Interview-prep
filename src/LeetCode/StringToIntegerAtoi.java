package LeetCode;

class StringToIntegerAtoi {
    public int myAtoi(String s) {
        int startindex = 0;
        s = s.trim();
        if(s == null || s.length() == 0) {
            return 0;
        }

        double result = 0;
        boolean isNegative = false;

        if(s.charAt(0) == '+' || s.charAt(0)  == '-') ++startindex;

        if(s.charAt(0) == '-') isNegative = true;

        for(int i = startindex; i< s.length(); i++) {
            if(s.charAt(i) < '0' || s.charAt(i) > '9') break;
            int digitvalue = (int)(s.charAt(i) - '0');
            result = result*10 + digitvalue;
        }

        if(isNegative) {
            result = -result;
        }

        if(result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        if(result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        return (int)result;

    }
}