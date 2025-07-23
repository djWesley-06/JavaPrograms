import java.util.Arrays;

public class MaxProduct {
    public int maxProduct(int[] nums) {

        Arrays.sort(nums);
        if(nums[0]<0 && nums[1]<0){
            return Math.max(((nums[0]-1)*(nums[1]-1)),((nums[nums.length-1]-1)*(nums[nums.length-2]-1)));
        }
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);

    }
}
