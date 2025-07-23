import java.util.Arrays;

public class SquaresofSortedArray {
    //bruteforce
    public int[] sortedSquares(int[] nums) {
        if(nums.length==0){
            return new int[]{};
        }
        for(int i = 0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
