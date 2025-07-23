import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class CountNumbersSmallerThanCurrent {
    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] copy = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copy);
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<copy.length;i++){
            map.putIfAbsent(copy[i],i);
        }
        int[] res = new int[nums.length];
        for(int i =0;i<nums.length;i++){
            res[i]=map.get(nums[i]);
        }
        return res;
    }
}
