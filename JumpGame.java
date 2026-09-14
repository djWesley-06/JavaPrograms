public class JumpGame {
    public boolean canJump(int[] nums) {

        int i = 0;
        int step = 0;
//        while(i<nums.length){
//            step = nums[i];
//
//            if(step==0){
//                return false;
//            }
//            else if(step+i > nums.length-1){
//                return true;
//            }
//            i+=step;
//        }

        while(i<nums.length){
            step = nums[i];
            if(nums[step]==0 && step != nums.length-1){
                return false;
            }
            i+=step;
        }
        return true;
    }
}
