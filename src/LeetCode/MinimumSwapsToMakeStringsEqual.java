package LeetCode;

class MinimumSwapsToMakeStringsEqual {
    public int minimumSwap(String s1, String s2) {
        int x1=0, y1=0, x2=0, y2=0;
        int ans=0;

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)!=s2.charAt(i)) {
                if(s1.charAt(i) == 'x') x1++;
                else y1++;
                if(s2.charAt(i) == 'x') x2++;
                else y2++;
            }
        }

        if((x1+x2)%2!=0 || (y1+y2)%2!=0) return -1;
        if(x1%2!=0) ans+=1 + (x1+y1)/2;
        else ans=(x1+y1)/2;
        return ans;
    }
}