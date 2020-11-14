package LeetCode;

class TrappingRainWater {
    public int trap(int[] height) {
        int aPointer=0;
        int bPointer=height.length-1;
        int max=0;
        int leftMax=0;
        int rightMax=0;
        while(aPointer<=bPointer) {
            leftMax=Math.max(leftMax,height[aPointer]);
            rightMax=Math.max(rightMax,height[bPointer]);
            if(leftMax<rightMax) {
                max+=(leftMax-height[aPointer]);
                aPointer++;
            }
            else {
                max+=(rightMax-height[bPointer]);
                bPointer--;
            }
        }
        return max;
    }
}