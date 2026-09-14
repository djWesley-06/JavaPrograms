public class Robber {
    //Thou shall not steal
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==1)
            return nums[0];
        int[] t = new int[nums.length];
        t[0]=nums[0];
        t[1]=Math.max(nums[0],nums[1]);
        for(int i = 2;i<nums.length;i++){
            t[i] = Math.max(t[i-1], nums[i]+t[i-2]);
        }
        return t[n-1];
    }
}
