import java.util.Arrays;

public class FindSingle {
    public int singleNumber(int[] nums) {

        int dup = nums[0];
        for(int i = 1;i<nums.length;i++){
            dup^=nums[i];
        }
        return dup;
    }
}
