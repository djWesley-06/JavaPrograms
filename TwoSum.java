import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers.length == 0) {
            return new int[]{};
        }
        int s = 0;
        int e = numbers.length - 1;
        while(s<e){
            int sum = numbers[s]+numbers[e];
            if(sum==target)
                return new int[]{s+1,e+1};
            else if(sum>target)
                e--;
            else s++;
        }
        return new int[]{};
    }

    public int[] twoSum2(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int diff = target - nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }
}
