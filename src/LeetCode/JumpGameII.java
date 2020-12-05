package LeetCode;

class JumpGameII {
    public int jump(int[] nums) {
        int jump = 0;
        for(int i=0, reach=0, boundary=0; i<nums.length; i++) {
            if(i>boundary) {
                jump++;
                boundary = reach;
            }
            reach = Math.max(reach, nums[i] + i);
        }
        return jump;
    }
}