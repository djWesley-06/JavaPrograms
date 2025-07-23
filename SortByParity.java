import java.util.ArrayList;
import java.util.Arrays;

public class SortByParity {
    public int[] sortArrayByParity(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0)
            return new int[]{};
        if(nums.length==1)
            return nums;
        ArrayList<Integer>list = new ArrayList<>();
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==0)
                list.add(nums[i]);
        }
        for(int i =0;i<nums.length;i++){
            if(nums[i]%2==1)
                list.add(nums[i]);
        }
        int[] arr = new int[list.size()];
        for(int i=0;i<arr.length;i++){
            arr[i]=list.get(i);
        }
        return arr;

    }
    public int[] sortByParity2(int[] nums) {
        if (nums.length == 0)
            return new int[]{};

        for (int i = 0; i < nums.length-1; i++) {
            if(i%2==0) {
                if(nums[i]%2!=0){
                    for(int j = i+1; j<nums.length;j++){
                        if(nums[j]%2==0){
                            int temp = nums[i];
                            nums[i]=nums[j];
                            nums[j]=temp;
                            break;
                        }
                    }
                }
            }
            if(i%2==1) {
                if(nums[i]%2!=1){
                    for(int j = i+1; j<nums.length;j++){
                        if(nums[j]%2==1){
                            int temp = nums[i];
                            nums[i]=nums[j];
                            nums[j]=temp;
                            break;
                        }
                    }
                }
            }
        }

        return nums;
    }
    //optimized solution
    public int[] sortArrayByParityOptimized(int[] nums) {
        int[] ans = new int[nums.length];
        int i = 0, j = 1;
        for(int num : nums){
            if(num%2 == 0){
                ans[i] = num;
                i += 2;
            }else{
                ans[j] = num;
                j += 2;
            }
        }
        return ans;
    }
}
